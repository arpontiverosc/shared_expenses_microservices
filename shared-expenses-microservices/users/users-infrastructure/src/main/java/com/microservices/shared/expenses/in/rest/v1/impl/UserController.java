package com.microservices.shared.expenses.in.rest.v1.impl;


import com.microservices.shared.expenses.in.rest.v1.UserApi;
import com.microservices.shared.expenses.in.rest.v1.mapper.command.CreateUserCommandMapper;
import com.microservices.shared.expenses.in.rest.v1.mapper.query.DetailUserQueryMapper;
import com.microservices.shared.expenses.in.rest.v1.mapper.response.CreateUserResponseMapper;
import com.microservices.shared.expenses.in.rest.v1.mapper.response.UserDetailResponseMapper;
import com.microservices.shared.expenses.in.rest.v1.model.request.CreateUserRequest;
import com.microservices.shared.expenses.in.rest.v1.model.response.CreateUserResponse;
import com.microservices.shared.expenses.in.rest.v1.model.response.UserDetailResponse;
import com.microservices.shared.expenses.port.in.CreateUserUseCase;
import com.microservices.shared.expenses.port.in.DetailUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {


    private final CreateUserUseCase createUserUseCase;
    private final DetailUserUseCase detailUserUseCase;


    @Override
    public CreateUserResponse createUserV1(CreateUserRequest request) {
        return CreateUserResponseMapper.from(createUserUseCase.execute(CreateUserCommandMapper.from(request)));
    }

    @Override
    public UserDetailResponse detailUserV1(String userId) {
        return UserDetailResponseMapper.from(detailUserUseCase.execute(DetailUserQueryMapper.from(userId)));
    }
}
