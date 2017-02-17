package com.tongxuweb.service;

import com.tongxuweb.domain.entity.MainOrders;

import java.util.Date;
import java.util.Map;

/**
 * Created by higgs on 17/2/13.
 */
public interface TaskGetdataTaobaoOrderService {

    Date getLastDate();

    Integer saveAll(MainOrders mainOrders, Map<String, Object> ss);

    Integer saveTradeAll(MainOrders mainOrders, Map<String, Object> ss);

}
