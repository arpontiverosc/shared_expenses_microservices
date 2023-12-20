package com.microservices.shared.expenses.in.rest.v1.mapper.response;


import com.microservices.shared.expenses.in.rest.v1.model.response.UserDetailResponse;
import com.microservices.shared.expenses.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDetailResponseMapper {
    public static UserDetailResponse from(User user) {
        return UserDetailResponse.builder()
                        .id(user.getId())
                        .userName(user.getUserName())
                        .firstName(user.getFirstName())
                        .lastName(user.getLastName())
                        .email(user.getEmail())
                        .build();
    }
}
