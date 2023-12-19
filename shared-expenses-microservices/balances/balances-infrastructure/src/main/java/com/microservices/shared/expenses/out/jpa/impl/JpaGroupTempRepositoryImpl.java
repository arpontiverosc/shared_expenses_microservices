package com.microservices.shared.expenses.out.jpa.impl;


import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.out.jpa.SpringDataGroupTempRepository;
import com.microservices.shared.expenses.out.jpa.mapper.GroupMapper;
import com.microservices.shared.expenses.port.out.ExistsGroupByIdRepository;
import com.microservices.shared.expenses.port.out.FindGroupByIdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JpaGroupTempRepositoryImpl implements ExistsGroupByIdRepository, FindGroupByIdRepository {

    private final SpringDataGroupTempRepository springDataGroupRepository;

    @Override
    public boolean existsById(String groupId) {
        return springDataGroupRepository.existsById(groupId);
    }

    @Override
    public Optional<Group> findById(String groupId) {
        return springDataGroupRepository.findById(groupId).map(GroupMapper::from);
    }
}
