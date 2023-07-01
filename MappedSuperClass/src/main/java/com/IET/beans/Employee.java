package com.IET.beans;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name ="Emp03")
public class Employee extends Person {

	private String dept;
	private String degn;

	public Employee() {
		super();
	}

	public Employee(int pid, String pname, String address, String dept, String degn) {
		super(pid, pname, address);
		this.dept = dept;
		this.degn = degn;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDegn() {
		return degn;
	}

	public void setDegn(String degn) {
		this.degn = degn;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", degn=" + degn + "]";
	}

}
