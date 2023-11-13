package com.tech.esg.util;

import com.tech.esg.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class Mapper {
    public List<Customer> mapToEntity(List<com.tech.esg.model.Customer> customers) {
        List<Customer> customerEntity = new ArrayList<>();

        for (com.tech.esg.model.Customer customer : customers) {
            customerEntity.add(new Customer(
                    customer.getCustomerRef(),
                    customer.getCustomerName(),
                    customer.getAddressLine1(),
                    customer.getAddressLine2(),
                    customer.getTown(),
                    customer.getCounty(),
                    customer.getCountry(),
                    customer.getPostcode()
            ));
        }

        return customerEntity;
    }

    public com.tech.esg.model.Customer mapFromEntity(Customer customer) {
        return new com.tech.esg.model.Customer(
                customer.getCustomerRef(),
                customer.getCustomerName(),
                customer.getAddressLine1(),
                customer.getAddressLine2(),
                customer.getTown(),
                customer.getCounty(),
                customer.getCountry(),
                customer.getPostcode()
        );
    }
}
