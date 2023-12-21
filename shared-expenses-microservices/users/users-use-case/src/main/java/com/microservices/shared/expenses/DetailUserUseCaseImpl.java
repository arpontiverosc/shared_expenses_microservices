package com.microservices.shared.expenses;


import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.port.in.DetailUserUseCase;
import com.microservices.shared.expenses.port.in.model.DetailUserQuery;
import com.microservices.shared.expenses.service.UserService;
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
