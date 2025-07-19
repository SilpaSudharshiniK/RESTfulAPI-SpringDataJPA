package com.learn.datajpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	 @Id 
	 @GeneratedValue
	 private Long id;
	 private String city;
	 private String street;
	 
	 
	public Address(Long id, String city, String street) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
	}


	public Address() {
		super();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}
	 
	 
	 

}
