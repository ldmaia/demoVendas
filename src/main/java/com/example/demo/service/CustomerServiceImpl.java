package com.example.demo.service;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.entity.Customer;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    private final EntityManager entityManager;

    public CustomerServiceImpl(CustomerRepository customerRepository, EntityManager entityManager) {
        this.customerRepository = customerRepository;
        this.entityManager = entityManager;
    }




    public void validateCustomer(Customer customer) {
        // apply validations!
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        //validateCustomer(customer);
        entityManager.persist(customer);
        //customerRepository.saveAndFlush(customer);
        return customer;
    }

    @Override
    @Transactional
    public Customer update(Customer customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        entityManager.remove(customer);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Customer customer = entityManager.find(Customer.class,id);
        delete(customer);
    }
}
