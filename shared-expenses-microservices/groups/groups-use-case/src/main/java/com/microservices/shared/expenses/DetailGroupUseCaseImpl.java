package com.microservices.shared.expenses;


import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.port.in.DetailGroupUseCase;
import com.microservices.shared.expenses.port.in.model.DetailGroupQuery;
import com.microservices.shared.expenses.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DetailGroupUseCaseImpl implements DetailGroupUseCase {

    private final GroupService groupService;

    @Transactional(readOnly = true)
    @Override
    public Group execute(DetailGroupQuery query) {
        return groupService.retrieveGroup(query.getId());
    }
}
