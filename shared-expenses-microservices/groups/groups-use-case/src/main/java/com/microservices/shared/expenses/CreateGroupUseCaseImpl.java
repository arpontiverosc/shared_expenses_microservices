package com.microservices.shared.expenses;


import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.port.in.CreateGroupUseCase;
import com.microservices.shared.expenses.port.in.model.CreateGroupCommand;
import com.microservices.shared.expenses.port.out.SaveGroupRepository;
import com.microservices.shared.expenses.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateGroupUseCaseImpl implements CreateGroupUseCase {

    private final SaveGroupRepository saveGroupRepository;
    private final GroupService groupService;

    @Transactional
    @Override
    public Group execute(CreateGroupCommand command) {
        validateCommand(command);
        Group group = createGroupFromCommand(command);
        groupService.existsGroupName(group.getGroupName());
        return saveGroupRepository.save(group);
    }

    private Group createGroupFromCommand(CreateGroupCommand command) {
        return Group.builder()
                .id(UUID.randomUUID().toString())
                .groupName(command.getGroupName())
                .build();
    }

    private void validateCommand(CreateGroupCommand command) {
    }

}
