package com.yzit.common.pageInfo;

import java.util.List;

public class PageInfo<T> {
    // 当前页
    private Integer page;
    // 每页条数
    private Integer pageSize;
    // 总条数
    private Integer total;
    // 总页数
    private Integer pages;
    // 每页数据
    private List<T> list;

    // 上一页
    private int prePage;

    // 下一页
    private int nextPage;

    public PageInfo(Integer page, Integer pageSize, Integer total, List<T> list) {
        this.page = page == null ? 1 : page;
        this.pageSize = pageSize == null ? 2: pageSize;
        this.total = total;
        this.list = list;
        // 计算总页数
        this.pages = this.total % this.pageSize == 0 ? this.total / this.pageSize
                : this.total / this.pageSize + 1;
        // 计算上一页
        this.prePage = this.page <= 1 ? 1 : this.page - 1;
        // 计算下一页
        this.nextPage = this.page >= this.pages ? this.pages : this.page + 1;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPrePage() {

        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }
}
