package com.clinicapplication.entity;

import java.io.Serializable;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 09-Jun-2018
 */

public class Doctor implements Serializable {

    @Override
    public String toString() {
	return "Doctor [name=" + name + ", id=" + id + ", specialization=" + specialization + ", availability="
		+ availability + ", countOfPatients=" + countOfPatients + "]";
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public Doctor() {
    }// DEFAULT CONSTRUCTOR

    private String name;
    private int id;
    private String specialization;
    private String availability;
    private int countOfPatients;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getSpecialization() {
	return specialization;
    }

    public void setSpecialization(String specialization) {
	this.specialization = specialization;
    }

    public String getAvailability() {
	return availability;
    }

    public void setAvailability(String availability) {
	this.availability = availability;
    }

    public int getCountOfPatients() {
	return countOfPatients;
    }

    public void setCountOfPatients(int countOfPatients) {
	this.countOfPatients = countOfPatients;
    }

}
