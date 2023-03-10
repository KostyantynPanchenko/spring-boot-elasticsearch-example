package com.example.elasticsearch.exception;

public class AccountNotFoundException extends RuntimeException {

  public AccountNotFoundException(final Long accNo) {
    super("Account with No" + accNo + " not found");
  }

  public AccountNotFoundException(final String lastName) {
    super("Account with last name" + lastName + " not found");
  }
}
