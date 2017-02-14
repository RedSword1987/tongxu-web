package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoOrderDao;
import com.tongxuweb.domain.entity.MainOrder;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.mapper.generate.PUserMapper;
import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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


    public void saveAll(MainOrders mainOrders) {
        List<TaskGetdataTaobaoOrder> list = convert(mainOrders);
        for (TaskGetdataTaobaoOrder taskGetdataTaobaoOrder : list) {
            taskGetdataTaobaoOrder.setTaskId(mainOrders.getBatchId());
            taskGetdataTaobaoOrderDao.insertSelective(taskGetdataTaobaoOrder);
        }
    }


    private List<TaskGetdataTaobaoOrder> convert(MainOrders mainOrders) {
        List<TaskGetdataTaobaoOrder> list = new ArrayList<TaskGetdataTaobaoOrder>();
        if (mainOrders.getMainOrders() != null) {
            for (MainOrder mainOrder : mainOrders.getMainOrders()) {
                if (mainOrder != null) {
                    TaskGetdataTaobaoOrder taskGetdataTaobaoOrder = new TaskGetdataTaobaoOrder();
                    if (mainOrder.getBuyer() != null) {
                        taskGetdataTaobaoOrder.setBuyerId(mainOrder.getBuyer().getId());
                        taskGetdataTaobaoOrder.setBuyerNick(mainOrder.getBuyer().getNick());
                        taskGetdataTaobaoOrder.setBuyerPhonenum(mainOrder.getBuyer().getPhoneNum());
                    }
                    if (mainOrder.getOrderInfo() != null) {
                        taskGetdataTaobaoOrder.setOrderinfoCreatetime(mainOrder.getOrderInfo().getCreateTime());
                        taskGetdataTaobaoOrder.setOrderinfoId(mainOrder.getOrderInfo().getId());
                    }
                    if (mainOrder.getPayInfo()!=null){
                        taskGetdataTaobaoOrder.setPayinfoActualfee(mainOrder.getPayInfo().getActualFee());
                    }
                    if (mainOrder.getStatusInfo()!=null){
                        taskGetdataTaobaoOrder.setStatusinfoText(mainOrder.getStatusInfo().getText());
                        taskGetdataTaobaoOrder.setStatusinfoType(mainOrder.getStatusInfo().getType());
                    }
                    list.add(taskGetdataTaobaoOrder);
                }
            }
        }


        return list;

    }
}
