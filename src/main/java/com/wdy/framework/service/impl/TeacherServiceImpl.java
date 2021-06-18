package com.wdy.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wdy.framework.dao.TeacherDao;
import com.wdy.framework.entity.Teacher;
import com.wdy.framework.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-11-01 09:49:08
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherDao,Teacher> implements TeacherService {
    @Resource
    private TeacherDao teacherDao;
}