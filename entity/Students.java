package com.mruh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Students {
	@Id
	private int rollno;
	private String name;
	private String email;
	private int mobileno;
	private String branch;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno
				+ ", branch=" + branch + "]";
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int rollno, String name, String email, int mobileno, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
		this.branch = branch;
	}
	
}
