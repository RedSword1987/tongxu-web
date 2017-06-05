package com.tongxuweb.dao;

import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.mapper.generate.TaskGetdataTaobaoOrderMapper;

/**
 */
public interface TaskGetdataTaobaoOrderDao extends TaskGetdataTaobaoOrderMapper {
    void insertBuyer();

    TaskGetdataTaobaoOrder getLastDate();


}
