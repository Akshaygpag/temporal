package com.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 11-Jun-2018
 */

public class Demo {

    public static void main(String[] args) {
	String expression = "[A-Z] {1}[a-zA-Z]*[0-9]{1}[a-zA-Z]*[$#@]{1}[a-zA-Z]*|[A-Z]{1}[a-zA-Z]*[$#@]{1}[a-zA-Z]*[0-9] {1}[a-zA-Z]*";
	String passord = "Akshay1@";
	Pattern patter = Pattern.compile(expression);
	Matcher matcher = patter.matcher(passord);
	System.out.println(matcher.matches());

    }
}
