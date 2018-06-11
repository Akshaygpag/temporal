package com.clinicapplication.util;

import java.io.File;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 11-Jun-2018
 */

public interface UtilityInterface {
String PATH="/home/bridgeit/AkshayWork/Clinic console application/src/com/clinicapplication/resources";
String DOCTOR_FILE="/Doctors.json";
String PATIENTS_FILE="/Patients.json";
File doctorFile=new File(UtilityInterface.PATH + UtilityInterface.DOCTOR_FILE);
File patientsFile=new File(UtilityInterface.PATH + UtilityInterface.PATIENTS_FILE);



}
