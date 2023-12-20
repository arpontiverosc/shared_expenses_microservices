package com.microservices.shared.expenses.in.rest.v1.mapper.query;


import com.microservices.shared.expenses.port.in.model.DetailUserQuery;

public class DetailUserQueryMapper {
    public static DetailUserQuery from(String userId) {
        DetailUserQuery detailUserQuery = new DetailUserQuery();
        detailUserQuery.setId(userId);
        return detailUserQuery;
    }
}
