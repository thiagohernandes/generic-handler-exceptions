package com.generic.handler.filter;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.generic.handler.dto.ErrorDetails;
import com.generic.handler.filter.exceptions.ExceptionNotFound;
import com.generic.handler.filter.exceptions.ExceptionUnauthorized;
 
@ControllerAdvice
public class FilterConfig extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Exception.class)
  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(Exception ex, WebRequest request) {
	 if (ex instanceof ExceptionUnauthorized) {
		  return new ResponseEntity<>(new ErrorDetails(new Date(), ex.getMessage(),
			      request.getDescription(false), 401), HttpStatus.UNAUTHORIZED);
	 } else if (ex instanceof ExceptionNotFound) {
		 	return new ResponseEntity<>(new ErrorDetails(new Date(), ex.getMessage(),
			      "Rota inexistente", 404), HttpStatus.NOT_FOUND);
	 } else {
	  ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
		      request.getDescription(false), 501);
		  return new ResponseEntity<>(errorDetails, HttpStatus.NOT_IMPLEMENTED);
     }
  }
 }