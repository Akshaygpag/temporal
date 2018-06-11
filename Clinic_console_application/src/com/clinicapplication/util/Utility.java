package com.clinicapplication.util;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.clinicapplication.entity.Doctor;
import com.clinicapplication.entity.Patient;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 09-Jun-2018
 */

public class Utility {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * @return
     * 
     */
    public static int getUserInteger() {
	int data = scanner.nextInt();

	scanner.nextLine();
	return data;

    }

    /**
     * @return
     * 
     */
    public static String getUserStringValue() {
	return scanner.nextLine();
    }

    public static Patient getpatient() {

	Patient patient = new Patient();

	System.out.println("Enter patient name");
	patient.setName(Utility.getUserStringValue());
	System.out.println("Enter patient mobile number");
	patient.setMobile(Utility.getUserStringValue());
	System.out.println("Enter patient age");
	patient.setAge(Utility.getUserByte());
	return patient;

    }

    /**
     * @return
     */
    public static byte getUserByte() {
	byte data = scanner.nextByte();

	scanner.nextLine();
	return data;

    }

    /**
     * @return
     */
    public static Doctor getDoctor() {
	Doctor doctor = new Doctor();
	System.out.println("Enter Doctor name");
	doctor.setName(Utility.getUserStringValue());
	System.out.println("Enter Doctor Specialization");
	doctor.setSpecialization(Utility.getUserStringValue());
	System.out.println("Doctor Availability ");
	doctor.setAvailability(Utility.getUserStringValue());

	return doctor;
    }

    public static <T> void writeToJSONFile(List<T> list, File file)
	    throws JsonGenerationException, JsonMappingException, IOException {
	mapper.writeValue(file, list);
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> readFromJSONFile(File file, Class<T> className)
	    throws JsonParseException, JsonMappingException, IOException {
	try {
	    return (List<T>) mapper.readValue(file,mapper.getTypeFactory().constructCollectionType(List.class, className));
	} catch (EOFException e) {

	    return null;

	}
    }

}
