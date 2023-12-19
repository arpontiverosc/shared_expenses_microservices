package com.microservices.shared.expenses.out.jpa;


import com.microservices.shared.expenses.out.jpa.model.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUserTempRepository extends JpaRepository<UserJpaEntity, String> {

}
