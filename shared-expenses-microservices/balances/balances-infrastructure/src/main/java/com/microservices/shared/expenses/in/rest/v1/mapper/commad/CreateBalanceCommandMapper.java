package com.microservices.shared.expenses.in.rest.v1.mapper.commad;


import com.microservices.shared.expenses.in.rest.v1.model.request.CreateBalanceRequest;
import com.microservices.shared.expenses.port.in.model.CreateBalanceCommand;

public class CreateBalanceCommandMapper {
    public static CreateBalanceCommand from(CreateBalanceRequest request) {
        return CreateBalanceCommand.Builder.builder()
                                            .description(request.getDescription())
                                            .balanceName(request.getBalanceName())
                                            .groupId(request.getGroupId())
                                            .build();
    }
}
