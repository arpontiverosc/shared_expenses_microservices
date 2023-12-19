package com.microservices.shared.expenses.service;


import com.microservices.shared.expenses.exception.GroupNotFoundException;
import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.port.out.ExistsGroupByIdRepository;
import com.microservices.shared.expenses.port.out.FindGroupByIdRepository;

public class GroupServiceTemp {

    private final ExistsGroupByIdRepository existsGroupByIdRepository;
    private final FindGroupByIdRepository findGroupByIdRepository;

    public GroupServiceTemp(ExistsGroupByIdRepository existsGroupByIdRepository, FindGroupByIdRepository findGroupByIdRepository) {
        this.existsGroupByIdRepository = existsGroupByIdRepository;
        this.findGroupByIdRepository = findGroupByIdRepository;
    }

    public void existsGroup(String groupId) {
        if (!existsGroupByIdRepository.existsById(groupId)) throw new GroupNotFoundException();
    }

    public Group retrieveGroup(String id) {
        return findGroupByIdRepository.findById(id).orElseThrow(GroupNotFoundException::new);
    }

}
