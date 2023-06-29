package com.IET.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="IETStudent")

public class Student {
	
	@Id
	@Column(name="prn")
	private int prn;
	private String uname;
	private String firstname;
	private String lastname;
	private String mobille;
	private String email;
	
	public Student() {
		super();
	}

	public Student(int prn, String uname, String firstname, String lastname, String mobille, String email) {
		super();
		this.prn = prn;
		this.uname = uname;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobille = mobille;
		this.email = email;
	}

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobille() {
		return mobille;
	}

	public void setMobille(String mobille) {
		this.mobille = mobille;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [prn= " + prn + ", uname= " + uname + ", firstname= " + firstname + ", lastname= " + lastname
				+ ", mobille= " + mobille + ", email= " + email + "]";
	}
	
     

}
