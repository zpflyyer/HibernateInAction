package com.pengfei.hibernate.getstart.dao;

import com.pengfei.hibernate.getstart.model.Student;

import java.util.List;

/**
 * Created by zhaopen on 3/27/2017.
 */
public interface StudentDao {
    void insert(List<Student> studentList);
}
