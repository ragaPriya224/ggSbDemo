package com.gg.jpaDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//each instance of this topic class should go as row of table
@Entity
@Table(name="topics")
public class Topic {
	@Id
	private String id; 
	
	private String name; 

	private String description;

	private int age;
	
	public Topic() {

	}


	public Topic(String id, String name, String description,int age) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.age = age;
//		this.aadhar= aadhar;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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


//	public int getAadhar() {
//		return aadhar;
//	}
//
//
//	public void setAadhar(int aadhar) {
//		this.aadhar = aadhar;
//	} 


}
