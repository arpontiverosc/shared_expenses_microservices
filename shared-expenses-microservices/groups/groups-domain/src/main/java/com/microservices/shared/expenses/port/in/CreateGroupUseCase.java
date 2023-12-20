package com.microservices.shared.expenses.port.in;


import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.port.in.model.CreateGroupCommand;

public interface CreateGroupUseCase {


    Group execute(CreateGroupCommand command);

}
