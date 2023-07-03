package com.gg.jpaDemo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AccessCard {

	@Id	
	private int id;
	private boolean isActive;
	private Date issuedDate;
	@OneToOne
	private Employee employee;
	public AccessCard() {
	}
	
	public AccessCard(int id, boolean isActive, Date issuedDate) {
		super();
		this.id = id;
		this.isActive = isActive;
		this.issuedDate = issuedDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	@Override
	public String toString() {
		return "AccessCard [id=" + id + ", isActive=" + isActive + ", issuedDate=" + issuedDate + ", employee="
				+ employee + "]";
	}



}
