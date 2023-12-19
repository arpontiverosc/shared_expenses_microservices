package com.microservices.shared.expenses;


import com.microservices.shared.expenses.model.Balance;
import com.microservices.shared.expenses.port.in.CreateBalanceUseCase;
import com.microservices.shared.expenses.port.in.model.CreateBalanceCommand;
import com.microservices.shared.expenses.port.out.SaveBalanceRepository;
import com.microservices.shared.expenses.service.GroupServiceTemp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateBalanceUseCaseImpl implements CreateBalanceUseCase {

    private final SaveBalanceRepository saveBalanceRepository;
    private final GroupServiceTemp groupService;

    @Transactional
    @Override
    public Balance execute(CreateBalanceCommand command) {
       return saveBalanceRepository.save(createBalanceFromCommand(command));
    }

    private Balance createBalanceFromCommand(CreateBalanceCommand command){
        return Balance.Builder.builder()
        .id(UUID.randomUUID().toString())
        .balanceName(command.getBalanceName())
        .description(command.getDescription())
        .group(groupService.retrieveGroup(command.getGroupId()))
        .createdAt(OffsetDateTime.now())
         .build();
    }

}
