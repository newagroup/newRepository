package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>短信制度实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduMsgSystem extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键
    private java.sql.Timestamp  addTime;//添加时间
    private java.sql.Timestamp  updateTime;//修改时间
    private java.lang.Object  content;//信内容
    private Integer  status;//0正常1删除2过期
    
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
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
}