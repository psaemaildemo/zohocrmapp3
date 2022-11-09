package com.thymeleafexm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafController {
	//http://localhost:8080/variable-expression
	@RequestMapping("/variable-expression")
	public String variable_expression(Model model){
		Student student = new Student(1,"mike","chennai","mike@gmail.com");
		model.addAttribute("student", student);
		model.addAttribute("user", "mike");
		return "variable-expression";
	}
	
	//http://localhost:8080/selection-expression
	@RequestMapping("/selection-expression")
	public String selection_expression(Model model){
		Student student = new Student(1,"mike","chennai","mike@gmail.com");
		model.addAttribute("student", student);
		return "selection-expression";
	}
	
	//http://localhost:8080/message-expression
	@RequestMapping("/message-expression")
	public String message_expression() {
		return "message-expression";
	}
	
	//http://localhost:8080/link-expression
	@RequestMapping("/link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", 2);
		return "link_expression";
	}
	
	//http://localhost:8080/fragment-expression
	@RequestMapping("/fragment-expression")
	public String fragmentExpression() {
		return "fragment_expression";
	}

	//http://localhost:8080/if-unless
	@RequestMapping("if-unless")
	public String ifUnless(Model model) {
		User u1 = new User("mike","Admin","mike@gmail.com");
		User u2 = new User("stallin","Admin","stallin@gmail.com");
		User u3 = new User("smith","User","user@gmail.com");
		
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		model.addAttribute("users", users);
		
		return "if-unless";
	}
	
	//http://localhost:8080/switch-case
	@RequestMapping("/switch-case")
	public String switchCase(Model model) {
		User user = new User("mike","XYZ","mike@gmail.com");
		model.addAttribute("user", user);
		return "switch-case";
	}


}
