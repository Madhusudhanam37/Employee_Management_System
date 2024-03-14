package com.ems.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_Id;
	private String emp_Name;
	private String emp_Roll;
	private String emp_City;
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Roll() {
		return emp_Roll;
	}
	public void setEmp_Roll(String emp_Roll) {
		this.emp_Roll = emp_Roll;
	}
	public String getEmp_City() {
		return emp_City;
	}
	public void setEmp_City(String emp_City) {
		this.emp_City = emp_City;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int emp_Id, String emp_Name, String emp_Roll, String emp_City) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Roll = emp_Roll;
		this.emp_City = emp_City;
	}
	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Roll=" + emp_Roll + ", emp_City="
				+ emp_City + "]";
	}
	
	
}
