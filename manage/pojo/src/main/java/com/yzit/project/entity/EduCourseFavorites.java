package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>收藏课程实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduCourseFavorites extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键
    private Integer  courseId;//课程id
    private Integer  userId;//用户ID
    private java.sql.Timestamp  addTime;//创建时间
    
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
	
   	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer  userId) {
		this.userId = userId;
	}
	
   	public java.sql.Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(java.sql.Timestamp  addTime) {
		this.addTime = addTime;
	}
	
}