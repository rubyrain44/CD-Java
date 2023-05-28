package com.lorrained.dojos_and_ninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lorrained.dojos_and_ninjas.models.Dojo;
import com.lorrained.dojos_and_ninjas.models.Ninja;
import com.lorrained.dojos_and_ninjas.services.DojoService;
import com.lorrained.dojos_and_ninjas.services.NinjaService;

@Controller
public class HomeController {
	
	@Autowired
	private DojoService dojoServ;
	
	@Autowired
	private NinjaService ninjaServ;
	
	@GetMapping("/")
	public String home(@ModelAttribute("dojo") Dojo dojo) {
		return "new_dojo.jsp";
	}
	
	@PostMapping("/create_dojo")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		dojoServ.createDojo(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/ninja")
	public String ninja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("dojos", dojoServ.findAllDojos());
		return "new_ninja.jsp";
	}
	
	@PostMapping("/create_ninja")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninjaServ.createNinja(ninja);
		return "redirect:/";
	}
	
	@GetMapping("/dojo/{id}")
	public String dojoShow(@PathVariable("id")Long id, Model model) {
		model.addAttribute("dojo", dojoServ.findDojo(id));
		return "dojo_show.jsp";
	}
}
