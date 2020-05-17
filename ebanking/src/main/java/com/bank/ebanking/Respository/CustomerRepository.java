package com.bank.ebanking.Respository;

import com.bank.ebanking.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
