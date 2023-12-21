package com.microservices.shared.expenses.service;


import com.microservices.shared.expenses.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    //private final FindUserByIdRepository findUserByIdRepository;
    public User retrieveUser(String id) {
        //return findUserByIdRepository.findById(id).orElseThrow(UserNotFoundException::new);
        //feing?
        return null;
    }

    public void existsUserName(String userName) {
        /*findUserByIdRepository.findByUserName(userName)
                .ifPresent(user -> {
                    throw new UserNameUsedBadRequestException();
                });*/
    }
}
