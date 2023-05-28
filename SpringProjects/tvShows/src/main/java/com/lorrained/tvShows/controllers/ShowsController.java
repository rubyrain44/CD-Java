package com.lorrained.tvShows.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lorrained.tvShows.models.Show;
import com.lorrained.tvShows.models.User;
import com.lorrained.tvShows.services.ShowService;
import com.lorrained.tvShows.services.UserService;

@Controller
@RequestMapping("/shows")
public class ShowsController {

	@Autowired
	private UserService userServ;
	
	@Autowired
	private ShowService showServ;
	
	
//	/////SHOWS DASHBOARD/////
	@GetMapping("")
	public String shows(Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Long id = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findById(id);
		model.addAttribute("user", loggedUser);
		model.addAttribute("allShows", showServ.allShows() );
		return "shows.jsp";
	}
	
	
	/////SHOW ONE SHOW/////
	@GetMapping("/showdetails/{id}")
	public String showPage(@PathVariable("id") Long id, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("show", showServ.findShow(id));
		return "showdetails.jsp";
	}
	
	
	/////EDIT ONE SHOW/////
	@GetMapping("/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("show", showServ.findShow(id));
        return "editshow.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("show") Show show, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
            return "editshow.jsp";
        } else {
        	show.setId(id);
            showServ.updateShow(show);
            return "redirect:/shows";
        }
	}
	
	
	/////CREATE NEW SHOW/////
	@GetMapping("/new")
	public String newBook(@ModelAttribute("show") Show show, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "newshow.jsp";
	}
	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("show") Show show, BindingResult result, HttpSession session) {
		Long id = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findById(id);
		show.setUser(loggedUser);
        if (result.hasErrors()) {
            return "newshow.jsp";
        } else {
            showServ.createShow(show);
            return "redirect:/shows";
        }
	}
	
	/////DELETE SHOW/////
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		showServ.delete(id);
		return "redirect:/shows";
	}
}
