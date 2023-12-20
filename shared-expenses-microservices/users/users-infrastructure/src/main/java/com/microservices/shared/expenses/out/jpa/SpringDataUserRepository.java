package com.microservices.shared.expenses.out.jpa;

import com.microservices.shared.expenses.out.jpa.model.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataUserRepository extends JpaRepository<UserJpaEntity, String> {
    Optional<UserJpaEntity> findByUserName(String userName);
}
