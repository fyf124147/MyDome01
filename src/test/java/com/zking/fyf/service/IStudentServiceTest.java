package com.zking.fyf.service;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.zking.fyf.mapper.StudentMapper;
import com.zking.fyf.model.Student;
import com.zking.fyf.service.impl.StudentServiceImpl;
import com.zking.fyf.util.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.util.RedisInputStream;

import java.util.List;

public class IStudentServiceTest extends BaseTestCase{
    @Autowired
    private  RedisTemplate redisTemplate;
@Autowired
    private  IStudentService studentService;

    private Student student;

    private SqlSession sqlSession;

    @Before
    public  void before(){
        super.before();
        this.student = new Student();

    }
    @Test
       public void add() {
        student.setSname("长大");
        student.setAge(20);
        student.setRemark("adaf");

        this.studentService.add(student);
    }

    @Test
    public void edit() {
    }

    @Test
    public void delAll() {
        student.setSids(new Integer[]{5,6});
        this.studentService.delAll(student);
    }

    @Test
    public void del() {
        student.setSid(1);
        this.studentService.del(student);
    }

    @Test
    public void load() {
        student.setSid(3);
        Student s= studentService.load(student);
        System.out.println(s);
        System.out.println("xxxxxxxxxx");
        s=studentService.load(student);
        System.out.println(s);

    }

    @Test
    public void list() throws Exception{
       // student.setSname("张");
       // student.setMINAge(1);
       // student.setMAXAge(18);
        pageBean.setPage(1);
        pageBean.setRows(3);

        List<Student> studentList = studentService.list(student, pageBean );
        for (Student s: studentList) {
            System.out.println(s);
        }
    }
    @Test
    public void test(){
        redisTemplate.opsForValue().set("uname","zs");
    }
}