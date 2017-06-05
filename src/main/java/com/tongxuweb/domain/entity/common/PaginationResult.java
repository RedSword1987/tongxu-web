package com.tongxuweb.domain.entity.common;

/**
 */
public class PaginationResult extends Pagination {
    Object rows;

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }

    public void setPagination(Pagination pagination) {
        this.setCurrentPage(pagination.getCurrentPage());
        this.setLimit(pagination.getLimit());
        this.setTotal(pagination.getTotal());
        this.setOffset(pagination.getOffset());
    }
}
