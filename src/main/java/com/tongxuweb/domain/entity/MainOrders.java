package com.tongxuweb.domain.entity;

import java.util.List;

/**
 */
public class MainOrders {
    List<MainOrder> mainOrders;

    Long batchId;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public List<MainOrder> getMainOrders() {
        return mainOrders;
    }

    public void setMainOrders(List<MainOrder> mainOrders) {
        this.mainOrders = mainOrders;
    }
}
