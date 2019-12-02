package com.zking.fyf.service;

import com.zking.fyf.mapper.OrderMapper;
import com.zking.fyf.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

public class IOrderServiceTest extends BaseTestCase {
    @Autowired
    private IOrderService orderService;

    private Order order;

    @Before
    public void before(){
        super.before();
        this.order=new Order();
    }

    @Test
    public void add() {
    }

    @Test
    public void edit() {
    }

    @Test
    public void del() {
    }

    @Test
    public void load() {
    }

    @Test
    public void Orderload() {
        order.setOrderId(1);
        Order orderload = this.orderService.Orderload(order);
        System.out.println(orderload);
    }
    @Test
    public void list() {
    }
}