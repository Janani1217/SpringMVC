package com.janani.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.janani.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		ArrayList<Employee> employees = new ArrayList<Employee>();

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Sohel");
		employee1.setSalary(238899);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Sai");
		employee2.setSalary(222199);

		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Kiran");
		employee3.setSalary(54641);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		modelAndView.addObject("employees", employees);
		return modelAndView;
	}
}
