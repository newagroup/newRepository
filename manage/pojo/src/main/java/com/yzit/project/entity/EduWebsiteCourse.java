package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduWebsiteCourse extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private String  name;//推荐模块名称
    private String  link;//点击更多链接
    private String  description;//说明
    private Integer  coursenum;//推荐课程限制数量
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public String getName() {
		return name;
	}
	public void setName(String  name) {
		this.name = name;
	}
	
   	public String getLink() {
		return link;
	}
	public void setLink(String  link) {
		this.link = link;
	}
	
   	public String getDescription() {
		return description;
	}
	public void setDescription(String  description) {
		this.description = description;
	}
	
   	public Integer getCoursenum() {
		return coursenum;
	}
	public void setCoursenum(Integer  coursenum) {
		this.coursenum = coursenum;
	}
	
}