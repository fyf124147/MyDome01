package com.zking.fyf.service.impl;

import com.zking.fyf.mapper.OrderMapper;
import com.zking.fyf.model.Order;
import com.zking.fyf.service.IOrderService;
import com.zking.fyf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public int add(Order order) {
        return 0;
    }

    @Override
    public int edit(Order order) {
        return 0;
    }

    @Override
    public int del(Order order) {
        return 0;
    }

    @Override
    public Order load(Order order) {
        return null;
    }

    @Override
    public Order Orderload(Order order) {
        return orderMapper.loadCasecode(order);
    }

    @Override
    public List<Order> list(Order order, PageBean pageBean) {
        return null;
    }
}
