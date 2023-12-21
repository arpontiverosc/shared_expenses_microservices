package com.microservices.shared.expenses;


import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.port.in.AddUserToGroupUseCase;
import com.microservices.shared.expenses.port.in.model.AddUserToGroupCommand;
import com.microservices.shared.expenses.port.out.SaveGroupRepository;
import com.microservices.shared.expenses.service.GroupService;
import com.microservices.shared.expenses.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AddUserToGroupUseCaseImpl implements AddUserToGroupUseCase {

    private final GroupService groupService;
    private final UserService userService;
    private final SaveGroupRepository saveGroupRepository;


    @Override
    public void execute(AddUserToGroupCommand command) {
         Group group = groupService.retrieveGroup(command.getGroupId());
         User user = userService.retrieveUser(command.getUserId());
         groupService.checkIsNotAlreadyIncluded(group, user);
         group.addUser(user);
         saveGroupRepository.save(group);
    }

}
