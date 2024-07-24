package com.incedo.error;

public class EmployeeNotFoundException extends Exception { //-->Exception is a pre-defined class in java

	public EmployeeNotFoundException(String s)
	{
		super(s); //--->passing to the constructor of Exception class
	}
}
