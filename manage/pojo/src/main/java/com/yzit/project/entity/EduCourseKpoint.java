package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>课程章节实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduCourseKpoint extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  kpointId;//
    private Integer  courseId;//课程id
    private String  name;//节点名称
    private Integer  parentId;//父级ID
    private java.util.Date  addTime;//添加时间
    private Integer  sort;//显示排序
    private Integer  playCount;//播放次数
    private Integer  isFree;//是否可以试听1免费2收费
    private String  videoUrl;//视频地址
    private Integer  teacherId;//讲师id
    private String  playTime;//播放时间
    private Integer  kpointType;//节点类型 0文件目录 1视频
    private String  videoType;//视频类型
    private String  fileType;//VIDEO视频 AUDIO音频 FILE文档 TXT文本 ATLAS图片集
    private java.lang.Object  content;//文本
    
   	public Integer getKpointId() {
		return kpointId;
	}
	public void setKpointId(Integer  kpointId) {
		this.kpointId = kpointId;
	}
	
   	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer  courseId) {
		this.courseId = courseId;
	}
	
   	public String getName() {
		return name;
	}
	public void setName(String  name) {
		this.name = name;
	}
	
   	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer  parentId) {
		this.parentId = parentId;
	}
	
   	public java.util.Date getAddTime() {
		return addTime;
	}
	public void setAddTime(java.util.Date  addTime) {
		this.addTime = addTime;
	}
	
   	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer  sort) {
		this.sort = sort;
	}
	
   	public Integer getPlayCount() {
		return playCount;
	}
	public void setPlayCount(Integer  playCount) {
		this.playCount = playCount;
	}
	
   	public Integer getIsFree() {
		return isFree;
	}
	public void setIsFree(Integer  isFree) {
		this.isFree = isFree;
	}
	
   	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String  videoUrl) {
		this.videoUrl = videoUrl;
	}
	
   	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer  teacherId) {
		this.teacherId = teacherId;
	}
	
   	public String getPlayTime() {
		return playTime;
	}
	public void setPlayTime(String  playTime) {
		this.playTime = playTime;
	}
	
   	public Integer getKpointType() {
		return kpointType;
	}
	public void setKpointType(Integer  kpointType) {
		this.kpointType = kpointType;
	}
	
   	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String  videoType) {
		this.videoType = videoType;
	}
	
   	public String getFileType() {
		return fileType;
	}
	public void setFileType(String  fileType) {
		this.fileType = fileType;
	}
	
   	public java.lang.Object getContent() {
		return content;
	}
	public void setContent(java.lang.Object  content) {
		this.content = content;
	}
	
}