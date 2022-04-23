package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.gateway.CustomerGateway;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerGateway customerGateway;

    public CustomerService(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public void saveCustomer(Customer customer){
        validateCustomer(customer);
        customerGateway.save(customer);
    }

    public void validateCustomer(Customer customer){
        // apply validations!
    }
}
