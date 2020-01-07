package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>发送自手机的历史记录实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduMobilesendHistory extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private java.lang.Object  mobile;//
    private Integer  userId;//
    private java.lang.Object  content;//
    private java.util.Date  createTime;//
    private java.util.Date  sendTime;//定时发送时间
    private Integer  status;//1 已发送 2 未发送
    private Integer  type;//1 正常 2 定时
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public java.lang.Object getMobile() {
		return mobile;
	}
	public void setMobile(java.lang.Object  mobile) {
		this.mobile = mobile;
	}
	
   	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer  userId) {
		this.userId = userId;
	}
	
   	public java.lang.Object getContent() {
		return content;
	}
	public void setContent(java.lang.Object  content) {
		this.content = content;
	}
	
   	public java.util.Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.util.Date  createTime) {
		this.createTime = createTime;
	}
	
   	public java.util.Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(java.util.Date  sendTime) {
		this.sendTime = sendTime;
	}
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
   	public Integer getType() {
		return type;
	}
	public void setType(Integer  type) {
		this.type = type;
	}
	
}