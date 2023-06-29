package com.IET.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addr1")
public class Address {
	@Id
	private int pid;
	private String street;
	private String city;
	
	public Address() {
		
		super();
	}

	public Address(int pid, String street, String city) {
		super();
		this.pid = pid;
		this.street = street;
		this.city = city;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pid=" + pid + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
}