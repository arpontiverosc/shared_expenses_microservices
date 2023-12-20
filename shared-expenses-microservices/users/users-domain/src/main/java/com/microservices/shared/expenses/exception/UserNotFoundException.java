package com.microservices.shared.expenses.exception;


import com.microservices.shared.expenses.util.UserErrorCode;

public class UserNotFoundException extends NotFoundException {

  public UserNotFoundException() {
    super(UserErrorCode.NOT_FOUND);
  }
}
