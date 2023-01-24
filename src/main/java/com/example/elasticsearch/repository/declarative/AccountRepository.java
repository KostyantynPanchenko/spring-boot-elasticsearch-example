package com.example.elasticsearch.repository.declarative;

import com.example.elasticsearch.model.Account;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AccountRepository extends ElasticsearchRepository<Account, Long> {}
