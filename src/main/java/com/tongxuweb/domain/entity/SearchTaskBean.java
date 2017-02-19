package com.tongxuweb.domain.entity;

import com.tongxuweb.domain.entity.common.Pagination;

import java.util.Date;

/**
 * Created by higgs on 17/2/19.
 */
public class SearchTaskBean extends Pagination {
    Integer type;
    Date createdAt;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
