package com.microservices.shared.expenses.service;


import com.microservices.shared.expenses.exception.UserNotFoundException;
import com.microservices.shared.expenses.port.out.ExistsUserByIdRepository;

public class UserServiceTemp {

    private final ExistsUserByIdRepository existsUserByIdRepository;

    public UserServiceTemp(ExistsUserByIdRepository existsUserByIdRepository) {
        this.existsUserByIdRepository = existsUserByIdRepository;
    }

    public void existsUser(String id) {
        if (!existsUserByIdRepository.existsById(id)) throw new UserNotFoundException();
    }


}
