package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>文章表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduArticle extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  articleId;//文章ID
    private String  title;//文章标题
    private String  summary;//文章摘要
    private String  keyWord;//文章关键字
    private String  imageUrl;//文章图片URL
    private String  source;//文章来源
    private String  author;//文章作者
    private java.sql.Timestamp  createTime;//文章创建时间
    private java.sql.Timestamp  publishTime;//文章发布时间
    private String  link;//文章访问链接
    private Integer  articleType;//文章类型 2文章
    private Integer  clickNum;//文章点击量
    private Integer  praiseCount;//点赞数量
    private Integer  commentNum;//评论数
    private Integer  sort;//排序值
    
   	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer  articleId) {
		this.articleId = articleId;
	}
	
   	public String getTitle() {
		return title;
	}
	public void setTitle(String  title) {
		this.title = title;
	}
	
   	public String getSummary() {
		return summary;
	}
	public void setSummary(String  summary) {
		this.summary = summary;
	}
	
   	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String  keyWord) {
		this.keyWord = keyWord;
	}
	
   	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String  imageUrl) {
		this.imageUrl = imageUrl;
	}
	
   	public String getSource() {
		return source;
	}
	public void setSource(String  source) {
		this.source = source;
	}
	
   	public String getAuthor() {
		return author;
	}
	public void setAuthor(String  author) {
		this.author = author;
	}
	
   	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.sql.Timestamp  createTime) {
		this.createTime = createTime;
	}
	
   	public java.sql.Timestamp getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(java.sql.Timestamp  publishTime) {
		this.publishTime = publishTime;
	}
	
   	public String getLink() {
		return link;
	}
	public void setLink(String  link) {
		this.link = link;
	}
	
   	public Integer getArticleType() {
		return articleType;
	}
	public void setArticleType(Integer  articleType) {
		this.articleType = articleType;
	}
	
   	public Integer getClickNum() {
		return clickNum;
	}
	public void setClickNum(Integer  clickNum) {
		this.clickNum = clickNum;
	}
	
   	public Integer getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(Integer  praiseCount) {
		this.praiseCount = praiseCount;
	}
	
   	public Integer getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(Integer  commentNum) {
		this.commentNum = commentNum;
	}
	
   	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer  sort) {
		this.sort = sort;
	}
	
}