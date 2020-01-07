package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>课程与科目中间表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduCourseSubject extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private Integer  courseId;//课程id
    private Integer  subjectId;//分类id
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer  courseId) {
		this.courseId = courseId;
	}
	
   	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer  subjectId) {
		this.subjectId = subjectId;
	}
	
}