package com.microservices.shared.expenses.in.rest.v1.mapper.command;


import com.microservices.shared.expenses.in.rest.v1.model.request.CreateUserRequest;
import com.microservices.shared.expenses.port.in.model.CreateUserCommand;

public class CreateUserCommandMapper {
    public static CreateUserCommand from(CreateUserRequest request) {
        if (request == null) {
            return null;
        }
        return CreateUserCommand.Builder.builder()
                                .userName(request.getUserName())
                                .firstName(request.getFirstName())
                                .lastName(request.getLastName())
                                .email(request.getEmail())
                                .build();
    }
}
