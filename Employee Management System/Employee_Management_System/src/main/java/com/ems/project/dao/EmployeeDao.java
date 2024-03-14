package com.ems.project.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.ems.project.model.Employee;


@Component
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createEmployee(Employee employee) {
		this.hibernateTemplate.save(employee);
	}
	
	public List<Employee> getALLEmployee(){
		List<Employee> employee = this.hibernateTemplate.loadAll(Employee.class);
		return employee;
	}
	
	@Transactional
	public void deleteEmployee(int emp_Id) {
		Employee emp = this.hibernateTemplate.load(Employee.class, emp_Id);
		this.hibernateTemplate.delete(emp);
	}
	
	public Employee getEmployee(int emp_Id) {
		return this.hibernateTemplate.load(Employee.class, emp_Id);
	}
	
	
	
	
	
	
	
}
