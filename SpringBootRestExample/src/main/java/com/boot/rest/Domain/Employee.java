package com.boot.rest.Domain;

public class Employee {

	private Integer eno;
	private String firstname;
	private String lastname;
	private Integer age;
	private String email;
	public Employee(Integer eno, String firstname, String lastname, Integer age, String email) {
		super();
		this.eno = eno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
