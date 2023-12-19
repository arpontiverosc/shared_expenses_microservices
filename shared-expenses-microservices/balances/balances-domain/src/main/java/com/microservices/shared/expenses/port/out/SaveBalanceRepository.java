package com.microservices.shared.expenses.port.out;


import com.microservices.shared.expenses.model.Balance;

public interface SaveBalanceRepository {

    Balance save(Balance balanceFromCommand);
}
