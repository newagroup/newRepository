package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接图片类型实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduWebsiteImagesType extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  typeId;//类型ID
    private String  typeName;//类型名
    
   	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer  typeId) {
		this.typeId = typeId;
	}
	
   	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String  typeName) {
		this.typeName = typeName;
	}
	
}