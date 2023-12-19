package com.microservices.shared.expenses.port.out;

public interface ExistsUserByIdRepository {
    boolean existsById(String userId);
}
