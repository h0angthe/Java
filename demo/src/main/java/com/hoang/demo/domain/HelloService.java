package com.hoang.demo.domain;

import com.hoang.demo.infra.entity.Customer;
import com.hoang.demo.model.InputHello;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HelloService {

    int id ;

    List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList () {
        return customerList;
    }

    public String addNew(Customer customer) {
        customer.setId(id++);
        customer.setAge(customer.getAge());
        customer.setName(customer.getName());
        customerList.add(customer);

        return "add new success";
    }

    public String put(Customer customer){
        for(Customer ct : customerList){
            if(ct.getId() == customer.getId()){
            ct.setName(customer.getName());
            ct.setAge(customer.getAge());
            }
        }
       return "Sửa thành công";
    }

    public String del(Customer customer) {
        for(Customer ct : customerList){
                if(ct.getId() == customer.getId()){
                    customerList.remove(ct);
                }
        }
        return "Bạn đã xóa id: ";
    }
}
