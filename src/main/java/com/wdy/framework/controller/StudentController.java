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

    @GetMapping("/druid")
    public Student druid(){
        return  studentService.druid();
    }
    @DeleteMapping("/getByid")
    public void getByid(@RequestParam(value = "id",required = false) Integer id){
        Student byid = studentService.getByid((long)id);
        System.out.println(byid);
    }
    @GetMapping("/getStu")
    public Result getStu(){
        List<Student> stu = studentService.getStu();
        return Result.success(stu);
    }


}