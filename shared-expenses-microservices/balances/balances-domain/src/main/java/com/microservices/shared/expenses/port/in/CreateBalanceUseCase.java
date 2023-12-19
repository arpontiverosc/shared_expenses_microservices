package com.microservices.shared.expenses.port.in;


import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.port.in.model.CreateBalanceCommand;

public interface CreateBalanceUseCase {
    Balance execute(CreateBalanceCommand command);
}
