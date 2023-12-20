package com.microservices.shared.expenses.in.rest.v1.mapper.query;


import com.microservices.shared.expenses.port.in.model.DetailUserQuery;

public class DetailUserQueryMapper {
    public static DetailUserQuery from(String userId) {
        return DetailUserQuery.Builder.builder().id(userId).build();
    }
}
