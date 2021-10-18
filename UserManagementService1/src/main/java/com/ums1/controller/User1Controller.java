package com.ums1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ums1.entity.User1;
import com.ums1.repository.User1Repository;
import com.ums1.service.User1Service;

@Controller
public class User1Controller {

	@Autowired
	User1Repository user1Repository;
	@Autowired
	User1Service user1Service;
	
	
//	@RequestMapping("/")
//	public String hello() {
//		return "login.html";
//	}
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login"); 
		return modelAndView;
	}
	
	
	
	@PostMapping("/login")
	public String loginAccount(@ModelAttribute("user") User1 user1) {
		user1Service.saveUser1(user1);
		return "redirect:/users?success";
	}
	
	
	
	
	@RequestMapping("/users")
	public String users() {
		return "users.html";
	}

	
	
	
	
	
	
	
	@GetMapping("/users/new")
	public String createUserForm(Model model) {
		User1 user1 = new User1();
		model.addAttribute("user", user1);
		return "create_user";
		
	}
	
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") User1 user1) {
		user1Service.saveUser1(user1);
		return "redirect:/users";	
	}
	
	@GetMapping("/users/edit/{id}")
	public String editUserForm(@PathVariable Integer id, Model model) {
		model.addAttribute("student", user1Service.getUserById(id));
		return "edit_users";
	}

	@PostMapping("/users/{id}")
	public String updateStudent(@PathVariable Integer id,
			@ModelAttribute("student") User1 user1,
			Model model) {
		
		// get student from database by id
		User1 existingUser =  user1Service.getUserById(id);
		existingUser.setUserId(id);
		existingUser.setUsername(user1.getUsername());
		existingUser.setUserPassword(user1.getUserPassword());
		existingUser.setRoleId(user1.getRoleId());
		
		// save updated student object
		user1Service.updateuser1(user1);
		return "redirect:/users";		
	}
	
	
	@GetMapping("/users/{id}")
	public String deleteUser(@PathVariable Integer id) {
		user1Service.deleteUser1ById(id);
		return "redirect:/users";
	}
	
	
	
	
	
	
	
	
}
