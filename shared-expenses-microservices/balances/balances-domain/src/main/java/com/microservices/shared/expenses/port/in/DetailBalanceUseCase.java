package com.microservices.shared.expenses.port.in;


import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.port.in.model.DetailBalanceQuery;

public interface DetailBalanceUseCase {
    Balance execute(DetailBalanceQuery query);
}
