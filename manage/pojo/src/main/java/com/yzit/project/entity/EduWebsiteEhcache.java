package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>纯Java的进程内缓存框架的描述实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduWebsiteEhcache extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//主键
    private String  ehcacheKey;//ehcache key
    private String  ehcacheDesc;//描述
    
   	public Integer getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	
   	public String getEhcacheKey() {
		return ehcacheKey;
	}
	public void setEhcacheKey(String  ehcacheKey) {
		this.ehcacheKey = ehcacheKey;
	}
	
   	public String getEhcacheDesc() {
		return ehcacheDesc;
	}
	public void setEhcacheDesc(String  ehcacheDesc) {
		this.ehcacheDesc = ehcacheDesc;
	}
	
}