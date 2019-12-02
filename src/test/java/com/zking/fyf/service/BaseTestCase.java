package com.zking.fyf.service;

import com.zking.fyf.model.Student;
import com.zking.fyf.util.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BaseTestCase {
    protected  PageBean pageBean;

    @Before
    public void before(){
        this.pageBean = new PageBean();
    }

}