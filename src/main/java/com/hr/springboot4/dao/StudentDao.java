package com.hr.springboot4.dao;


import com.hr.springboot4.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Students,Integer> {

}
