package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>课程笔记实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduCourseNote extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键
    private Integer  userId;//用户ID
    private Integer  courseId;//课程id
    private Integer  kpointId;//节点ID
    private java.lang.Object  content;//笔记信息
    private java.sql.Timestamp  updateTime;//修改时间
    private Integer  status;//0公开1隐藏
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer  userId) {
		this.userId = userId;
	}
	
   	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer  courseId) {
		this.courseId = courseId;
	}
	
   	public Integer getKpointId() {
		return kpointId;
	}
	public void setKpointId(Integer  kpointId) {
		this.kpointId = kpointId;
	}
	
   	public java.lang.Object getContent() {
		return content;
	}
	public void setContent(java.lang.Object  content) {
		this.content = content;
	}
	
   	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.sql.Timestamp  updateTime) {
		this.updateTime = updateTime;
	}
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
}