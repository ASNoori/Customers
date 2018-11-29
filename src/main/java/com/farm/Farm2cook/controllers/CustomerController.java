package com.farm.Farm2cook.controllers;
import com.farm.Farm2cook.models.Customer;
import  com.farm.Farm2cook.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {



    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(method=RequestMethod.GET, value="/customers")
    public Iterable<Customer> customer() {
        return customerRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/customers")
    public Customer save(@RequestBody Customer customer) {
        customerRepository.save(customer);

        return customer;
    }
   
}

   