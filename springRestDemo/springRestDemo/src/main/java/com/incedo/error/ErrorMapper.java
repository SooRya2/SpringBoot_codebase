package com.incedo.error;

import java.time.LocalDate;

public class ErrorMapper { //--->used for sending JSON or XML data when error is encountered

	private String url;
	private String message;
	private LocalDate now;
	
	
	public ErrorMapper(String url, String message, LocalDate now) {
		super();
		this.url = url;
		this.message = message;
		this.now = now;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDate getNow() {
		return now;
	}
	public void setNow(LocalDate now) {
		this.now = now;
	}
	
}
