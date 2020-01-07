package com.yzit.project.entity;
import com.yzit.common.domain.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>电脑统计实体类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2017，云优众<br>
 */ 
public class EduStatisticsComputer extends BaseEntity {
   private static final long serialVersionUID = 1L;
    private Integer  id;//
    private java.util.Date  statisticsTime;//统计日期
    private String  cpuUsage;//cpu使用率
    private String  memoryUsage;//内存使用率
    private String  netUsage;//网络使用率
    
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
	
   	public String getCpuUsage() {
		return cpuUsage;
	}
	public void setCpuUsage(String  cpuUsage) {
		this.cpuUsage = cpuUsage;
	}
	
   	public String getMemoryUsage() {
		return memoryUsage;
	}
	public void setMemoryUsage(String  memoryUsage) {
		this.memoryUsage = memoryUsage;
	}
	
   	public String getNetUsage() {
		return netUsage;
	}
	public void setNetUsage(String  netUsage) {
		this.netUsage = netUsage;
	}
	
}