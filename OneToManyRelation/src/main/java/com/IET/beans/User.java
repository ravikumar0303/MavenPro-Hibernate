package com.IET.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="myuser1")
public class User {
	@Id
	private int uid;
	private String uname;
	@OneToMany(mappedBy="ravi")
	private Set<Address> addrset;

	public User() {
		super();
	}

	public User(int uid, String uname, Set<Address> addrset) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addrset = addrset;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set<Address> getAddrset() {
		return addrset;
	}

	public void setAddrset(Set<Address> addrset) {
		this.addrset = addrset;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", addrset=" + addrset + "]";
	}

	
}
