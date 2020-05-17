package com.bank.ebanking.Respository;

import org.springframework.data.repository.CrudRepository;

import com.bank.ebanking.models.Customer;

/**
 * CustomerRepository Interface
 * 
 * @author AkashRastogi
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
