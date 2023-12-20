package com.microservices.shared.expenses.port.in;


import com.microservices.shared.expenses.model.Group;
import com.microservices.shared.expenses.port.in.model.DetailGroupQuery;

public interface DetailGroupUseCase {

    Group execute(DetailGroupQuery query);
}
