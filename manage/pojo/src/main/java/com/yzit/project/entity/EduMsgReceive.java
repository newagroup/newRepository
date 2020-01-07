package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>接受的短信实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduMsgReceive extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键
    private java.sql.Timestamp  addTime;//添加时间
    private Integer  cusId;//发信人用户id
    private java.sql.Timestamp  updateTime;//修改时间
    private java.lang.Object  content;//信内容
    private Integer  type;//类型1系统通知2站内信
    private Integer  status;//0未读1已读2接受3拒绝4黑名单
    private Integer  receivingCusid;//收信人id
    private Integer  groupId;//申请加入群同意之后所需要的字段
    private String  showname;//会员名
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public java.sql.Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(java.sql.Timestamp  addTime) {
		this.addTime = addTime;
	}
	
   	public Integer getCusId() {
		return cusId;
	}
	public void setCusId(Integer  cusId) {
		this.cusId = cusId;
	}
	
   	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.sql.Timestamp  updateTime) {
		this.updateTime = updateTime;
	}
	
   	public java.lang.Object getContent() {
		return content;
	}
	public void setContent(java.lang.Object  content) {
		this.content = content;
	}
	
   	public Integer getType() {
		return type;
	}
	public void setType(Integer  type) {
		this.type = type;
	}
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
   	public Integer getReceivingCusid() {
		return receivingCusid;
	}
	public void setReceivingCusid(Integer  receivingCusid) {
		this.receivingCusid = receivingCusid;
	}
	
   	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer  groupId) {
		this.groupId = groupId;
	}
	
   	public String getShowname() {
		return showname;
	}
	public void setShowname(String  showname) {
		this.showname = showname;
	}
	
}