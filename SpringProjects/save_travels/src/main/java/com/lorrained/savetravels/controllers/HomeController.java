package com.lorrained.savetravels.controllers;

import java.util.List;

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

import com.lorrained.savetravels.models.Expense;
import com.lorrained.savetravels.services.ExpenseService;

@Controller
public class HomeController {
	
	@Autowired
	private ExpenseService expenseServ;
	@GetMapping ("/expenses")
	public String index(Model model, @ModelAttribute("newExpense") Expense newExpense) {
		List<Expense> allExpenses = expenseServ.findAll();
		model.addAttribute("allExpenses", allExpenses);
		return "expenses.jsp";
	}
	
	
	@PostMapping ("/create")
	public String create(@Valid @ModelAttribute("newExpense") Expense newExpense, BindingResult result) {
		//can only take in one modelAttribute at a time because you can only submit one form per route
		//the order HAS to be like this
		if (result.hasErrors()) {
			return "expenses.jsp";
		}
		expenseServ.create(newExpense);
		return "redirect:/expenses";
	}
	
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseServ.findOne(id));
		return "edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, @PathVariable("id") Long id){
		if (result.hasErrors()) {
			return "edit.jsp";
		}
		expenseServ.update(expense);
		return "redirect:/expenses";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		expenseServ.delete(id);
		return "redirect:/expenses";
	}
	
	@GetMapping("/expensePage/{id}")
	public String description(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseServ.findOne(id));
		return "one_expense.jsp";
	}
}
