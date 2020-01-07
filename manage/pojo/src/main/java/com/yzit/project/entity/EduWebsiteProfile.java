package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接轮廓简况实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduWebsiteProfile extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private String  type;//类型
    private java.lang.Object  desciption;//内容JSON格式
    private String  explain;//说明
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public String getType() {
		return type;
	}
	public void setType(String  type) {
		this.type = type;
	}
	
   	public java.lang.Object getDesciption() {
		return desciption;
	}
	public void setDesciption(java.lang.Object  desciption) {
		this.desciption = desciption;
	}
	
   	public String getExplain() {
		return explain;
	}
	public void setExplain(String  explain) {
		this.explain = explain;
	}
	
}