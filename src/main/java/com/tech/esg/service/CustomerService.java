package com.tech.esg.service;

import com.tech.esg.model.Customer;
import com.tech.esg.repository.CustomerRepository;
import com.tech.esg.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    private final Mapper mapper = new Mapper();

    public void createCustomers(List<Customer> customers) {
        List<com.tech.esg.entity.Customer> customerEntity = mapper.mapToEntity(customers);
        customerRepository.saveAll(customerEntity);
    }

    public Customer findCustomerByReference(int customerRef) {
        com.tech.esg.entity.Customer customerEntity = customerRepository.findCustomerByReference(customerRef);
        return mapper.mapFromEntity(customerEntity);
    }
}
