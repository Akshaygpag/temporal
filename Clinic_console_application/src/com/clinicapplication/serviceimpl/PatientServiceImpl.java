package com.clinicapplication.serviceimpl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.clinicapplication.entity.Appointment;
import com.clinicapplication.entity.Doctor;
import com.clinicapplication.entity.Patient;
import com.clinicapplication.service.PatientService;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 09-Jun-2018
 */

public class PatientServiceImpl implements PatientService {

    public PatientServiceImpl() {// DEAFAULT CONSTRUCTOR

	// if the patients are not present then create new arraylist else use existing
	// file values

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.clinicapplication.service.PatientService#takeAppointment()
     */
    @Override
    public Appointment takeAppointment(Patient patient, Doctor doctor) {
	// bridgeit
	return null;
    }

    /*
     * PRINTS ALL THE PATIENTS DETAILS IN FORMATTED WAY
     * 
     * @see com.clinicapplication.service.PatientService#showPatients()
     */
    @Override
    public void showPatients(List<Patient> allPatients) {
	System.out.println("-------All Patient details---------");
	allPatients.stream().forEach(System.out::println);
	System.out.println("-----------------------------------");
    }

    /*
     * SEARCH THE PATIENT BY THEIR NAME
     * 
     * @see
     * com.clinicapplication.service.PatientService#searchPatientsByName(java.lang.
     * String)
     */
    @Override
    public List<Patient> searchPatientsByName(String name, List<Patient> allPatients) {

	List<Patient> searchedPatients = allPatients.stream().filter(p -> p.getName().equals(name))
		.collect(Collectors.toList());
	return searchedPatients;
    }

    /*
     * SEARCH THE PATIENTS BY THE MOBILE NUMBER
     * 
     * @see
     * com.clinicapplication.service.PatientService#searchPatientByMobileNumber(java
     * .lang.String)
     */
    @Override
    public Patient searchPatientByMobileNumber(String mobileNumber, List<Patient> allPatients) {

	Patient searchedPatients = allPatients.stream().filter(p -> p.getMobile().equals(mobileNumber)).findFirst()
		.get();
	return searchedPatients;

    }

    /*
     * SEARCH THE PATIENTS BY THE ID
     * 
     * @see com.clinicapplication.service.PatientService#searchPatientById(int)
     */
    @Override
    public Patient searchPatientById(int id, List<Patient> allPatients) {
	Patient patient = null;

	patient = allPatients.stream().filter(p -> p.getId() == id).findFirst().orElse(null);

	return patient;
    }

    /*
     * SHOW POPULAR DOCTORS  			****NEED TESTING**
     * 
     * @see com.clinicapplication.service.PatientService#showPopularDoctor()
     */
    @Override
    public Doctor showPopularDoctor(List<Appointment> allAppointments) {
	Map<Object, List<String>> mapPopularDoctors = allAppointments.stream().map(p -> p.getDoctorName())
		.collect(Collectors.groupingBy(p -> p));
	mapPopularDoctors.keySet().stream().forEach(System.out::println);
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.clinicapplication.service.PatientService#showPopularSpecilization()
     */
    @Override
    public String showPopularSpecilization(List<Appointment> allAppointments) {
	// bridgeit
	return null;
    }
}
