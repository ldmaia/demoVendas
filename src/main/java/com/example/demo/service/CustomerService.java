package com.example.demo.service;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public void saveCustomer(Customer customer){
        validateCustomer(customer);
        customerRepository.saveAndFlush(customer);
    }

    public void validateCustomer(Customer customer){
        // apply validations!
    }
}
