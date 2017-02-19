package com.tongxuweb.domain.create;

import com.tongxuweb.domain.generate.TaskGetdataTaobao;

import java.util.List;

/**
 * Created by higgs on 17/2/19.
 */
public class OTaskGetdataTaobao extends TaskGetdataTaobao {
    List<String> orderids;

    public List<String> getOrderids() {
        return orderids;
    }

    public void setOrderids(List<String> orderids) {
        this.orderids = orderids;
    }
}
