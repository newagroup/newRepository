package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接图片实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduWebsiteImages extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  imageId;//
    private String  imageUrl;//图片地址
    private String  linkAddress;//图链接地址
    private String  title;//图标题
    private Integer  typeId;//图片类型
    private Integer  seriesNumber;//序列号
    private String  previewUrl;//略缩图片地址
    private String  color;//背景色
    private String  describe;//图片描述
    
   	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer  imageId) {
		this.imageId = imageId;
	}
	
   	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String  imageUrl) {
		this.imageUrl = imageUrl;
	}
	
   	public String getLinkAddress() {
		return linkAddress;
	}
	public void setLinkAddress(String  linkAddress) {
		this.linkAddress = linkAddress;
	}
	
   	public String getTitle() {
		return title;
	}
	public void setTitle(String  title) {
		this.title = title;
	}
	
   	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer  typeId) {
		this.typeId = typeId;
	}
	
   	public Integer getSeriesNumber() {
		return seriesNumber;
	}
	public void setSeriesNumber(Integer  seriesNumber) {
		this.seriesNumber = seriesNumber;
	}
	
   	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String  previewUrl) {
		this.previewUrl = previewUrl;
	}
	
   	public String getColor() {
		return color;
	}
	public void setColor(String  color) {
		this.color = color;
	}
	
   	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String  describe) {
		this.describe = describe;
	}
	
}