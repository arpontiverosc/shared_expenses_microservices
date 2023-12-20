package com.microservices.shared.expenses.out.jpa.mapper;


import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.out.jpa.model.UserJpaEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {

    public static User from(UserJpaEntity userJpaEntity) {

        return User.builder()
        .id(userJpaEntity.getId())
        .userName(userJpaEntity.getUserName())
        .firstName(userJpaEntity.getFirstName())
        .lastName(userJpaEntity.getLastName())
        .email(userJpaEntity.getEmail())
        .build();

    }


    public static UserJpaEntity from(User user) {
        UserJpaEntity userJpaEntity = new UserJpaEntity();
        userJpaEntity.setId(user.getId());
        userJpaEntity.setUserName(user.getUserName());
        userJpaEntity.setFirstName(user.getFirstName());
        userJpaEntity.setLastName(user.getLastName());
        userJpaEntity.setEmail(user.getEmail());
        return userJpaEntity;
    }

    public static Set<UserJpaEntity> from(List<User> users) {
            return Optional.ofNullable(users)
                    .map(userList -> userList.stream()
                            .map(UserMapper::from)
                            .collect(Collectors.toSet()))
                    .orElseGet(HashSet::new);
    }

}
