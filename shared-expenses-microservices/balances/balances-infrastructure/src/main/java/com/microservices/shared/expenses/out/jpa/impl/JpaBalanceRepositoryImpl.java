package com.microservices.shared.expenses.out.jpa.impl;


import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.model.Expense;
import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.out.jpa.SpringDataBalanceRepository;
import com.microservices.shared.expenses.out.jpa.SpringDataExpenseRepository;
import com.microservices.shared.expenses.out.jpa.SpringDataGroupTempRepository;
import com.microservices.shared.expenses.out.jpa.mapper.BalanceMapper;
import com.microservices.shared.expenses.out.jpa.mapper.ExpenseMapper;
import com.microservices.shared.expenses.out.jpa.mapper.GroupMapper;
import com.microservices.shared.expenses.out.jpa.model.BalanceJpaEntity;
import com.microservices.shared.expenses.out.jpa.model.ExpenseJpaEntity;
import com.microservices.shared.expenses.port.out.FindBalanceByIdRepository;
import com.microservices.shared.expenses.port.out.SaveBalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class JpaBalanceRepositoryImpl implements SaveBalanceRepository, FindBalanceByIdRepository {


    private final SpringDataBalanceRepository springDataBalanceRepository;
    private final SpringDataExpenseRepository springDataExpenseRepository;
    private final SpringDataGroupTempRepository springDataGroupTempRepository;


    private void saveUpdateBalance(BalanceJpaEntity balanceJpaEntity, Balance balance) {

        Set<ExpenseJpaEntity> entityExpenses = balanceJpaEntity.getExpenses();

        List<String> expensesAddedIds = entityExpenses.stream().map(ExpenseJpaEntity::getId).toList();
        List<Expense> domainExpenses = balance.getExpenses();


        List<ExpenseJpaEntity> notIncludedExpenses = domainExpenses.stream()
                .filter(expense -> !expensesAddedIds.contains(expense.getId()))
                .map(ExpenseMapper::from)
                .map(e -> {
                    e.setBalance(balanceJpaEntity);
                    return e;
                })
                .toList();

        springDataExpenseRepository.saveAll(notIncludedExpenses);
    }

    @Override
    public Balance save(Balance balance) {

        BalanceJpaEntity balanceJpaEntitytoSave = BalanceMapper.from(balance);

        Optional<BalanceJpaEntity> balanceJpaEntity = springDataBalanceRepository.findById(balanceJpaEntitytoSave.getId());
        if (balanceJpaEntity.isPresent()) {
            saveUpdateBalance(balanceJpaEntity.get(), balance);
        } else {
            balanceJpaEntitytoSave = springDataBalanceRepository.save(balanceJpaEntitytoSave);
        }

        return BalanceMapper.from(balanceJpaEntitytoSave);

    }

    @Override
    public Optional<Balance> findById(String balanceId) {

        Optional<BalanceJpaEntity> balanceJpaEntity = springDataBalanceRepository.findById(balanceId);

        if (balanceJpaEntity.isPresent()) {

            Balance balance = BalanceMapper.from(balanceJpaEntity.get());

            /* relacionar el balance con el grupo
            Optional<Group> groupOptional = springDataGroupTempRepository.findById(balanceJpaEntity.get().getGroupId())
                    .map(GroupMapper::from);*/

           // ?¿? groupOptional.ifPresent(balance::setGroup);

            return Optional.of(balance);
        } else {
            return Optional.empty();
        }
    }


}
