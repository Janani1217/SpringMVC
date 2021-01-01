package com.janani.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.janani.spring.springmvc.dto.Employee;


@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Jyoti");
		employee.setSalary(238899);
		modelAndView.addObject("emp", employee);

		return modelAndView;
	}
}
