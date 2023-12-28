package com.microservices.shared.expenses.out.jpa;

import com.microservices.shared.expenses.out.jpa.model.OutboxJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataOutboxRepository extends JpaRepository<OutboxJpaEntity, String> {

}
