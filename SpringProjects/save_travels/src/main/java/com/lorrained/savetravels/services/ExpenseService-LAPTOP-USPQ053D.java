package com.lorrained.savetravels.services;

import java.util.List;

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
}
