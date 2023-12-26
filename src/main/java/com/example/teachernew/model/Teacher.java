package com.example.teachernew.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teachers")
public class Teacher 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tId;
	
	private String tName;
	
	private String tGender;
	
	private String tSubject;

	public long gettId() {
		return tId;
	}

	public void settId(long tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettGender() {
		return tGender;
	}

	public void settGender(String tGender) {
		this.tGender = tGender;
	}

	public String gettSubject() {
		return tSubject;
	}

	public void settSubject(String tSubject) {
		this.tSubject = tSubject;
	}

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + ", tGender=" + tGender + ", tSubject=" + tSubject + "]";
	}
}
