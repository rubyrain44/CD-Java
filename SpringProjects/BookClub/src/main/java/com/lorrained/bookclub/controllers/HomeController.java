package com.lorrained.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.lorrained.bookclub.models.LoginUser;
import com.lorrained.bookclub.models.User;
import com.lorrained.bookclub.services.UserService;


@Controller
public class HomeController {
 
	@Autowired
	private UserService userServ;
 
	
	/////LOGIN & REGISTRATION DASHBOARD/////
	 @GetMapping("/")
	 public String index(Model model) {
		 
	     model.addAttribute("user", new User());
	     model.addAttribute("loginUser", new LoginUser());
	     return "index.jsp";
	 }
	 
	 
	/////REGISTRATION FORM/////
	 @PostMapping("/register")
	 public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {    
	     // run register method
		 User newUser = userServ.register(user, result);
		 if(newUser == null) {
	         model.addAttribute("loginUser", new LoginUser());
	         return "index.jsp";
	     }
		 //add user to DB
		 //log user in
		 session.setAttribute("userId", newUser.getId());
	     return "redirect:/books";
	 }
	 
	 
	/////LOGIN FORM/////
	 @PostMapping("/login")
	 public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser, BindingResult result, Model model, HttpSession session) { 
	     User user = userServ.login(loginUser, result);	 
		 if(user == null) {
	         model.addAttribute("user", new User());
	         return "index.jsp";
	     } 
		 session.setAttribute("userId", user.getId());
	     return "redirect:/books";
	 }
	 
	 
	 /////LOGIN & LOGOUT/////
	 @GetMapping("/dashboard")
	 public String dashboard(Model model, HttpSession session) {
		 Long id = (Long) session.getAttribute("userId");
		 User loggedUser = userServ.findById(id);
		 model.addAttribute("user", loggedUser);
		 return "books.jsp";
	 }
	 
	 @GetMapping("/logout")
	 public String logout(HttpSession session) {
		 session.setAttribute("userId", null);
		 return "redirect:/";
	 }
 
}