package com.yzit.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient   String sort2;//排序字段
    @JsonIgnore
    private transient   String order;//排序类型
    @JsonIgnore
    private transient   Integer pageNo = 1;//当前页
    @JsonIgnore
    private transient   Integer pageSize =12;//页面显示数
    @JsonIgnore
    private transient   Integer startIndex;//分页获取数据的启始位置
    @JsonIgnore
    private transient   Integer endIndex;//分页获取数据的启始位置

    public Integer getStartIndex() {

        if(this.getPageNo() != null ){
            startIndex = (this.getPageNo() - 1) * this.getPageSize();
        }

        if(startIndex < 1){
            startIndex  =0;
        }
        return startIndex;
    }

    public Integer getEndIndex() {
        endIndex = this.getStartIndex() + this.getPageSize();
        return endIndex;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }



    public String getsort2() {
        return sort2;
    }

    public void setsort2(String sort2) {
        this.sort2 = sort2;
    }

    public Integer getPageNo() {
        if(pageNo == null ){
            pageNo = 1;
        }

        if(pageNo <1){
            pageNo = 1;
        }
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        if(pageSize == null){
            pageSize = 10;
        }
        if(pageSize < 0 ){
            pageSize = 10;
        }

        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}