package com.relational.onetomany.controller;

import com.relational.onetomany.entity.Customer;
import com.relational.onetomany.repository.CustomerRepository;
import com.relational.onetomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody Controller request)
    {
        return CustomerRepository.save(request.getCustomer());

    }
    @GetMapping("/findAllOrder")
    public List<Customer> findAllOrders()
    {
        return CustomerRepository.findAll();
    }
}
