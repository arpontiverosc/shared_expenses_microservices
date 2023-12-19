package com.microservices.shared.expenses.exception;

import com.microservices.shared.expenses.util.BalanceErrorCode;


public class BalanceNotFoundException extends NotFoundException {
    public BalanceNotFoundException() {
        super(BalanceErrorCode.NOT_FOUND);
    }
}
