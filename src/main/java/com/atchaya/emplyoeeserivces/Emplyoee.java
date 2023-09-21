package com.atchaya.emplyoeeserivces;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Emplyoee {
	
	@Id
	@Column(name="eid")
	private int eid;
	
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	public Emplyoee(int eid, String name, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
	}
	public Emplyoee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Emplyoee [eid=" + eid + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
