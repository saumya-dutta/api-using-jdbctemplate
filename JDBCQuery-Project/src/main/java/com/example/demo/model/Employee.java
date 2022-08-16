package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class Employee {
	
	@JsonProperty("id")
	private int id;
	
	@NotBlank
	@JsonProperty("firstName")
	private String firstName;
	
	@NotBlank
	@JsonProperty("lastName")
	private String lastName;
	
	@NotBlank
	@JsonProperty("email")
	private String email;
	
	public Employee(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstname(String firstname) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';	
	}
}
