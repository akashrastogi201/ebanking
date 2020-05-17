package com.bank.ebanking.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.ebanking.models.Account;
import com.bank.ebanking.models.Customer;
import com.bank.ebanking.services.AccountService;
import com.bank.ebanking.services.CustomerService;

/**
 * Controller class for account
 * 
 * @author AkashRastogi 
 *
 */
@RestController
public class AccountController {

	private AccountService accountService;
	private CustomerService customerService;

	public AccountController(AccountService accountService, CustomerService customerService) {
		this.accountService = accountService;
		this.customerService = customerService;
	}

	@PostMapping("/customer/{customerId}/account/new")
	@CrossOrigin(origins = "http://localhost:4200")
	public Account createAccount(@RequestBody Account account, @PathVariable Long customerId) {

		Customer customer = customerService.showCustomer(customerId);
		account.setCustomer(customer);
		return accountService.createOrUpdateAccount(account);

	}

	@GetMapping("/accounts")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Account> getAllAccounts() {

		return accountService.getAllAccounts();

	}

	@PutMapping("/account/{accountId}")
	public Account updateAccount(@RequestBody Account account, @PathVariable Long accountId) {

		Optional<Account> optionalAccount = accountService.getAccount(accountId);
		if (optionalAccount.isPresent()) {
			return accountService.createOrUpdateAccount(account);
		} else {
			throw new RuntimeException("Account Not found!");
		}
	}

	@DeleteMapping("account/{accountId}")
	public void deleteAccount(@PathVariable Long accountId) {
		accountService.deleteAccount(accountId);
	}
}
