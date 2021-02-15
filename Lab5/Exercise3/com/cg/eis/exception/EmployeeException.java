package com.cg.eis.exception;

public class EmployeeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeException(){
		super("salary of employee is below than 3000");
	}
	
}
