package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>课程学习记录实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduCourseStudyhistory extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private Integer  userId;//用户id
    private Integer  courseId;//课程id
    private Integer  kpointId;//节点id
    private Integer  playercount;//观看次数,累加
    private String  courseName;//课程名称
    private String  kpointName;//节点名称
    private java.lang.Object  databack;//playercount小于20时记录,备注观看的时间，叠加
    private java.util.Date  updateTime;//最后观看时间
    
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
	
   	public Integer getPlayercount() {
		return playercount;
	}
	public void setPlayercount(Integer  playercount) {
		this.playercount = playercount;
	}
	
   	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String  courseName) {
		this.courseName = courseName;
	}
	
   	public String getKpointName() {
		return kpointName;
	}
	public void setKpointName(String  kpointName) {
		this.kpointName = kpointName;
	}
	
   	public java.lang.Object getDataback() {
		return databack;
	}
	public void setDataback(java.lang.Object  databack) {
		this.databack = databack;
	}
	
   	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.util.Date  updateTime) {
		this.updateTime = updateTime;
	}
	
}