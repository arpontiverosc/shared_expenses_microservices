package com.microservices.shared.expenses.out.jpa.impl;


import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.out.jpa.SpringDataOutboxRepository;
import com.microservices.shared.expenses.out.jpa.SpringDataUserRepository;
import com.microservices.shared.expenses.out.jpa.mapper.OutboxMapper;
import com.microservices.shared.expenses.out.jpa.mapper.UserMapper;
import com.microservices.shared.expenses.out.jpa.merger.UserJpaEntityMerger;
import com.microservices.shared.expenses.out.jpa.model.UserJpaEntity;
import com.microservices.shared.expenses.port.out.FindUserByIdRepository;
import com.microservices.shared.expenses.port.out.SaveUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JpaUserRepositoryImpl implements SaveUserRepository, FindUserByIdRepository {
    private static final String CREATION = "CREATION";
    private static final String UPDATE = "UPDATE";

    private final SpringDataUserRepository springDataUserRepository;
    private final SpringDataOutboxRepository springDataOutboxRepository;


    @Override
    public User save(User user) {

        UserJpaEntity userJpaEntity = springDataUserRepository.findById(user.getId()).orElseGet(UserJpaEntity::new);

        String operation = Objects.nonNull(userJpaEntity.getId()) ? UPDATE : CREATION;
        springDataOutboxRepository.save(OutboxMapper.from(user, operation));

        UserJpaEntityMerger.from(user, userJpaEntity);

        return UserMapper.from(springDataUserRepository.save(userJpaEntity));
    }



    @Override
    public Optional<User> findById(String id) {
        return springDataUserRepository.findById(id).map(UserMapper::from);
    }

    @Override
    public Optional<User> findByUserName(String userName) {
        return springDataUserRepository.findByUserName(userName).map(UserMapper::from);
    }
}
