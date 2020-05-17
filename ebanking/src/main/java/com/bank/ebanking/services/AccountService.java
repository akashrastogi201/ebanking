package com.bank.ebanking.services;

import com.bank.ebanking.Respository.AccountRepository;
import com.bank.ebanking.models.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createOrUpdateAccount(Account account){

        return accountRepository.save(account);
    }

    public Optional<Account> getAccount(Long id){
        return accountRepository.findById(id);
    }

    public void deleteAccount(Long id){

        accountRepository.deleteById(id);
    }

    public List<Account> getAllAccounts(){
        List<Account> accounts = new ArrayList<>();
         accountRepository.findAll().forEach(accounts::add);
         return accounts;

    }



}
