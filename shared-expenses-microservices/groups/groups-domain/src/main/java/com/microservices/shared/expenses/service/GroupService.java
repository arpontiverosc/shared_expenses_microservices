package com.microservices.shared.expenses.service;


import com.microservices.shared.expenses.exception.GroupNameUsedBadRequestException;
import com.microservices.shared.expenses.exception.GroupNotFoundException;
import com.microservices.shared.expenses.exception.UserAlreadyIncludedBadRequestException;
import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.port.out.FindGroupByIdRepository;

public class GroupService {

    private final FindGroupByIdRepository findGroupByIdRepository;

    public GroupService(FindGroupByIdRepository findGroupByIdRepository) {
        this.findGroupByIdRepository = findGroupByIdRepository;
    }

    public void existsGroupName(String groupName) {

        findGroupByIdRepository.findByGroupName(groupName).ifPresent(group -> {
            throw new GroupNameUsedBadRequestException();
        });

    }

    public Group retrieveGroup(String id) {
        return findGroupByIdRepository.findById(id).orElseThrow(GroupNotFoundException::new);
    }

    public void checkIsNotAlreadyIncluded(Group group, User user) {
        if (group.isIncluded(user)) {
            throw new UserAlreadyIncludedBadRequestException();
        }
    }
}
