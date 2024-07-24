package com.incedo.error;



import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class HandleException { //--->The purpose of this class is to always observe the exception
	@ResponseBody //---if any exception is encountered this class will execute..map the exception and throw some msg
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value= {Exception.class})
	public ErrorMapper handleError(Exception e,HttpServletRequest request)
	{
		return new ErrorMapper(request.getRequestURI().toString(),e.getMessage(),LocalDate.now());
	}//--->e will map exception that occurs,httpservletrequest gives the url requested by client
}
