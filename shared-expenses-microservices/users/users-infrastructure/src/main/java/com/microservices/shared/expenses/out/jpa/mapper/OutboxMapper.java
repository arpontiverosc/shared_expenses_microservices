package com.microservices.shared.expenses.out.jpa.mapper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservices.shared.expenses.model.User;
import com.microservices.shared.expenses.out.jpa.model.OutboxJpaEntity;
import com.microservices.shared.expenses.out.jpa.model.UserJpaEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OutboxMapper {

    private static final String USER_AGGREGATE = "USER";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static String userToJsonString(User user) {
        try {
            return objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static OutboxJpaEntity from(User user, String operation) {

        return OutboxJpaEntity.builder().id(UUID.randomUUID().toString())
                .aggregate(USER_AGGREGATE)
                .operation(operation)
                .message(userToJsonString(user))
                .build();
    }

}
