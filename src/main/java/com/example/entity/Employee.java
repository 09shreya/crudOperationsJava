package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Employee {
@Id
@Column
	private int employee_id;
@Column
	private String employee_name;
@Column
	private String emplolyee_branch;
@Column
	private double employee_phoneNo;
@Column
	private double employee_salary;
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getEmplolyee_branch() {
	return emplolyee_branch;
}
public void setEmplolyee_branch(String emplolyee_branch) {
	this.emplolyee_branch = emplolyee_branch;
}
public double getEmployee_phoneNo() {
	return employee_phoneNo;
}
public void setEmployee_phoneNo(double employee_phoneNo) {
	this.employee_phoneNo = employee_phoneNo;
}
public double getEmployee_salary() {
	return employee_salary;
}
public void setEmployee_salary(double employee_salary) {
	this.employee_salary = employee_salary;
}
}
