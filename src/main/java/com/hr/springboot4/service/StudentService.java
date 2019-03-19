package com.hr.springboot4.service;

import com.hr.springboot4.entity.Students;

import java.util.List;

public interface StudentService {
    public List<Students> findAll();

    public int addStudent(Students students);
}
