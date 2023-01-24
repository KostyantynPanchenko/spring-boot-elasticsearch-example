package com.example.elasticsearch.service;

import com.example.elasticsearch.exception.AccountNotFoundException;
import com.example.elasticsearch.model.Account;
import com.example.elasticsearch.repository.declarative.AccountRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

  private final AccountRepository repository;

  public AccountService(AccountRepository repository) {
    this.repository = repository;
  }

  public List<Account> getAll() {
    final var list = new ArrayList<Account>();
    repository.findAll().forEach(list::add);
    return list;
  }

  public Account getByAccountNumber(final Long accNo) {
    return repository.findAccountByAccountNumber(accNo).orElseThrow(() -> new AccountNotFoundException(accNo));
  }
}
