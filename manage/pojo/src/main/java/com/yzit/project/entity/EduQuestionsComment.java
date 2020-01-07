package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>问题意见和评论实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduQuestionsComment extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键id
    private Integer  cusId;//评论人id
    private Integer  questionId;//问答id
    private String  content;//评论内容
    private Integer  isBest;//是否最佳答案 0否1是
    private Integer  replyCount;//回复数量
    private Integer  praiseCount;//点赞数
    private java.util.Date  addTime;//回复时间
    private Integer  commentId;//父级评论id
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public Integer getCusId() {
		return cusId;
	}
	public void setCusId(Integer  cusId) {
		this.cusId = cusId;
	}
	
   	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer  questionId) {
		this.questionId = questionId;
	}
	
   	public String getContent() {
		return content;
	}
	public void setContent(String  content) {
		this.content = content;
	}
	
   	public Integer getIsBest() {
		return isBest;
	}
	public void setIsBest(Integer  isBest) {
		this.isBest = isBest;
	}
	
   	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer  replyCount) {
		this.replyCount = replyCount;
	}
	
   	public Integer getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(Integer  praiseCount) {
		this.praiseCount = praiseCount;
	}
	
   	public java.util.Date getAddTime() {
		return addTime;
	}
	public void setAddTime(java.util.Date  addTime) {
		this.addTime = addTime;
	}
	
   	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer  commentId) {
		this.commentId = commentId;
	}
	
}