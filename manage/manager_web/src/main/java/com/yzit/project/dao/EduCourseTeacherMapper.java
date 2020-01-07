package com.yzit.project.dao;

import com.yzit.project.entity.EduCourseTeacher;
import com.yzit.project.entity.EduCourseTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseTeacherMapper {
    int countByExample(EduCourseTeacherExample example);

    int deleteByExample(EduCourseTeacherExample example);

    int insert(EduCourseTeacher record);

    int insertSelective(EduCourseTeacher record);

    List<EduCourseTeacher> selectByExample(EduCourseTeacherExample example);

    int updateByExampleSelective(@Param("record") EduCourseTeacher record, @Param("example") EduCourseTeacherExample example);

    int updateByExample(@Param("record") EduCourseTeacher record, @Param("example") EduCourseTeacherExample example);
}