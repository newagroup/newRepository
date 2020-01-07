package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>课程表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduCourse extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  courseId;//课程编号
    private String  courseName;//课程名称
    private Integer  isAvaliable;//1正常2删除
    private Integer  subjectId;//课程专业ID
    private String  subjectLink;//课程专业链
    private java.sql.Timestamp  addTime;//添加时间
    private Integer  sourcePrice;//课程原价格（只显示）
    private Integer  currentPrice;//课程销售价格（实际支付价格）设置为0则可免费观看
    private String  title;//课程简介
    private java.lang.Object  context;//课程详情
    private Integer  lessionNum;//总课时
    private String  logo;//图片路径
    private java.sql.Timestamp  updateTime;//最后更新时间
    private Integer  pageBuycount;//销售数量
    private Integer  pageViewcount;//浏览数量
    private java.sql.Timestamp  endTime;//有效结束时间
    private Integer  losetype;//有效期类型，0：到期时间，1：按天数
    private String  loseTime;//有效期:商品订单过期时间点
    private Integer  sequence;//序列
    private Integer  courseGrossIncome;//该课程总共卖了多少钱（新加字段暂时没用到）
    
   	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer  courseId) {
		this.courseId = courseId;
	}
	
   	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String  courseName) {
		this.courseName = courseName;
	}
	
   	public Integer getIsAvaliable() {
		return isAvaliable;
	}
	public void setIsAvaliable(Integer  isAvaliable) {
		this.isAvaliable = isAvaliable;
	}
	
   	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer  subjectId) {
		this.subjectId = subjectId;
	}
	
   	public String getSubjectLink() {
		return subjectLink;
	}
	public void setSubjectLink(String  subjectLink) {
		this.subjectLink = subjectLink;
	}
	
   	public java.sql.Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(java.sql.Timestamp  addTime) {
		this.addTime = addTime;
	}
	
   	public Integer getSourcePrice() {
		return sourcePrice;
	}
	public void setSourcePrice(Integer  sourcePrice) {
		this.sourcePrice = sourcePrice;
	}
	
   	public Integer getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Integer  currentPrice) {
		this.currentPrice = currentPrice;
	}
	
   	public String getTitle() {
		return title;
	}
	public void setTitle(String  title) {
		this.title = title;
	}
	
   	public java.lang.Object getContext() {
		return context;
	}
	public void setContext(java.lang.Object  context) {
		this.context = context;
	}
	
   	public Integer getLessionNum() {
		return lessionNum;
	}
	public void setLessionNum(Integer  lessionNum) {
		this.lessionNum = lessionNum;
	}
	
   	public String getLogo() {
		return logo;
	}
	public void setLogo(String  logo) {
		this.logo = logo;
	}
	
   	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.sql.Timestamp  updateTime) {
		this.updateTime = updateTime;
	}
	
   	public Integer getPageBuycount() {
		return pageBuycount;
	}
	public void setPageBuycount(Integer  pageBuycount) {
		this.pageBuycount = pageBuycount;
	}
	
   	public Integer getPageViewcount() {
		return pageViewcount;
	}
	public void setPageViewcount(Integer  pageViewcount) {
		this.pageViewcount = pageViewcount;
	}
	
   	public java.sql.Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(java.sql.Timestamp  endTime) {
		this.endTime = endTime;
	}
	
   	public Integer getLosetype() {
		return losetype;
	}
	public void setLosetype(Integer  losetype) {
		this.losetype = losetype;
	}
	
   	public String getLoseTime() {
		return loseTime;
	}
	public void setLoseTime(String  loseTime) {
		this.loseTime = loseTime;
	}
	
   	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer  sequence) {
		this.sequence = sequence;
	}
	
   	public Integer getCourseGrossIncome() {
		return courseGrossIncome;
	}
	public void setCourseGrossIncome(Integer  courseGrossIncome) {
		this.courseGrossIncome = courseGrossIncome;
	}
	
}