package com.gr.backoffice.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobeRemitterExceptionHandler {

	private static Logger LOGGER = LoggerFactory.getLogger(GlobeRemitterExceptionHandler.class);
	@ExceptionHandler(value = GlobeRemitterException.class)
	public ResponseEntity<GlobeRemitterError> getError(GlobeRemitterException e) {
		HttpStatus httpStatus = e.getHttpStatus();
		GlobeRemitterError error = e.getError();
		ResponseEntity<GlobeRemitterError> responseEntity = new ResponseEntity<GlobeRemitterError>(error,
				httpStatus);
		LOGGER.error("*********************");
		doLogging(error.getErrorMessage(), e);
		return responseEntity;
	}

	private void doLogging(String customErrorMsg, Throwable e)
	{
	  if(e!=null)
	  {
	  	LOGGER.error(customErrorMsg, e);
	  }
	}

}
