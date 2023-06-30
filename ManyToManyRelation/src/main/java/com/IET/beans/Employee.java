package com.IET.beans;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp2")

public class Employee {
	@Id
	private int eid;
	private String ename;
	@ManyToMany
//	@JoinTable(name="epm_pro",joinColumns= {@JoinColumn(name="e_eid")},inverseJoinColumns= {@JoinColumn()})
	
	@JoinTable(name="emp_proj11",joinColumns= {@JoinColumn(name="e_eid")},
	inverseJoinColumns= {@JoinColumn(name="e_proj")})
	
	private List<Project> plist;

	public Employee(int eid, String ename, List<Project> plist) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.plist = plist;
	}

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Project> getPlist() {
		return plist;
	}

	public void setPlist(List<Project> plist) {
		this.plist = plist;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", plist=" + plist + "]";
	}
	
	
	

}
