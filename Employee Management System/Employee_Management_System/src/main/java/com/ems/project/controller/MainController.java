package com.ems.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.ems.project.dao.EmployeeDao;
import com.ems.project.model.Employee;

@Controller
public class MainController {
	
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/")
	public String home(Model m) {
		
		List<Employee> employee = employeeDao.getALLEmployee();
		m.addAttribute("employee",employee);
		return "index";
	}
	
	//show add employee form 
	@RequestMapping("/add_employee")
	public String addEmployee(Model m) {
		m.addAttribute("title", "Add Employee");
		return "add_employee_form";
	}
	
	//handle add employee form
	@RequestMapping(value = "/handle-employee",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Employee employee,HttpServletRequest request) {
		System.out.println(employee);
		employeeDao.createEmployee(employee);
		RedirectView redirectView = new RedirectView();
		//redirect to home page
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{employeeId}")
	public RedirectView deleteEmployee(@PathVariable("employeeId") int employeeId,HttpServletRequest request) {
		employeeDao.deleteEmployee(employeeId);
		RedirectView redirectView = new RedirectView();
		//redirect to home page
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
