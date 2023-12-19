package com.microservices.shared.expenses.out.jpa.mapper;



import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.out.jpa.model.GroupJpaEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupMapper {
    public static Group from(GroupJpaEntity groupJpaEntity) {
        return Group.Builder.builder()
                .id(groupJpaEntity.getId())
                .membersIds(groupJpaEntity.getUsers().stream().map(user -> user.getId()).collect(Collectors.toSet()))
                .build();
    }

}
