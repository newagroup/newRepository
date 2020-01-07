package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>赞实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduPraise extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键id
    private Integer  userId;//用户id
    private Integer  targetId;//点赞的对象id
    private Integer  type;//点赞类型 1问答点赞 2问答评论点赞 3 文章点赞数4 评论点赞
    private java.util.Date  addTime;//添加时间
    
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
	
   	public Integer getTargetId() {
		return targetId;
	}
	public void setTargetId(Integer  targetId) {
		this.targetId = targetId;
	}
	
   	public Integer getType() {
		return type;
	}
	public void setType(Integer  type) {
		this.type = type;
	}
	
   	public java.util.Date getAddTime() {
		return addTime;
	}
	public void setAddTime(java.util.Date  addTime) {
		this.addTime = addTime;
	}
	
}