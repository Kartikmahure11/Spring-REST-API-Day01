package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

 
@Entity
@Table(name = "stud44")
public class Student 
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String address;
	String result;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Student(int id, String name, String address, String result) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.result = result;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", result=" + result + "]";
	}
	
	
	
	
	
	
	

}
