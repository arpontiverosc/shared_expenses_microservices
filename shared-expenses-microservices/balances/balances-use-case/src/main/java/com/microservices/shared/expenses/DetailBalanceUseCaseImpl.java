package com.microservices.shared.expenses;


import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.port.in.DetailBalanceUseCase;
import com.microservices.shared.expenses.port.in.model.DetailBalanceQuery;
import com.microservices.shared.expenses.service.BalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DetailBalanceUseCaseImpl implements DetailBalanceUseCase {

    private final BalanceService balanceService;

    @Transactional(readOnly = true)
    @Override
    public Balance execute(DetailBalanceQuery query) {
        return balanceService.retrieveBalance(query.getId());
    }
}
