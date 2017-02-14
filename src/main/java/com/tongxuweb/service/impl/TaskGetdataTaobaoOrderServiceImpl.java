package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoOrderDao;
import com.tongxuweb.domain.generate.PUser;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.mapper.generate.PUserMapper;
import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PUserMapper pUserMapper;


    public void saveAll() {
        TaskGetdataTaobaoOrder taskGetdataTaobaoOrder = new TaskGetdataTaobaoOrder();
        taskGetdataTaobaoOrder.setCreatedBy(1l);
        taskGetdataTaobaoOrderDao.insertSelective(taskGetdataTaobaoOrder);
        PUser user = new PUser();
        user.setAuthType(1);
        pUserMapper.insertSelective(user);
    }
}
