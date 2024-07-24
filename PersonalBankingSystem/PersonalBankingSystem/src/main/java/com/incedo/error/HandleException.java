package com.incedo.error;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;


@ControllerAdvice
public class HandleException {
	@ResponseBody
	@ExceptionHandler(value= {Exception.class})
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public ErrorMapper HandleError(Exception e,HttpServletRequest request)
	{
		return new ErrorMapper(request.getRequestURI().toString(),e.getMessage(),LocalDate.now());
	}

}
