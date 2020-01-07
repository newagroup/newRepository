package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>用户表实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduUser extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  userId;//学员ID
    private String  mobile;//手机号
    private String  email;//邮箱号
    private String  password;//密码
    private String  userName;//用户名
    private String  showName;//显示名 （昵称）
    private Integer  sex;//性别  1男  2女
    private Integer  age;//年龄
    private java.sql.Timestamp  createTime;//注册时间
    private Integer  isAvalible;//是否可用 1正常  2冻结
    private String  picImg;//用户头像
    private String  bannerUrl;//个人中心用户背景图片
    private Integer  msgNum;//站内信未读消息数
    private Integer  sysMsgNum;//
    private java.util.Date  lastSystemTime;//上传统计系统消息时间
    
   	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer  userId) {
		this.userId = userId;
	}
	
   	public String getMobile() {
		return mobile;
	}
	public void setMobile(String  mobile) {
		this.mobile = mobile;
	}
	
   	public String getEmail() {
		return email;
	}
	public void setEmail(String  email) {
		this.email = email;
	}
	
   	public String getPassword() {
		return password;
	}
	public void setPassword(String  password) {
		this.password = password;
	}
	
   	public String getUserName() {
		return userName;
	}
	public void setUserName(String  userName) {
		this.userName = userName;
	}
	
   	public String getShowName() {
		return showName;
	}
	public void setShowName(String  showName) {
		this.showName = showName;
	}
	
   	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer  sex) {
		this.sex = sex;
	}
	
   	public Integer getAge() {
		return age;
	}
	public void setAge(Integer  age) {
		this.age = age;
	}
	
   	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.sql.Timestamp  createTime) {
		this.createTime = createTime;
	}
	
   	public Integer getIsAvalible() {
		return isAvalible;
	}
	public void setIsAvalible(Integer  isAvalible) {
		this.isAvalible = isAvalible;
	}
	
   	public String getPicImg() {
		return picImg;
	}
	public void setPicImg(String  picImg) {
		this.picImg = picImg;
	}
	
   	public String getBannerUrl() {
		return bannerUrl;
	}
	public void setBannerUrl(String  bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	
   	public Integer getMsgNum() {
		return msgNum;
	}
	public void setMsgNum(Integer  msgNum) {
		this.msgNum = msgNum;
	}
	
   	public Integer getSysMsgNum() {
		return sysMsgNum;
	}
	public void setSysMsgNum(Integer  sysMsgNum) {
		this.sysMsgNum = sysMsgNum;
	}
	
   	public java.util.Date getLastSystemTime() {
		return lastSystemTime;
	}
	public void setLastSystemTime(java.util.Date  lastSystemTime) {
		this.lastSystemTime = lastSystemTime;
	}
	
}