package com.company.delivery.exception;

import java.util.Date;

public class ErrorMessageObject {
	private Date timestamp;
	private String string;
	

	public ErrorMessageObject(Date timestamp, String string) {
		super();
		this.timestamp = timestamp;
		this.string = string;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
