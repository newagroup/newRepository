package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接导航实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduWebsiteNavigate extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//ID
    private String  name;//导航显示名称
    private String  url;//导航显示位置
    private Integer  newpage;//是否在新页面打开0是1否
    private String  type;//类型：INDEX首页、USER个人中心、FRIENDLINK尾部友链、TAB尾部标签
    private Integer  ordernum;//显示排序
    private Integer  status;//0正常1冻结
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public String getName() {
		return name;
	}
	public void setName(String  name) {
		this.name = name;
	}
	
   	public String getUrl() {
		return url;
	}
	public void setUrl(String  url) {
		this.url = url;
	}
	
   	public Integer getNewpage() {
		return newpage;
	}
	public void setNewpage(Integer  newpage) {
		this.newpage = newpage;
	}
	
   	public String getType() {
		return type;
	}
	public void setType(String  type) {
		this.type = type;
	}
	
   	public Integer getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(Integer  ordernum) {
		this.ordernum = ordernum;
	}
	
   	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer  status) {
		this.status = status;
	}
	
}