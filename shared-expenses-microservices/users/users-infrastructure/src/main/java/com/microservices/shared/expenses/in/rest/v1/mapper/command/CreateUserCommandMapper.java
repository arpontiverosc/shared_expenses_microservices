package com.microservices.shared.expenses.in.rest.v1.mapper.command;


import com.microservices.shared.expenses.in.rest.v1.model.request.CreateUserRequest;
import com.microservices.shared.expenses.port.in.model.CreateUserCommand;

public class CreateUserCommandMapper {
    public static CreateUserCommand from(CreateUserRequest request) {
        if (request == null) {
            return null;
        }
        CreateUserCommand command = new CreateUserCommand();
        command.setUserName(request.getUserName());
        command.setFirstName(request.getFirstName());
        command.setLastName(request.getLastName());
        command.setEmail(request.getEmail());

        return command;

    }
}
