package com.microservices.shared.expenses.exception;


import com.microservices.shared.expenses.util.GroupErrorCode;


public class GroupNameUsedBadRequestException extends BusinessValidationException {

    public GroupNameUsedBadRequestException() {
        super(GroupErrorCode.GROUP_NAME_REPEATED);
    }
}
