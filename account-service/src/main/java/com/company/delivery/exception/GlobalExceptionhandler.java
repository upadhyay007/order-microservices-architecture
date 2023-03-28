package com.company.delivery.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionhandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> exceptionHander(Exception exception, WebRequest request) {
		ErrorMessageObject errorMessageObject = new ErrorMessageObject(new Date(), exception.getLocalizedMessage());
		System.out.println("Gloabl Exception !!");
		return new ResponseEntity<Object>(errorMessageObject, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<Object> handerNullPonterException(NullPointerException exception, WebRequest request) {
		ErrorMessageObject errorMessageObject = new ErrorMessageObject(new Date(), exception.getLocalizedMessage());
		System.out.println("handerNullPonterException !!");
		return new ResponseEntity<Object>(errorMessageObject, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserNotFountException.class)
	public ResponseEntity<Object> handerUserNotFountException(UserNotFountException exception, WebRequest request) {
		ErrorMessageObject errorMessageObject = new ErrorMessageObject(new Date(), exception.getLocalizedMessage());
		System.out.println("handerUserNotFountException !!");
		return new ResponseEntity<Object>(errorMessageObject, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
