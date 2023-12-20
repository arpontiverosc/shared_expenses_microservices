package com.microservices.shared.expenses.exception;


import com.microservices.shared.expenses.util.UserErrorCode;

public class UserNameUsedBadRequestException extends BusinessValidationException {

  public UserNameUsedBadRequestException() {
    super(UserErrorCode.USER_NAME_REPEATED);
  }
}
