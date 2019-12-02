package com.zking.fyf.mapper;

import com.zking.fyf.model.Customer;
import com.zking.fyf.model.Student;
import com.zking.fyf.util.PageBean;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);



    Customer selectByPrimaryKey(Integer customerId);

    Customer selectCustomer(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> list(Customer customer);

}