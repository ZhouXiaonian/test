package com.hr.springboot4.controller;

import com.hr.springboot4.entity.Students;
import com.hr.springboot4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        //呃呃呃呃呃
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("stuList",studentService.findAll());
        return modelAndView;
    }

    @RequestMapping("/add")
    public ModelAndView addStudent(Students students){
        studentService.addStudent(students);
        return new ModelAndView("add");
    }

    @RequestMapping("/initPage")
    public ModelAndView initPage(){
        return new ModelAndView("add");
    }

}
