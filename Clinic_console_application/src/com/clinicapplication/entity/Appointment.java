package com.clinicapplication.entity;

import java.io.Serializable;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 09-Jun-2018
 */

public class Appointment implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String patientName;
    private String doctorName;
    private int doctorId;
    private int patietnId;
    private String timeStamp;
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public int getPatietnId() {
        return patietnId;
    }
    public void setPatietnId(int patietnId) {
        this.patietnId = patietnId;
    }
    public String getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
     
    
}
