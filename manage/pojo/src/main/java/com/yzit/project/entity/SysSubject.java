package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>科目实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class SysSubject extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  subjectId;//主键
    private String  subjectName;//专业名称
    private Integer  status;//状态 0:默认 1:删除
    private java.util.Date  createTime;//创建时间
    private Integer  parentId;//父ID
    private Integer  sort;//排序字段
    
   	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer  subjectId) {
		this.subjectId = subjectId;
	}
	
   	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String  subjectName) {
		this.subjectName = subjectName;
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
	
   	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer  parentId) {
		this.parentId = parentId;
	}
	
   	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer  sort) {
		this.sort = sort;
	}
	
}