package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>教师表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduTeacher extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//教师ID
    private String  name;//教师名称
    private String  education;//教师资历,一句话说明老师
    private java.lang.Object  career;//教师简介
    private Integer  isStar;//头衔 1高级讲师2首席讲师
    private String  picPath;//图片路径
    private Integer  status;//状态:0正常1删除
    private java.util.Date  createTime;//创建时间
    private java.util.Date  updateTime;//更新时间
    private Integer  subjectId;//专业ID
    private Integer  sort;//排序
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public String getName() {
		return name;
	}
	public void setName(String  name) {
		this.name = name;
	}
	
   	public String getEducation() {
		return education;
	}
	public void setEducation(String  education) {
		this.education = education;
	}
	
   	public java.lang.Object getCareer() {
		return career;
	}
	public void setCareer(java.lang.Object  career) {
		this.career = career;
	}
	
   	public Integer getIsStar() {
		return isStar;
	}
	public void setIsStar(Integer  isStar) {
		this.isStar = isStar;
	}
	
   	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String  picPath) {
		this.picPath = picPath;
	}
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
   	public java.util.Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.util.Date  createTime) {
		this.createTime = createTime;
	}
	
   	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.util.Date  updateTime) {
		this.updateTime = updateTime;
	}
	
   	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer  subjectId) {
		this.subjectId = subjectId;
	}
	
   	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer  sort) {
		this.sort = sort;
	}
	
}