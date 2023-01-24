package com.example.elasticsearch.repository.declarative;

import com.example.elasticsearch.model.Account;
import java.util.Optional;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AccountRepository extends ElasticsearchRepository<Account, Long> {

  Optional<Account> findAccountByAccountNumber(final Long accountNumber);

}
