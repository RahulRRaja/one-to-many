package com.relational.onetomany.repository;

import com.relational.onetomany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
}

