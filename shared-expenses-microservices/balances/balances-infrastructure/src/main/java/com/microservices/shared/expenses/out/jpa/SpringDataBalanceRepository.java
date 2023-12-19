package com.microservices.shared.expenses.out.jpa;


import com.microservices.shared.expenses.out.jpa.model.BalanceJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBalanceRepository extends JpaRepository<BalanceJpaEntity, String> {
}
