package com.zking.fyf.service.impl;

import com.zking.fyf.mapper.CustomerMapper;
import com.zking.fyf.model.Customer;
import com.zking.fyf.service.ICustomerService;
import com.zking.fyf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int add(Customer customer) {
        return customerMapper.insert(customer);
    }

    @Override
    public int edit(Customer customer) {
        return customerMapper.deleteByPrimaryKey(customer.getCustomerId());

    }

    @Override
    public int del(Customer customer) {
        return customerMapper.deleteByPrimaryKey(customer.getCustomerId());
    }

    @Override
    public Customer load(Customer customer) {
        return customerMapper.selectByPrimaryKey(customer.getCustomerId()) ;

    }

    @Override
    public Customer selectCustomer(Customer customer) {
        return customerMapper.selectCustomer(customer.getCustomerId());
    }

    @Override
    public List<Customer> list(Customer customer, PageBean pageBean) {
        List<Customer> customerList = this.customerMapper.list(customer);
        return customerList;
    }
}
