package com.gr.backoffice.common.exception;

public class GlobeRemitterError {

	private int errorCode;
	private String errorMessage;

	public GlobeRemitterError(GlobeRemitterErrorCode appError) {
		this.errorCode = appError.getErrorCode();
		this.errorMessage = appError.getErrorMessage();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
