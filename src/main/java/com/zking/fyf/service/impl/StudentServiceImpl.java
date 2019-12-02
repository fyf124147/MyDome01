package com.zking.fyf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.fyf.mapper.StudentMapper;
import com.zking.fyf.model.Student;
import com.zking.fyf.service.IStudentService;
import com.zking.fyf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@Scope(value = "prototype"  )
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    public StudentServiceImpl() {
    }

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int edit(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public int del(Student student) {
        return studentMapper.deleteByPrimaryKey(student.getSid());
    }

    @Override
    public int delAll(Student student) {
        return studentMapper.delAll(student);
    }

    @Override
    public Student load(Student student) {
        return studentMapper.selectByPrimaryKey(student.getSid());
    }

    @Override
    public List<Student> list(Student student, PageBean pageBean) {
        List<Student> studentList = this.studentMapper.list(student);
        return studentList;
    }
}
