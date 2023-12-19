package com.microservices.shared.expenses.in.rest.v1.mapper.commad;

import com.microservices.shared.expenses.in.rest.v1.model.request.AddExpenseToBalanceRequest;
import com.microservices.shared.expenses.port.in.model.AddExpenseToBalanceCommand;

public class AddExpenseToBalanceCommandMapper {

    public static AddExpenseToBalanceCommand from(String balanceId, AddExpenseToBalanceRequest request) {
        return AddExpenseToBalanceCommand.Builder.builder()
                                                .balanceId(balanceId)
                                                .userId(request.getUserId())
                                                .currency(request.getCurrency())
                                                .price(request.getPrice())
                                                .description(request.getDescription())
                                                .groupId(request.getGroupId())
                                                .build();
    }
}
