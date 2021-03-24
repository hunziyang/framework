package com.wdy.framework.service.impl;

import com.wdy.framework.dao.StudentDao;
import com.wdy.framework.entity.Student;
import com.wdy.framework.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2020-11-01 09:49:06
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void insertStudent() {
        Student student =new Student();
        student.setAge(18);
        student.setName("wdy");
        studentDao.insert(student);
    }

    @Override
    public void updateStudent() {
        Student student =new Student();
        student.setId(22L);
        student.setName("w");
        studentDao.updateById(student);
    }
}