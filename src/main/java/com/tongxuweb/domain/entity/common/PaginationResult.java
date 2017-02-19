package com.tongxuweb.domain.entity.common;

/**
 * Created by higgs on 17/2/14.
 */
public class PaginationResult {
    Pagination pagination;
    Object data;


    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
