package com.microservices.shared.expenses.port.in;


import com.microservices.shared.expenses.model.Expense;
import com.microservices.shared.expenses.port.in.model.AddExpenseToBalanceCommand;

public interface AddExpenseToBalance {
    Expense execute(AddExpenseToBalanceCommand from);
}
