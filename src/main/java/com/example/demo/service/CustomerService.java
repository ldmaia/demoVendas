package com.example.demo.service;

import com.example.demo.repository.entity.Customer;

public interface CustomerService {

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(Customer customer);

    void delete(Integer id);


}
