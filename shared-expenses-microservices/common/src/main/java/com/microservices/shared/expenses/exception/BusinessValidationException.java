package com.microservices.shared.expenses.exception;

public class BusinessValidationException extends RuntimeException {

  protected BusinessValidationException(String message) {
    super(message);
  }

  protected BusinessValidationException(String message, Throwable cause) {
    super(message, cause);
  }
}
