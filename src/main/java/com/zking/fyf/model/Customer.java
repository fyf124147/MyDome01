package com.zking.fyf.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class Customer {
    private Integer customerId;

    private String customerName;

    private List<Order> orderList = new ArrayList<>();

    public Customer(Integer customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Customer() {
        super();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName(String s) {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}