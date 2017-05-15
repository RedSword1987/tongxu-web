package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskGetdataTaobaoOrderDao;
import com.tongxuweb.domain.entity.MainOrder;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrderExample;
import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import com.tongxuweb.util.DateUtil;
import com.tongxuweb.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by higgs on 17/2/13.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TaskGetdataTaobaoOrderServiceImpl implements TaskGetdataTaobaoOrderService {
    @Resource
    private TaskGetdataTaobaoOrderDao taskGetdataTaobaoOrderDao;

    public Date getLastDate() {
        Date result = null;
        TaskGetdataTaobaoOrder bean = taskGetdataTaobaoOrderDao.getLastDate();
        if (bean != null) {
            result = new Date(DateUtil.convertStringToLong(bean.getOrderinfoCreatetime(),
                    DateUtil.DATE_PATTERN_YYYY_MM_DD_HH_MM_SS) * 1000);
        }
        return result;
    }

    public Integer saveAll(MainOrders mainOrders, Map<String, Object> ss) {

        Integer insert = 0;
        Integer update = 0;
        List<TaskGetdataTaobaoOrder> list = convert(mainOrders);
        for (TaskGetdataTaobaoOrder taskGetdataTaobaoOrder : list) {
            taskGetdataTaobaoOrder.setTaskId(mainOrders.getBatchId());
            if (!StringUtil.isEmpty(taskGetdataTaobaoOrder.getOrderinfoId())) {
                TaskGetdataTaobaoOrderExample example = new TaskGetdataTaobaoOrderExample();
                example.createCriteria().andOrderinfoIdEqualTo(taskGetdataTaobaoOrder.getOrderinfoId()).
                    andTaskIdEqualTo(mainOrders.getBatchId());
                List<TaskGetdataTaobaoOrder> lli = taskGetdataTaobaoOrderDao.selectByExample(example);
                if (lli != null && lli.size() > 0) {
                    taskGetdataTaobaoOrder.setId(lli.get(0).getId());
                    taskGetdataTaobaoOrderDao.updateByPrimaryKeySelective(taskGetdataTaobaoOrder);
                    update++;
                } else {

                    taskGetdataTaobaoOrderDao.insertSelective(taskGetdataTaobaoOrder);
                    insert++;
                }
            }
        }

        ss.put("insert", insert);
        ss.put("update", update);
        return list.size();
    }



    private List<TaskGetdataTaobaoOrder> convert(MainOrders mainOrders) {
        List<TaskGetdataTaobaoOrder> list = new ArrayList<TaskGetdataTaobaoOrder>();
        if (mainOrders.getMainOrders() != null) {
            for (MainOrder mainOrder : mainOrders.getMainOrders()) {
                if (mainOrder != null) {


                    TaskGetdataTaobaoOrder taskGetdataTaobaoOrder = new TaskGetdataTaobaoOrder();
                    taskGetdataTaobaoOrder.setOrderinfoId(mainOrder.getId());
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


                        taskGetdataTaobaoOrder.setLogisticsDesc(mainOrder.getTrade().getLogisticsDesc());
                        taskGetdataTaobaoOrder.setLogisticsLastDesc(mainOrder.getTrade().getLogisticsLastDesc());
                        taskGetdataTaobaoOrder.setLogisticsNumTaobao(mainOrder.getTrade().getLogisticsNumTaobao());
                    }

                    if (mainOrder.getBuyer() != null) {
                        taskGetdataTaobaoOrder.setBuyerId(mainOrder.getBuyer().getId());
                        taskGetdataTaobaoOrder.setBuyerNick(mainOrder.getBuyer().getNick());
                        taskGetdataTaobaoOrder.setBuyerPhonenum(mainOrder.getBuyer().getPhoneNum());
                    }
                    if (mainOrder.getOrderInfo() != null) {
                        taskGetdataTaobaoOrder.setOrderinfoCreatetime(mainOrder.getOrderInfo().getCreateTime());

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
                taskGetdataTaobaoOrder.setBuyerName(arr[0]);
                if (!StringUtil.isEmpty(arr[1])&&arr[1].length()>3){
                    if (arr[1].startsWith("86-")){
                        arr[1]=arr[1].substring(3);
                    }
                    taskGetdataTaobaoOrder.setBuyerLogisticsPhone(arr[1]);
                    if (!StringUtil.isEmpty(arr[1])&&arr[1].length()==11){
                        String s7=arr[1].substring(0,7);
                        int a = (int)(Math.random()*(9999-1000+1))+1000;
                        taskGetdataTaobaoOrder.setBuyerVirtualPhone(s7+String.valueOf(a));
                    }
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

                    StringBuilder stringBuilder=new StringBuilder();
                    for (int i=0;i<buyer_addressArray.length;i++){
                        if (i>1){
                            stringBuilder.append(buyer_addressArray[i]).append(" ");
                        }
                    }
                    taskGetdataTaobaoOrder.setBuyerArea(stringBuilder.toString().trim());
                }
                taskGetdataTaobaoOrder.setBuyerAddress(buyer_address);
            }
        }

    }
}
