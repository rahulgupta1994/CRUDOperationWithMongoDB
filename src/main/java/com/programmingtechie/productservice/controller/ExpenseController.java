package com.programmingtechie.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmingtechie.productservice.model.Expense;
import com.programmingtechie.productservice.services.ExpenseService;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

	// For testing purpose doing some changed
	// such as this message to test in jenkins email notification

	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
//		super();
		this.expenseService = expenseService;
	}
	
	@PostMapping
	public ResponseEntity addExpense(@RequestBody Expense expense) {
		expenseService.addExpense(expense);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping
	public ResponseEntity updateExpense(@RequestBody Expense expense) {
		expenseService.updateExpense(expense);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Expense>> getAllExpense() {
		return ResponseEntity.ok(expenseService.getAllExpense());
	}
	
	public void getExpenseByName() {
		
	}
	
	public void deleteExpense() {
		
	}
	
}
