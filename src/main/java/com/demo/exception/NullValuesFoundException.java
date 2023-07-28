package com.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;


public class NullValuesFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NullValuesFoundException(String message) {
		super(message);
	}
	
}
