package com.thymeleafexm.controller;

public class Student {
	private int id;
	private String name;
	private String city;
	private String email;
	public Student(int id, String name, String city, String email) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getEmail() {
		return email;
	}
}
