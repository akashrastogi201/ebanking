package com.bank.ebanking.Respository;

import org.springframework.data.repository.CrudRepository;

import com.bank.ebanking.models.Account;

/**
 * AccountRepository Interface 
 *
 * @author AkashRastogi
 */
public interface AccountRepository extends CrudRepository<Account, Long> {
}
