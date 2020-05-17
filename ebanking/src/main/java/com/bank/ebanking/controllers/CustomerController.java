package com.bank.ebanking.controllers;


import com.bank.ebanking.models.Customer;
import com.bank.ebanking.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/add")
    public Customer createCustomer(@RequestBody Customer customer){

        System.out.println(customer);
        return customerService.createCustomer(customer);

    }

    @GetMapping("/{id}")
    public Customer showCustomer(@PathVariable Long id){
        return customerService.showCustomer(id);
    }

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer){

        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteCustomer(@PathVariable Long id){
         customerService.deleteCustomer(id);
    }



}
