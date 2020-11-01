package com.wdy.framework.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdy.framework.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-01 09:49:04
 */
public interface StudentDao extends BaseMapper<Student> {

}