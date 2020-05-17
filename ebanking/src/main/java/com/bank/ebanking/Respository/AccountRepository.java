package com.bank.ebanking.Respository;

import com.bank.ebanking.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
