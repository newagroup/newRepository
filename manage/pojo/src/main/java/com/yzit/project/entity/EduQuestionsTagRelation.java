package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>问题和问题类型中间表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduQuestionsTagRelation extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//ID
    private Integer  questionsId;//问答id
    private Integer  questionsTagId;//问答标签id
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public Integer getQuestionsId() {
		return questionsId;
	}
	public void setQuestionsId(Integer  questionsId) {
		this.questionsId = questionsId;
	}
	
   	public Integer getQuestionsTagId() {
		return questionsTagId;
	}
	public void setQuestionsTagId(Integer  questionsTagId) {
		this.questionsTagId = questionsTagId;
	}
	
}