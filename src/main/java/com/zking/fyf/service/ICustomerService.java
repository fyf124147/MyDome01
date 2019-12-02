package com.zking.fyf.service;

import com.zking.fyf.model.Customer;
import com.zking.fyf.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ICustomerService {
    int add(Customer customer);

    int edit(Customer customer);

    int del(Customer customer);

    @Transactional(readOnly = true)
    Customer load(Customer customer);

    @Transactional
    Customer selectCustomer(Customer customer);

    @Transactional(readOnly = true)
    List<Customer> list(Customer customer, PageBean pageBean);
}
