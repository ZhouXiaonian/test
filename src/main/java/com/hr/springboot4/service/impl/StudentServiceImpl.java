package com.hr.springboot4.service.impl;

import com.hr.springboot4.dao.StudentDao;
import com.hr.springboot4.entity.Students;
import com.hr.springboot4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Students> findAll() {
        return studentDao.findAll();
    }

    @Override
    public int addStudent(Students students) {
        studentDao.save(students);
        return 1;
    }
}
