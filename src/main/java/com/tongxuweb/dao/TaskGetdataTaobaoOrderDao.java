package com.tongxuweb.dao;

import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.mapper.generate.TaskGetdataTaobaoOrderMapper;

/**
 * Created by higgs on 17/2/13.
 */
public interface TaskGetdataTaobaoOrderDao extends TaskGetdataTaobaoOrderMapper {
    void insertBuyer();

    TaskGetdataTaobaoOrder getLastDate();
}
