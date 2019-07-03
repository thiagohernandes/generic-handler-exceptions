package com.generic.handler.filter.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
public class ExceptionNotImplemented extends RuntimeException{
	
	public ExceptionNotImplemented(String exception) {
	    super(exception);
	  }
}
