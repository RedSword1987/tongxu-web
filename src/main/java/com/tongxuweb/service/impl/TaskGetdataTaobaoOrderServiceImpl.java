package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoOrderDao;
import com.tongxuweb.generate.Bean.TaskGetdataTaobaoOrder;
import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by higgs on 17/2/13.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TaskGetdataTaobaoOrderServiceImpl implements TaskGetdataTaobaoOrderService {
    @Resource
    private TaskGetdataTaobaoOrderDao taskGetdataTaobaoOrderDao;


    public void saveAll() {
        TaskGetdataTaobaoOrder taskGetdataTaobaoOrder = new TaskGetdataTaobaoOrder();
        taskGetdataTaobaoOrderDao.insertSelective(taskGetdataTaobaoOrder);
    }
}
