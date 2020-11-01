package com.wdy.framework.controller;

import com.wdy.framework.entity.Student;
import com.wdy.framework.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-11-01 09:49:07
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    @GetMapping("/druid")
    public Student druid(){
        return  studentService.druid();
    }

}