package com.IET.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="project2")
public class Project {
	@Id
	private int pid;
	private String pname;
	private int duration;
	@ManyToMany(mappedBy="plist")
	List<Employee> elist;
	
	public Project() {
		super();
	}

	public Project(int pid, String pname, int duration, List<Employee> elist) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.duration = duration;
		this.elist = elist;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Employee> getElist() {
		return elist;
	}

	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", duration=" + duration + ", elist=" + elist + "]";
	}
	

	
}
