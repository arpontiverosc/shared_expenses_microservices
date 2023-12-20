package com.microservices.shared.expenses.port.in;

import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.port.in.model.CreateUserCommand;

public interface CreateUserUseCase {
    User execute(CreateUserCommand command);

}
