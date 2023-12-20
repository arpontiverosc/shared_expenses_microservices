package com.microservices.shared.expenses.exception;


import com.microservices.shared.expenses.util.GroupErrorCode;

public class GroupNotFoundException extends NotFoundException {

  public GroupNotFoundException() {
    super(GroupErrorCode.NOT_FOUND);
  }
}
