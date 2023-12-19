package com.microservices.shared.expenses.service;


import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.port.out.FindBalanceByIdRepository;
import com.microservices.shared.expenses.exception.BalanceNotFoundException;
public class BalanceService {

    private final FindBalanceByIdRepository findBalanceByIdRepository;

    public BalanceService(FindBalanceByIdRepository findBalanceByIdRepository) {
        this.findBalanceByIdRepository = findBalanceByIdRepository;
    }

    public Balance retrieveBalance(String balanceId) {
        return findBalanceByIdRepository.findById(balanceId).orElseThrow(BalanceNotFoundException::new);
    }

}
