package com.microservices.shared.expenses.out.jpa;


import com.microservices.shared.expenses.out.jpa.model.GroupJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataGroupTempRepository extends JpaRepository<GroupJpaEntity, String> {

}
