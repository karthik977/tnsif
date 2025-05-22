package com.tnsif.Intro;

public class ExceptionHandling {
	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0; // This will throw ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        } finally {
	            System.out.println("This always executes.");
	        }
	    }
	}


