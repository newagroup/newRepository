package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>角色实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class SysRole extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  roleId;//角色ID
    private String  roleName;//角色名
    private java.sql.Timestamp  createTime;//创建时间
    
   	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer  roleId) {
		this.roleId = roleId;
	}
	
   	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String  roleName) {
		this.roleName = roleName;
	}
	
   	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.sql.Timestamp  createTime) {
		this.createTime = createTime;
	}
	
}