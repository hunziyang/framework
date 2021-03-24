package com.wdy.framework.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdy.framework.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends BaseMapper<Student> {

}