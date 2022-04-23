package com.example.demo.repository.gateway;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Component;


public interface CustomerGateway {
    public void save(Customer customer);
}
