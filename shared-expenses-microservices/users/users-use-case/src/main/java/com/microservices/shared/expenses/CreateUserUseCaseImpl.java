package com.microservices.shared.expenses;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.UUID;


@Service
@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final SaveUserRepository saveUserRepository;
    private final UserService userService;

    @Transactional
    @Override
    public User execute(CreateUserCommand command) {
        validateCommand(command);
        User user = createUserFromCommand(command);
        userService.existsUserName(user.getUserName());
        return saveUserRepository.save(user);
    }

    private User createUserFromCommand(CreateUserCommand command) {

        return User.builder()
            .id(UUID.randomUUID().toString())
            .userName(command.getUserName())
            .firstName(command.getFirstName())
            .lastName(command.getLastName())
            .email(command.getEmail())
            .build() ;

    }

    private void validateCommand(CreateUserCommand command) {

    }
}
