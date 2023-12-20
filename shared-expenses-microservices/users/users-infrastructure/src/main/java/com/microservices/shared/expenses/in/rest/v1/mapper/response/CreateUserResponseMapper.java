package com.microservices.shared.expenses.in.rest.v1.mapper.response;


import com.microservices.shared.expenses.in.rest.v1.model.response.CreateUserResponse;
import com.microservices.shared.expenses.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateUserResponseMapper {
    public static CreateUserResponse from(User user) {
        if (user == null) {
            return null;
        }
        return CreateUserResponse.builder().id(user.getId()).build();
    }

}
