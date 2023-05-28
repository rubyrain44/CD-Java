package com.lorrained.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorrained.savetravels.models.Expense;
import com.lorrained.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	public ExpenseRepository expenseRepo;
	
	public List<Expense> findAll() {
		return expenseRepo.findAll();
	}
		
	public Expense create(Expense e) {
		return expenseRepo.save(e);
	}
	
	public void delete(Long id) {
		expenseRepo.deleteById(id);
	}
	
	public Expense findOne(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	public Expense update(Expense e) {
		return expenseRepo.save(e);
	}
}
