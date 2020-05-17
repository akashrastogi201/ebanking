package com.bank.ebanking.controllers;


import com.bank.ebanking.Respository.AccountRepository;
import com.bank.ebanking.models.Account;
import com.bank.ebanking.models.Transfer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    private AccountRepository accountRepository;

    public TransferController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostMapping("/transfer")
    @CrossOrigin(origins = "http://localhost:4200")
    public void transfer(@RequestBody Transfer transfer){

        Long transferAmount = transfer.getTransferAmount();
        Account fromAccount = accountRepository.findById(transfer.getFromAccount()).get();

        fromAccount.setAmount(fromAccount.getAmount()-transferAmount);

        Account toAccount = accountRepository.findById(transfer.getToAccount()).get();
        toAccount.setAmount(toAccount.getAmount()+transferAmount);

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);



    }
}
