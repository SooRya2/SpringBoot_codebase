package com;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private long zip;
	private String country;
	
	public Address() {
		
	}
	
	public Address(String city)
	{
		this.city=city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
