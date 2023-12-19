package com.microservices.shared.expenses.port.out;

import com.microservices.shared.expenses.model.Group;

import java.util.Optional;

public interface FindGroupByIdRepository {

    Optional<Group> findById(String id);
}
