package com.example.teachernew.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.teachernew.dto.ResponseDto;
import com.example.teachernew.exception.TeacherNotFoundException;

@RestControllerAdvice
public class CustomException 
{
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(TeacherNotFoundException.class)
	public ResponseDto customException(TeacherNotFoundException texce)
	{
		return new ResponseDto(404,"Error",texce.getMessage());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(Exception.class)
	public ResponseDto customexception1(Exception texce)
	{
		return new ResponseDto(404,"Error",texce.getMessage());
	}

}
