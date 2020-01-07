package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>问题实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduQuestions extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键
    private Integer  cusId;//创建人id
    private String  title;//问答标题
    private java.lang.Object  content;//问答内容
    private Integer  type;//分类 1课程问答 2 学习分享
    private Integer  status;//状态 0可回复1不可回复（采纳最佳答案后改为1 ）
    private Integer  replyCount;//问答回复数量
    private Integer  browseCount;//问答浏览次数
    private Integer  praiseCount;//问答点赞数量
    private java.util.Date  addTime;//添加时间
    
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
	
   	public String getTitle() {
		return title;
	}
	public void setTitle(String  title) {
		this.title = title;
	}
	
   	public java.lang.Object getContent() {
		return content;
	}
	public void setContent(java.lang.Object  content) {
		this.content = content;
	}
	
   	public Integer getType() {
		return type;
	}
	public void setType(Integer  type) {
		this.type = type;
	}
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
   	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer  replyCount) {
		this.replyCount = replyCount;
	}
	
   	public Integer getBrowseCount() {
		return browseCount;
	}
	public void setBrowseCount(Integer  browseCount) {
		this.browseCount = browseCount;
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
	
}