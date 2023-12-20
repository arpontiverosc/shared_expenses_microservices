package com.microservices.shared.expenses.port.in;


import com.microservices.shared.expenses.port.in.model.AddUserToGroupCommand;

public interface AddUserToGroupUseCase {
    void execute(AddUserToGroupCommand from);

}
