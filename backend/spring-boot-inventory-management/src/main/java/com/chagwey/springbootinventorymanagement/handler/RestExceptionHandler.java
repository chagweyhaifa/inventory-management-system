package com.chagwey.springbootinventorymanagement.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.chagwey.springbootinventorymanagement.exception.EntityNotFoundException;
import com.chagwey.springbootinventorymanagement.exception.InvalidEntityException;

import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ErrorDTO> handleException(EntityNotFoundException exception, WebRequest webRequest) {

		final HttpStatus notFound = HttpStatus.NOT_FOUND;
		final ErrorDTO errorDTO = ErrorDTO.builder()
				.httpStatusCode(notFound.value())
				.errorCode(exception.getErrorCode()) // errorCode = A000
				.message(exception.getMessage())
				.build();
		return new ResponseEntity<>(errorDTO, notFound); // ResponseEntity<>(ErrorDTO, HttpStatus);
	}

	@ExceptionHandler(InvalidEntityException.class)
	public ResponseEntity<ErrorDTO> handleException(InvalidEntityException exception, WebRequest webRequest) {
// exception contains the message, the errorCode and the list of errors
		final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		final ErrorDTO errorDTO = ErrorDTO.builder()
				.httpStatusCode(badRequest.value())
				.errorCode(exception.getErrorCode()) // errorCode = A001
				.message(exception.getMessage())
				.errors(exception.getErrors())
				.build();
		return new ResponseEntity<>(errorDTO, badRequest); 
	}
}