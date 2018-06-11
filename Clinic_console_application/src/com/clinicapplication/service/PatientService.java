package com.clinicapplication.service;

import java.util.List;

import com.clinicapplication.entity.Appointment;
import com.clinicapplication.entity.Doctor;
import com.clinicapplication.entity.Patient;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 09-Jun-2018
 */

public interface PatientService {

    Appointment takeAppointment(Patient patient,Doctor doctor);

    void showPatients(List<Patient> allPatients);

    List<Patient> searchPatientsByName(String name,List<Patient> allPatients);

    Patient searchPatientByMobileNumber(String mobileNumber,List<Patient> allPatients);

    Patient searchPatientById(int id,List<Patient> allPatients);

    Doctor showPopularDoctor(List<Appointment> allAppointments);

    String showPopularSpecilization(List<Appointment> allAppointments);

}
