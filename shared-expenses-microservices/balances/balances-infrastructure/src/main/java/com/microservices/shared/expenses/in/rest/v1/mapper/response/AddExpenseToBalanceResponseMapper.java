package com.microservices.shared.expenses.in.rest.v1.mapper.response;

import com.microservices.shared.expenses.in.rest.v1.model.response.AddExpenseToBalanceResponse;
import com.microservices.shared.expenses.model.Expense;

public class AddExpenseToBalanceResponseMapper {
    public static AddExpenseToBalanceResponse from(Expense expense) {
        return AddExpenseToBalanceResponse.builder().id(expense.getId()).build();
    }
}
