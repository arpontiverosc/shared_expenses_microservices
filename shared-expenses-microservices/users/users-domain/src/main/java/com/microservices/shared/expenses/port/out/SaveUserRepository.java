package com.microservices.shared.expenses.port.out;


import com.microservices.shared.expenses.model.User;

public interface SaveUserRepository {
    User save(User user);
}
