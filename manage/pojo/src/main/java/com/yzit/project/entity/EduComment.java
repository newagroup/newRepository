package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>文章评论表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduComment extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  commentId;//评论表
    private Integer  userId;//用户id
    private Integer  pCommentId;//父级评论id(为0则是一级评论,不为0则是回复)
    private String  content;//评论内容
    private java.util.Date  addtime;//创建时间
    private Integer  otherId;//评论的相关id
    private Integer  praiseCount;//点赞数量
    private Integer  replyCount;//回复数量
    private Integer  type;//1文章 2课程
    
   	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer  commentId) {
		this.commentId = commentId;
	}
	
   	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer  userId) {
		this.userId = userId;
	}
	
   	public Integer getPCommentId() {
		return pCommentId;
	}
	public void setPCommentId(Integer  pCommentId) {
		this.pCommentId = pCommentId;
	}
	
   	public String getContent() {
		return content;
	}
	public void setContent(String  content) {
		this.content = content;
	}
	
   	public java.util.Date getAddtime() {
		return addtime;
	}
	public void setAddtime(java.util.Date  addtime) {
		this.addtime = addtime;
	}
	
   	public Integer getOtherId() {
		return otherId;
	}
	public void setOtherId(Integer  otherId) {
		this.otherId = otherId;
	}
	
   	public Integer getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(Integer  praiseCount) {
		this.praiseCount = praiseCount;
	}
	
   	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer  replyCount) {
		this.replyCount = replyCount;
	}
	
   	public Integer getType() {
		return type;
	}
	public void setType(Integer  type) {
		this.type = type;
	}
	
}