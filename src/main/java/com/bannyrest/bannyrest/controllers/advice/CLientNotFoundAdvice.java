package com.bannyrest.bannyrest.controllers.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bannyrest.bannyrest.exceptions.ClientNotFoundException;

@ControllerAdvice
public class CLientNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(ClientNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String clientNotFoundHandler(ClientNotFoundException ex) {
		return ex.getMessage();
	}
}
