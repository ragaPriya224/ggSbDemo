package com.gg.jpaDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
//each instance of this topic class should go as row of table
@Entity
@Table(name = "topic007")
public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 

	
	@Column(name = "tname")
	private String name; 

	@Column(nullable = false)
	private String description;

	private int age;
	
	@Column(name = "aadharNumber", unique = true,length = 12)
	private int aadhar;
	
	@Transient
	private  String debugString;
	public Topic() {

	}


	public Topic(int id, String name, String description, int age,int aadhar) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.age = age;
		this.aadhar= aadhar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public int getAadhar() {
		return aadhar;
	}


	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	} 


}
