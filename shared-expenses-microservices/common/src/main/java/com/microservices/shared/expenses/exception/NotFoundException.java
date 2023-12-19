package com.microservices.shared.expenses.exception;

public class NotFoundException extends RuntimeException {

  protected NotFoundException(String message) {
    super(message);
  }

  protected NotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
