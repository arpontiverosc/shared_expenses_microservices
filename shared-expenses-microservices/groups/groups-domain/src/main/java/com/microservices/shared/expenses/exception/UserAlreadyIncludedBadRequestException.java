package com.microservices.shared.expenses.exception;


import com.microservices.shared.expenses.util.GroupErrorCode;

public class UserAlreadyIncludedBadRequestException extends BusinessValidationException {

    public UserAlreadyIncludedBadRequestException() {
        super(GroupErrorCode.USER_ALREADY_INCLUDED);
    }
}
