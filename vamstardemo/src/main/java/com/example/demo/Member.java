package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 int id;
	 String gender;
	 int weight;
	 int height;
	 int bmi;
	
	
	public Member(int id, String gender, int weight, int height) {
	super();
	this.id = id;
	this.gender = gender;
	this.weight = weight;
	this.height = height;
}
	

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getBmi() {
		return bmi;
	}


	

	@Override
	public String toString() {
		return "Member [id=" + id + ", gender=" + gender + ", weight=" + weight + ", height=" + height + ", bmi=" + bmi
				+ "]";
	}
	public void setBmi() {
		this.bmi =((this.weight*100*100)/(this.height));
	}

	

	
	
}
