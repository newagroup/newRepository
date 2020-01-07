package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b> 登录日志实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class SysLoginLog extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  logId;//
    private java.sql.Timestamp  loginTime;//登录时间
    private String  ip;//登录IP
    private Integer  userId;//用户ID
    private String  osName;//操作系统
    private String  userAgent;//浏览器
    
   	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer  logId) {
		this.logId = logId;
	}
	
   	public java.sql.Timestamp getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(java.sql.Timestamp  loginTime) {
		this.loginTime = loginTime;
	}
	
   	public String getIp() {
		return ip;
	}
	public void setIp(String  ip) {
		this.ip = ip;
	}
	
   	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer  userId) {
		this.userId = userId;
	}
	
   	public String getOsName() {
		return osName;
	}
	public void setOsName(String  osName) {
		this.osName = osName;
	}
	
   	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String  userAgent) {
		this.userAgent = userAgent;
	}
	
}