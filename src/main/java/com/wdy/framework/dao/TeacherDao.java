package com.wdy.framework.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdy.framework.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Teacher)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-01 09:49:08
 */
public interface TeacherDao extends BaseMapper<Teacher> {

}