package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoOrderDao;
import com.tongxuweb.domain.entity.MainOrder;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.mapper.generate.PUserMapper;
import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import com.tongxuweb.util.StringUtil;
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

        taskGetdataTaobaoOrderDao.updateBuyer();
    }


    private List<TaskGetdataTaobaoOrder> convert(MainOrders mainOrders) {
        List<TaskGetdataTaobaoOrder> list = new ArrayList<TaskGetdataTaobaoOrder>();
        if (mainOrders.getMainOrders() != null) {
            for (MainOrder mainOrder : mainOrders.getMainOrders()) {
                if (mainOrder != null) {


                    TaskGetdataTaobaoOrder taskGetdataTaobaoOrder = new TaskGetdataTaobaoOrder();

                    if (mainOrder.getTrade() != null) {
                        taskGetdataTaobaoOrder.setAlipayId(mainOrder.getTrade().getAlipayId());
                        taskGetdataTaobaoOrder.setBuyerAddress(mainOrder.getTrade().getBuyerAddress());
                        taskGetdataTaobaoOrder.setBuyMessage(mainOrder.getTrade().getBuyMessage());
                        taskGetdataTaobaoOrder.setCreateTime(mainOrder.getTrade().getCreateTime());
                        taskGetdataTaobaoOrder.setLogisticsName(mainOrder.getTrade().getLogisticsName());
                        taskGetdataTaobaoOrder.setLogisticsNum(mainOrder.getTrade().getLogisticsNum());
                        taskGetdataTaobaoOrder.setOrderBar(mainOrder.getTrade().getOrderBar());
                        taskGetdataTaobaoOrder.setOrderBarText(mainOrder.getTrade().getOrderBarText());
                        taskGetdataTaobaoOrder.setPayTime(mainOrder.getTrade().getPayTime());
                        taskGetdataTaobaoOrder.setSendTime(mainOrder.getTrade().getSendTime());
                    }

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


                    initTaskGetdataTaobaoOrder(taskGetdataTaobaoOrder);
                    list.add(taskGetdataTaobaoOrder);
                }
            }
        }


        return list;

    }

    private static void initTaskGetdataTaobaoOrder(TaskGetdataTaobaoOrder taskGetdataTaobaoOrder) {
        if (taskGetdataTaobaoOrder != null && !StringUtil.isEmpty(taskGetdataTaobaoOrder.getBuyerAddress())) {
            String address = taskGetdataTaobaoOrder.getBuyerAddress();
            String[] arr = address.split("，");
            if (arr.length >= 4) {
                if (!StringUtil.isEmpty(arr[1])&&arr[1].length()>3){
                    if (arr[1].startsWith("86-")){
                        arr[1]=arr[1].substring(3);
                    }
                    taskGetdataTaobaoOrder.setBuyerLogisticsPhone(arr[1]);
                }

                String buyer_post = arr[arr.length - 1].toString();
                if (buyer_post.length() == 6) {
                    taskGetdataTaobaoOrder.setBuyerPost(buyer_post);
                }
                String buyer_address = arr[arr.length - 2];
                String[] buyer_addressArray = buyer_address.split(" ");
                if (buyer_addressArray.length >= 3) {
                    taskGetdataTaobaoOrder.setBuyerProvice(buyer_addressArray[0]);
                    taskGetdataTaobaoOrder.setBuyerCity(buyer_addressArray[1]);
                    taskGetdataTaobaoOrder.setBuyerArea(buyer_address.replace(buyer_addressArray[0], "").replace(buyer_addressArray[1], "").trim());
                }

            }
        }

    }
}
