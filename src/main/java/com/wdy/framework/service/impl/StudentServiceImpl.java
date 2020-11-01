package com.wdy.framework.service.impl;

import com.wdy.framework.dao.StudentDao;
import com.wdy.framework.entity.Student;
import com.wdy.framework.service.StudentService;
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
    @Resource
    private StudentDao studentDao;

    @Override
    public Student druid() {
        return studentDao.selectById(1);
    }
}