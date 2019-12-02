package com.zking.fyf.service;

import com.zking.fyf.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.StyledEditorKit;

import static org.junit.Assert.*;

public class ICustomerServiceTest extends BaseTestCase {
    @Autowired
    private ICustomerService customerService;

    private Customer customer;

    @Before
    public void before(){
        super.before();
        this.customer=new Customer();
    }

    @Test
    public void add() {
       //customer.setCustomerId(7);
        customer.setCustomerName("s");
        customerService.add(customer);
    }

    @Test

    public void edit() {
    }

    @Test
    public void del() {
    }

    @Test
    public void load() {
        customer.setCustomerId(2);
        Customer customeri=this.customerService.load(customer);
        System.out.println(customeri);



    }

    @Test
    public void Customerload() {
        customer.setCustomerId(2);
        Customer customeri=this.customerService.selectCustomer(customer);
        System.out.println(customeri);
        System.out.println(customeri.getOrderList());

    }

    @Test
    public void list() {

    }
}