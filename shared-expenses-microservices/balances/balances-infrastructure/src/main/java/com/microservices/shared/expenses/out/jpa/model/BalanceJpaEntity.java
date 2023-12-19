package com.microservices.shared.expenses.out.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Table(name = "balances")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BalanceJpaEntity {

    @Id
    @EqualsAndHashCode.Include private String id;
    private String balanceName;
    private String description;
    private String groupId;
    private OffsetDateTime createdAt;

    @OneToMany(mappedBy = "balance")
    private Set<ExpenseJpaEntity> expenses;


}
