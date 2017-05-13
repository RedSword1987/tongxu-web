package com.tongxuweb.domain.entity.common;

import com.tongxuweb.util.StringUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by higgs on 17/2/14.
 */
public class Pagination {

    public static final Integer DEFAULT_SIZE = 10;
    public static final Integer FIRST_PAGE = 1;
    private Integer currentPage = 0;
    private Integer limit = 0;
    private Integer total = 0;
    private Integer offset = 0;

    public Pagination() {

    }

    public Pagination(HttpServletRequest request) {
        if (request != null) {
            String length = request.getParameter("limit");
            String start = request.getParameter("offset");
            if (StringUtil.isEmpty(length)) {
                setLimit(10);
            } else {
                setLimit(Integer.valueOf(length));
            }
            if (StringUtil.isEmpty(start)) {
                setOffset(0);
            } else {
                setOffset(Integer.valueOf(start));
            }
        }
    }


    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
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

    public Integer getLimit() {
        if (limit == null || limit < 1) {
            limit = DEFAULT_SIZE;
        }
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        if (total == null) {
            total = 0;
        }
        return total;
    }

    public void setTotal(Integer total) {

        this.total = total;


    }


}
