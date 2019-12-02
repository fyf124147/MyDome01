package com.zking.fyf.service;

import com.zking.fyf.model.Student;
import com.zking.fyf.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IStudentService {

    int add(Student student);

    int edit(Student student);
    int del(Student student);


    int delAll(Student student);
    @Transactional(readOnly = true)
    Student load(Student student);

    @Transactional(readOnly = true)
    List<Student> list(Student student, PageBean pageBean);

}
