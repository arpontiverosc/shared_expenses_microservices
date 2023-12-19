package com.microservices.shared.expenses.out.jpa.mapper;


import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.out.jpa.model.BalanceJpaEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BalanceMapper {
    public static BalanceJpaEntity from(Balance balance) {
        BalanceJpaEntity balanceJpaEntity = new BalanceJpaEntity();
        balanceJpaEntity.setId(balance.getId());
        balanceJpaEntity.setBalanceName(balance.getBalanceName());
        balanceJpaEntity.setDescription(balance.getDescription());
        balanceJpaEntity.setGroupId(balance.getGroup().getId());
        balanceJpaEntity.setCreatedAt(balance.getCreatedAt());
        if (Objects.nonNull(balance.getExpenses()) && !balance.getExpenses().isEmpty()) {
            balanceJpaEntity.setExpenses(balance.getExpenses().stream().map(ExpenseMapper::from).collect(Collectors.toSet()));
        }
        return balanceJpaEntity;
    }

    public static Balance from(BalanceJpaEntity balanceJpaEntity) {
        Balance.Builder Builder =  Balance.Builder.builder()
                .id(balanceJpaEntity.getId())
                .balanceName(balanceJpaEntity.getBalanceName())
                .description(balanceJpaEntity.getDescription())
                .createdAt(balanceJpaEntity.getCreatedAt());
                if (Objects.nonNull(balanceJpaEntity.getExpenses()) && !balanceJpaEntity.getExpenses().isEmpty()) {
                    Builder.expenses(balanceJpaEntity.getExpenses().stream().map(ExpenseMapper::from).toList());
                }
        return Builder.build();
    }
}
