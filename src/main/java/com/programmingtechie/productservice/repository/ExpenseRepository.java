package com.programmingtechie.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.programmingtechie.productservice.model.Expense;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}
