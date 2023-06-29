package com.IET.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="std")
public class Student {
	@Id
	private int sid;
	private String sname;
	@OneToOne
	@JoinColumn(name="addrid")
//	@JoinColumn(name="city")
	private Address addr;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.addr = addr;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", addr=" + addr + "]";
	}
	
	

}
