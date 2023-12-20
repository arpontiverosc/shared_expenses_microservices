package com.microservices.shared.expenses.port.in;


import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.port.in.model.DetailUserQuery;

public interface DetailUserUseCase {
    User execute(DetailUserQuery query);
}
