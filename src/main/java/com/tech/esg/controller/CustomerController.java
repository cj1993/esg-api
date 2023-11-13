package com.tech.esg.controller;

import com.tech.esg.model.Customer;
import com.tech.esg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public void createCars(@RequestBody List<Customer> customers) {
        customerService.createCustomers(customers);
    }

    @GetMapping("/customer/{customerRef}")
    public Customer createCars(@PathVariable int customerRef) {
        return customerService.findCustomerByReference(customerRef);
    }
}
