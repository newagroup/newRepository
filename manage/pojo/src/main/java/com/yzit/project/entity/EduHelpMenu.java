package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>帮助菜单实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduHelpMenu extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private Integer  parentid;//父级分类ID，默认0为一级分类
    private String  name;//菜单名称
    private java.sql.Timestamp  createTime;//创建时间
    private java.lang.Object  content;//菜单内容
    private Integer  sort;//排序  倒叙
    private String  varchar;//
    private String  linkBuilding;//外链字段
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer  parentid) {
		this.parentid = parentid;
	}
	
   	public String getName() {
		return name;
	}
	public void setName(String  name) {
		this.name = name;
	}
	
   	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.sql.Timestamp  createTime) {
		this.createTime = createTime;
	}
	
   	public java.lang.Object getContent() {
		return content;
	}
	public void setContent(java.lang.Object  content) {
		this.content = content;
	}
	
   	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer  sort) {
		this.sort = sort;
	}
	
   	public String getVarchar() {
		return varchar;
	}
	public void setVarchar(String  varchar) {
		this.varchar = varchar;
	}
	
   	public String getLinkBuilding() {
		return linkBuilding;
	}
	public void setLinkBuilding(String  linkBuilding) {
		this.linkBuilding = linkBuilding;
	}
	
}