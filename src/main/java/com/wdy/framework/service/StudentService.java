package com.wdy.framework.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wdy.framework.entity.Student;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2020-11-01 09:49:06
 */
public interface StudentService extends IService<Student> {

    // 新增
    void insertStudent();

    // 修改
    void updateStudent();

}