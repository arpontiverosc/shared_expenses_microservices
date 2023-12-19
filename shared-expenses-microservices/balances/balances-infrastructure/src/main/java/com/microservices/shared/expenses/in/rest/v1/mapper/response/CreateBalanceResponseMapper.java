package com.microservices.shared.expenses.in.rest.v1.mapper.response;


import com.microservices.shared.expenses.in.rest.v1.model.response.CreateBalanceResponse;
import com.microservices.shared.expenses.model.Balance;

public class CreateBalanceResponseMapper {
    public static CreateBalanceResponse from(Balance balance) {
        return new CreateBalanceResponse(balance.getId());
    }
}
