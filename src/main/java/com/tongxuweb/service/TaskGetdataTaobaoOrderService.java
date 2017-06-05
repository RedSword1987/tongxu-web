package com.tongxuweb.service;

import com.tongxuweb.domain.entity.MainOrders;

import java.util.Date;
import java.util.Map;

/**
 */
public interface TaskGetdataTaobaoOrderService {

    Date getLastDate();

    Integer saveAll(MainOrders mainOrders, Map<String, Object> ss);


}
