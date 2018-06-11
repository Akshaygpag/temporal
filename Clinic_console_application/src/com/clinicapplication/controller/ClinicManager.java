package com.clinicapplication.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.clinicapplication.entity.Appointment;
import com.clinicapplication.entity.Doctor;
import com.clinicapplication.entity.Patient;
import com.clinicapplication.service.Common;
import com.clinicapplication.service.DoctorService;
import com.clinicapplication.service.ManagerService;
import com.clinicapplication.service.PatientService;
import com.clinicapplication.serviceimpl.DoctorServiceImpl;
import com.clinicapplication.serviceimpl.ManagerServiceImpl;
import com.clinicapplication.serviceimpl.PatientServiceImpl;
import com.clinicapplication.util.Utility;
import com.clinicapplication.util.UtilityInterface;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 09-Jun-2018
 */

public class ClinicManager implements Common {
    private PatientService patient = new PatientServiceImpl();
    private DoctorService doctor = new DoctorServiceImpl();
    private ManagerService managerService = new ManagerServiceImpl();

    public static void main(String... args) throws JsonGenerationException, JsonMappingException, IOException {
	ClinicManager manager = new ClinicManager();

	// manager.managerService.addPatient(Utility.getpatient());
	boolean value = manager.managerService.addDoctor(Utility.getDoctor());
	System.out.println("Added success : " + value);
	Utility.writeToJSONFile(manager.managerService.getDoctors(), UtilityInterface.doctorFile);
	System.out.println("Complted writing");

	System.out.println("Enter the patient details");
	Patient detailsPatients = manager.patient.searchPatientById(Utility.getUserInteger(),
		manager.managerService.getPatients());

	if (detailsPatients == null) {

	    System.out.println("No patietns record found");

	}

	else {

	    System.out.println(detailsPatients);

	}
	while (true) {

	}

    }

    /**
     * 
     */
    private void clinicManagerDesk() {

	Patient patientDetails = null;
	System.out.println(
		"1.take appointment 2.Show all patients 3 Show patients by name 4. Show patients by mobile number 5. Show patients by ID 6 showPopularDoctor 7.showPopularSpecilization");
	int choice = Utility.getUserInteger();

	switch (choice) {
	case 1:
	    System.out.println("Taking appointment");
	    System.out.println("Enter the patient id");
	    Patient searchedPatient = patient.searchPatientById(Utility.getUserInteger(), managerService.getPatients());
	    System.out.println("Enter the doctor id");
	    Doctor searchedDoctor = doctor.searchDoctorById(Utility.getUserInteger(), managerService.getDoctors());
	    Appointment app = patient.takeAppointment(searchedPatient, searchedDoctor);
	    System.out.println("Appointment is ");
	    System.out.println(app);
	    break;
	case 2:
	    patient.showPatients(managerService.getPatients());
	    break;
	case 3:
	    System.out.println("Enter the name");
	    String name = Utility.getUserStringValue();
	    List<Patient> allpatients = patient.searchPatientsByName(name, managerService.getPatients());
	    allpatients.stream().forEach(System.out::println);
	    break;
	case 4:
	    System.out.println("Enter the Mobile number");
	    String mobileNumber = Utility.getUserStringValue();
	    patientDetails = patient.searchPatientByMobileNumber(mobileNumber, managerService.getPatients());
	    break;
	case 5:
	    int id = Utility.getUserInteger();
	    patientDetails = patient.searchPatientById(id, managerService.getPatients());
	    System.out.println(patientDetails);
	    break;
	case 6:

	    break;
	case 7:

	    break;

	default:

	    System.out.println("Invalid choice chosen");
	    System.exit(1);
	}
	return;
    }
}
