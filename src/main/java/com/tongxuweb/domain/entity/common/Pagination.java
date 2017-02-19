package com.tongxuweb.domain.entity.common;

/**
 * Created by higgs on 17/2/14.
 */
public class Pagination {

    public static final Integer DEFAULT_SIZE = 10;
    public static final Integer FIRST_PAGE = 1;
    private Integer currentPage = 0;
    private Integer pageSize = 0;
    private Integer totalNumber = 0;
    private Integer totalPage = 0;
    private Integer offet = 0;


    public Integer getOffet() {
        return (getCurrentPage() - 1) * getPageSize();
    }

    public Integer getCurrentPage() {
        if (currentPage == null || currentPage < 1) {
            currentPage = FIRST_PAGE;
        }
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize < 1) {
            pageSize = DEFAULT_SIZE;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalNumber() {
        if (totalNumber == null) {
            totalNumber = 0;
        }
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {

        this.totalNumber = totalNumber;


    }

    public Integer getTotalPage() {
        return (getTotalNumber() + pageSize - 1) / pageSize;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
