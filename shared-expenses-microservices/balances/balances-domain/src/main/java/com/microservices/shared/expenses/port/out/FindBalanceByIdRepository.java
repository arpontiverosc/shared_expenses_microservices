package com.microservices.shared.expenses.port.out;


import com.microservices.shared.expenses.model.Balance;

import java.util.Optional;

public interface FindBalanceByIdRepository {
    Optional<Balance> findById(String balanceId);
}
