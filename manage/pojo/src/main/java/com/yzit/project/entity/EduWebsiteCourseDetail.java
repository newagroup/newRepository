package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接细节实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduWebsiteCourseDetail extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键
    private Integer  recommendId;//推荐分类的id
    private Integer  courseId;//课程id
    private Integer  orderNum;//课程显示排序
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public Integer getRecommendId() {
		return recommendId;
	}
	public void setRecommendId(Integer  recommendId) {
		this.recommendId = recommendId;
	}
	
   	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer  courseId) {
		this.courseId = courseId;
	}
	
   	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer  orderNum) {
		this.orderNum = orderNum;
	}
	
}