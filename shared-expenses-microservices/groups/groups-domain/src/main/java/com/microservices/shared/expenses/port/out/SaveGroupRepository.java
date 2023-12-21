package com.microservices.shared.expenses.port.out;


import com.microservices.shared.expenses.model.Group;

public interface SaveGroupRepository {
    Group save(Group group);
}
