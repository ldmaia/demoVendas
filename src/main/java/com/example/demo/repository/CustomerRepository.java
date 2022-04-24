package com.example.demo.repository;

import com.example.demo.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
     Customer saveAndFlush(Customer customer);

     List<Customer> findAll();

     Customer findAllById(Integer id);
}
