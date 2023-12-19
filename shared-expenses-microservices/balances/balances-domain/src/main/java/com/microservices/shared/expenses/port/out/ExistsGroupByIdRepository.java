package com.microservices.shared.expenses.port.out;

public interface ExistsGroupByIdRepository {
    boolean existsById(String groupId);
}
