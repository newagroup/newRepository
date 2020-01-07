package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>问题关于的课程类型实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduQuestionsTag extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  questionsTagId;//主键id
    private String  questionsTagName;//标签名
    private Integer  status;//状态0默认1删除
    private java.util.Date  createTime;//创建时间
    private String  parentId;//父级id
    
   	public Integer getQuestionsTagId() {
		return questionsTagId;
	}
	public void setQuestionsTagId(Integer  questionsTagId) {
		this.questionsTagId = questionsTagId;
	}
	
   	public String getQuestionsTagName() {
		return questionsTagName;
	}
	public void setQuestionsTagName(String  questionsTagName) {
		this.questionsTagName = questionsTagName;
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
	
   	public String getParentId() {
		return parentId;
	}
	public void setParentId(String  parentId) {
		this.parentId = parentId;
	}
	
}