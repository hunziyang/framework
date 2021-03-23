package com.wdy.framework.controller;

import com.wdy.framework.entity.Student;
import com.wdy.framework.service.StudentService;
import com.wdy.framework.util.result.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-11-01 09:49:07
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

}