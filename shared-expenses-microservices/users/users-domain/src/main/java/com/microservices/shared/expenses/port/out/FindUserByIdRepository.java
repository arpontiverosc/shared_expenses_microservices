package com.microservices.shared.expenses.port.out;


import com.microservices.shared.expenses.model.User;

import java.util.Optional;

public interface FindUserByIdRepository {

    Optional<User> findById(String id);

    Optional<User> findByUserName(String userName);
}
