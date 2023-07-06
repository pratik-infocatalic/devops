package com.tcs.employeeManagerApp.exceptions;

public class UserNotFoundException extends RuntimeException{
	public  UserNotFoundException(String message) {
		super(message);
}

}
