package com.example.elasticsearch.controler;

import com.example.elasticsearch.model.Account;
import com.example.elasticsearch.service.AccountService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

  private final AccountService service;

  public AccountController(AccountService service) {
    this.service = service;
  }

  @GetMapping
  public List<Account> getAll() {
    return service.getAll();
  }

  @GetMapping("/{accNo}")
  public Account getOneByAccountNumber(@PathVariable(name = "accNo") final Long accNo) {
    return service.getByAccountNumber(accNo);
  }
}
