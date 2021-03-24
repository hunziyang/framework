package com.wdy.framework.controller;

import com.wdy.framework.service.StudentService;
import com.wdy.framework.util.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    /**
     * 服务对象
     */
    @Autowired
    private StudentService studentService;
    @GetMapping("/insert")
    public Result insert(){
        studentService.insertStudent();
        return Result.success();
    }
    @GetMapping("/update")
    public Result update(){
        studentService.updateStudent();
        return Result.success();
    }

}