package com.microservices.shared.expenses.out.jpa.impl;


import com.microservices.shared.expenses.out.jpa.SpringDataUserTempRepository;
import com.microservices.shared.expenses.port.out.ExistsUserByIdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaUserTempRepositoryImpl implements ExistsUserByIdRepository {

    private final SpringDataUserTempRepository springDataUserTempRepository;

    @Override
    public boolean existsById(String userId) {
        return springDataUserTempRepository.existsById(userId);
    }
}
