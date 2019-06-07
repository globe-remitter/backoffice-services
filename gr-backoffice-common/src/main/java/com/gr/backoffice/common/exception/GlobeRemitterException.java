package com.gr.backoffice.common.exception;

import org.springframework.http.HttpStatus;

public class GlobeRemitterException extends RuntimeException {
	
	private static final long serialVersionUID = 2553779942063135152L;
	private HttpStatus httpStatus;
	private GlobeRemitterError error;

	public GlobeRemitterException(HttpStatus httpStatus, GlobeRemitterError error, Throwable cause) {
		super(cause);
		this.httpStatus = httpStatus;
		this.error = error;
	}
	public GlobeRemitterException(HttpStatus httpStatus, GlobeRemitterError error) {
		super(error.getErrorMessage());
		this.httpStatus = httpStatus;
		this.error = error;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public GlobeRemitterError getError() {
		return error;
	}
}
