package com.lexiaoyao.mybatisdemo.mapper;

import com.lexiaoyao.mybatisdemo.domain.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    Teacher getById(@Param("id") Integer id);
}
