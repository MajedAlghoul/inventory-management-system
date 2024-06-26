package com.jed9h3.inventorymanagementsystem.repository;

import com.jed9h3.inventorymanagementsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Optional<Customer> getAllCustomers();
}

