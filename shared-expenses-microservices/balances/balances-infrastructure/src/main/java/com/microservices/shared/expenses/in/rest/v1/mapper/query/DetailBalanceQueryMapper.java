package com.microservices.shared.expenses.in.rest.v1.mapper.query;


import com.microservices.shared.expenses.port.in.model.DetailBalanceQuery;

public class DetailBalanceQueryMapper {
    public static DetailBalanceQuery from(String balanceId) {
        return DetailBalanceQuery.Builder.builder()
                .id(balanceId).build();
    }
}
