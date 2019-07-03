package com.generic.handler.filter.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ExceptionUnauthorized extends RuntimeException{

	 public ExceptionUnauthorized(String exception) {
	    super(exception);
	  }
}
