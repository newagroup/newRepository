package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>天数统计实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduStatisticsDay extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private java.util.Date  statisticsTime;//统计日期
    private Integer  loginNum;//登录人数（活跃人数 ）
    private java.util.Date  createTime;//生成时间
    private Integer  registeredNum;//注册人数
    private Integer  videoViewingNum;//每日播放视频数
    private Integer  dailyUserNumber;//每日用户数
    private Integer  dailyCourseNumber;//每日课程数
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public java.util.Date getStatisticsTime() {
		return statisticsTime;
	}
	public void setStatisticsTime(java.util.Date  statisticsTime) {
		this.statisticsTime = statisticsTime;
	}
	
   	public Integer getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(Integer  loginNum) {
		this.loginNum = loginNum;
	}
	
   	public java.util.Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.util.Date  createTime) {
		this.createTime = createTime;
	}
	
   	public Integer getRegisteredNum() {
		return registeredNum;
	}
	public void setRegisteredNum(Integer  registeredNum) {
		this.registeredNum = registeredNum;
	}
	
   	public Integer getVideoViewingNum() {
		return videoViewingNum;
	}
	public void setVideoViewingNum(Integer  videoViewingNum) {
		this.videoViewingNum = videoViewingNum;
	}
	
   	public Integer getDailyUserNumber() {
		return dailyUserNumber;
	}
	public void setDailyUserNumber(Integer  dailyUserNumber) {
		this.dailyUserNumber = dailyUserNumber;
	}
	
   	public Integer getDailyCourseNumber() {
		return dailyCourseNumber;
	}
	public void setDailyCourseNumber(Integer  dailyCourseNumber) {
		this.dailyCourseNumber = dailyCourseNumber;
	}
	
}