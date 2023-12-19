package com.microservices.shared.expenses;


import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AddUserToGroupUseCaseImpl implements AddUserToGroupUseCase  {

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
