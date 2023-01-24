package com.example.elasticsearch.repository.declarative;

import com.example.elasticsearch.model.Account;
import java.util.Optional;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AccountRepository extends ElasticsearchRepository<Account, Long> {

  Optional<Account> findAccountByAccountNumber(final Long accountNumber);

  /**
   * Translates into the following:
   * {
   *   "query": {
   *     "match": {
   *       "lastname": {
   *         "query": "John"
   *       }
   *     }
   *   }
   * }
   *
   * @param lastName - the lastName to search by.
   * @return instance of {@link Optional<Account>}
   */
  @Query("{\"match\": {\"lastname\": {\"query\": \"?0\"}}}")
  Optional<Account> findByLastName(final String lastName);

}
