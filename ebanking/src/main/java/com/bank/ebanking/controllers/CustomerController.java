package com.bank.ebanking.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.ebanking.models.Customer;
import com.bank.ebanking.services.CustomerService;

/**
 * Controller class for Customer
 * 
 * @author AkashRastogi
 *
 */
@RestController
@RequestMapping("/customer")

public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping("/add")
	public Customer createCustomer(@RequestBody Customer customer) {

		System.out.println(customer);
		return customerService.createCustomer(customer);

	}

	@GetMapping("/{id}")
	public Customer showCustomer(@PathVariable Long id) {
		return customerService.showCustomer(id);
	}

	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {

		return customerService.updateCustomer(customer);
	}

	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}

}
