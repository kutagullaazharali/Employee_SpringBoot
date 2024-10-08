package org.jsp.emp.ExceptionClasses;

public class InvalidEmployeeIdException extends RuntimeException {
	private String message;

	public InvalidEmployeeIdException() {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
