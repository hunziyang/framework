package com.wdy.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao,Student> implements StudentService {
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
        Student s1 = studentDao.selectById(45);
        s1.setName("11111111");
        studentDao.updateById(s1);
    }
}