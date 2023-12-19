package com.microservices.shared.expenses.exception;

public class InternalErrorException extends RuntimeException {

  public InternalErrorException(String message) {
    super(message);
  }

  public InternalErrorException(Throwable cause) {
    super(cause);
  }

  public InternalErrorException(String message, Throwable cause) {
    super(message, cause);
  }
}
