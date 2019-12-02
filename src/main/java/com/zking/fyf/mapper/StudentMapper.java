package com.zking.fyf.mapper;

import com.zking.fyf.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey (Integer sid);
    int delAll(Student record);

    int insert(Student record);

    //int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> list(Student student);
}