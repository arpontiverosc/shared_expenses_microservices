package com.microservices.shared.expenses.service;


import com.microservices.shared.expenses.exception.UserNameUsedBadRequestException;
import com.microservices.shared.expenses.exception.UserNotFoundException;
import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.port.out.FindUserByIdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final FindUserByIdRepository findUserByIdRepository;
    public User retrieveUser(String id) {
        return findUserByIdRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public void existsUserName(String userName) {
        findUserByIdRepository.findByUserName(userName)
                .ifPresent(user -> {
                    throw new UserNameUsedBadRequestException();
                });
    }
}
