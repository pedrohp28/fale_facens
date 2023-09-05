package com.projeto.falefacensserver.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date timestemp;
	private String message;
	private String datails;
	public ExceptionResponse(Date timestemp, String message, String datails) {
		this.timestemp = timestemp;
		this.message = message;
		this.datails = datails;
	}
	public Date getTimestemp() {
		return timestemp;
	}
	public String getMessage() {
		return message;
	}
	public String getDatails() {
		return datails;
	}
	
	
}
