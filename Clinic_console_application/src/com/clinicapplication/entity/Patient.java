package com.clinicapplication.entity;

import java.io.Serializable;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 09-Jun-2018
 */

public class Patient implements Serializable {

    @Override
    public String toString() {
	return "Patient [name=" + name + ", id=" + id + ", mobile=" + mobile + ", age=" + age + "]";
    }
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public Patient() {}// DEFAULT CONSTRUCTOR
    private String name;
    private int id;
    private String mobile;
    private byte age;
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

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }

    public byte getAge() {
	return age;
    }

    public void setAge(byte age) {
	this.age = age;
    }

}
