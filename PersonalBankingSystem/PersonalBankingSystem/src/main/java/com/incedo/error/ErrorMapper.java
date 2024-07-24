package com.incedo.error;

import java.time.LocalDate;

public class ErrorMapper {
	
	private String url;
	private String msg;
	private LocalDate dob;

	
	public ErrorMapper(String url, String msg, LocalDate dob) {
		super();
		this.url = url;
		this.msg = msg;
		this.dob = dob;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	

}
