package com.tongxuweb.domain.entity;

import com.tongxuweb.domain.entity.common.Pagination;

/**
 */
public class TestBean extends Pagination {

    private String taskName;

    //1:主订单信息 2:订单明细信息
    private Integer type;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
