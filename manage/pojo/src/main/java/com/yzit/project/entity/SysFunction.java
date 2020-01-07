package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>功能实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class SysFunction extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  functionId;//权限ID
    private Integer  parentId;//权限父ID
    private String  functionName;//权限名
    private String  functionUrl;//权限URL
    private Integer  functionType;//权限类型 1菜单 2功能
    private java.sql.Timestamp  createTime;//创建时间
    private Integer  sort;//排序
    private String  imageUrl;//图标路径
    
   	public Integer getFunctionId() {
		return functionId;
	}
	public void setFunctionId(Integer  functionId) {
		this.functionId = functionId;
	}
	
   	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer  parentId) {
		this.parentId = parentId;
	}
	
   	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String  functionName) {
		this.functionName = functionName;
	}
	
   	public String getFunctionUrl() {
		return functionUrl;
	}
	public void setFunctionUrl(String  functionUrl) {
		this.functionUrl = functionUrl;
	}
	
   	public Integer getFunctionType() {
		return functionType;
	}
	public void setFunctionType(Integer  functionType) {
		this.functionType = functionType;
	}
	
   	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.sql.Timestamp  createTime) {
		this.createTime = createTime;
	}
	
   	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer  sort) {
		this.sort = sort;
	}
	
   	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String  imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}