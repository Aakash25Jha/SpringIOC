package com.aakash.spring;

public class Address 
{
	
	private String street;
	private String city;
	private String state;
	private String Country;
	
	public Address(String street, String city, String state, String country) {
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.Country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", Country=" + Country + "]";
	}
	
	
}
