package com.bank.ebanking.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.ebanking.Respository.CustomerRepository;
import com.bank.ebanking.models.Customer;

/**
 * CustomerService comprises all method for CRUD operation 
 * 
 * @author AkashRastogi
 *
 */
@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer){

        return customerRepository.save(customer);

    }

    public Customer showCustomer(Long id){
        return customerRepository.findById(id).get();
    }

    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id){
         customerRepository.deleteById(id);
    }

}
