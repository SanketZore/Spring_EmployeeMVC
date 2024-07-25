package com.example.sanket.mvcproject.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.servlet.ModelAndView;

import com.example.sanket.mvcproject.entity.Employee;

@RestController
public class EmployeeController {
		
		@GetMapping("/getForm")
		public ModelAndView getRegistrationForm() {
			String viewName="register";  // HTML Page.
			
			Map<String,Object> model=new HashMap<>();  // Data OR Model
//			model.put("displayKaronaa","sanket");
//			model.put("Creator", "Zore");
			Employee e=new Employee();
			model.put("employeeEntry",e);
			
			return new ModelAndView(viewName,model);
		}
		
	
	

}
