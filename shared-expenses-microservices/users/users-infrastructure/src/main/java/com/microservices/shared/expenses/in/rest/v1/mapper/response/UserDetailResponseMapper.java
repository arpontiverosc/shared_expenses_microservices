package com.microservices.shared.expenses.in.rest.v1.mapper.response;


import com.microservices.shared.expenses.in.rest.v1.model.response.UserDetailResponse;
import com.microservices.shared.expenses.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDetailResponseMapper {
    public static UserDetailResponse from(User user) {
        UserDetailResponse userDetailResponse = new UserDetailResponse();
        //builder
        .setId(user.getId());
        .setUserName(user.getUserName());
        .setFirstName(user.getFirstName());
        .setLastName(user.getLastName());
        .setEmail(user.getEmail());
        return userDetailResponse;
    }
}
