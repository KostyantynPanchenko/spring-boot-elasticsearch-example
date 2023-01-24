package com.example.elasticsearch.controler;

import com.example.elasticsearch.model.Account;
import com.example.elasticsearch.service.AccountService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  private final AccountService service;

  public AccountController(AccountService service) {
    this.service = service;
  }

  @GetMapping("/accounts")
  public List<Account> getAll() {
    return service.getAll();
  }
}
