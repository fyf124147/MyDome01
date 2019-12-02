package com.zking.fyf.service;

import com.zking.fyf.model.Order;
import com.zking.fyf.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IOrderService {

    int add(Order order);

    int edit(Order order);

    int del(Order order);
    @Transactional(readOnly = true)
    Order load(Order order);

    @Transactional(readOnly = true)
    Order Orderload(Order order);

    @Transactional(readOnly = true)
    List<Order> list(Order order, PageBean pageBean);
}
