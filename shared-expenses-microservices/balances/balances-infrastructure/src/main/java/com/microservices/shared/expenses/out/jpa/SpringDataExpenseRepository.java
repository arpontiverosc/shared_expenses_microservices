package com.microservices.shared.expenses.out.jpa;


import com.microservices.shared.expenses.out.jpa.model.ExpenseJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataExpenseRepository extends JpaRepository<ExpenseJpaEntity, String> {
}
