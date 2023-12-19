package com.microservices.shared.expenses;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DetailUserUseCaseImpl implements DetailUserUseCase {

    private final UserService userService;

    @Transactional(readOnly = true)
    @Override
    public User execute(DetailUserQuery query) {
        return userService.retrieveUser(query.getId());
    }
}
