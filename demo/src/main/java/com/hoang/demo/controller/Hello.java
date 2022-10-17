package com.hoang.demo.controller;

import com.hoang.demo.domain.HelloService;
import com.hoang.demo.infra.entity.Customer;
import com.hoang.demo.model.InputHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Hello {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello (@RequestBody InputHello input) {
        return "Hello world";
    }

    @PostMapping("/hello/guest")
    public String hello2 (@RequestBody InputHello input) {
        return "Hello " + input.getName();
    }


    @GetMapping("/customer")
    public List<Customer> customer (@RequestBody InputHello input) {
        return helloService.getCustomerList();
    }

    @GetMapping("/customer/id")
    public Customer getcustomerbyID (@RequestBody InputHello input) {
        Customer customer = new Customer();
        customer.setId(input.getId());
        return helloService.getCustomerbyId(customer);
    }

    @GetMapping("/customer/nameage")
    public Customer getcustomerbyNameAge (@RequestBody InputHello input) {
        Customer customer = new Customer();
        customer.setName(input.getName());
        customer.setAge(input.getAge());
        return helloService.getCustomerbyNameAge(customer);
    }

    @PostMapping("/customer")
    public String addNew (@RequestBody InputHello input) {
        Customer customer = new Customer();
        customer.setName(input.getName());
        customer.setAge(input.getAge());
        return helloService.addNew(customer);
    }

    @PutMapping("/customer")
    public String put (@RequestBody InputHello input) {
        Customer customer = new Customer();
        customer.setId(input.getId());
        customer.setName(input.getName());
        customer.setAge(input.getAge());

        return helloService.put(customer);
    }

    @DeleteMapping("/customer")
    public String del (@RequestBody InputHello input) {
        Customer customer = new Customer();
        customer.setId(input.getId());

        return helloService.del(customer);
    }
}
