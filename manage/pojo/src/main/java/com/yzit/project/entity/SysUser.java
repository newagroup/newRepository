package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>用户表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class SysUser extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  userId;//主键
    private String  loginName;//登录名
    private String  loginPwd;//登录密码
    private String  userName;//用户真实姓名名
    private Integer  status;//状态.0: 正常,1:冻结,2：删除
    private java.sql.Timestamp  lastLoginTime;//最后登录时间
    private String  lastLoginIp;//最后登录IP
    private java.sql.Timestamp  createTime;//创建时间
    private String  email;//邮件地址
    private String  tel;//手机号码
    private Integer  roleId;//所属角色ID
    
   	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer  userId) {
		this.userId = userId;
	}
	
   	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String  loginName) {
		this.loginName = loginName;
	}
	
   	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String  loginPwd) {
		this.loginPwd = loginPwd;
	}
	
   	public String getUserName() {
		return userName;
	}
	public void setUserName(String  userName) {
		this.userName = userName;
	}
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
   	public java.sql.Timestamp getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(java.sql.Timestamp  lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
   	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String  lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	
   	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.sql.Timestamp  createTime) {
		this.createTime = createTime;
	}
	
   	public String getEmail() {
		return email;
	}
	public void setEmail(String  email) {
		this.email = email;
	}
	
   	public String getTel() {
		return tel;
	}
	public void setTel(String  tel) {
		this.tel = tel;
	}
	
   	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer  roleId) {
		this.roleId = roleId;
	}
	
}