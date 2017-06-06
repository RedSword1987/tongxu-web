package com.tongxuweb.domain.create;

import com.tongxuweb.domain.generate.TaskRun;
import com.tongxuweb.util.StringUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by red
 */
public class DTaskRun extends TaskRun {
    String paramBeginDate;
    String paramEndDate;
    String orderIds;
    String orderNum = "0";
    Integer timeInterval = 10;

    public DTaskRun(TaskRun taskRun) {
        setCode(taskRun.getCode());
        setId(taskRun.getId());
        setTaskName(taskRun.getTaskName());
        setBeginDate(taskRun.getBeginDate());
        setEndDate(taskRun.getEndDate());
        setStatus(taskRun.getStatus());
        setCreatedAt(taskRun.getCreatedAt());
    }

    public String getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getParamBeginDate() {
        return paramBeginDate;
    }

    public void setParamBeginDate(String paramBeginDate) {
        this.paramBeginDate = paramBeginDate;
    }

    public String getParamEndDate() {
        return paramEndDate;
    }

    public void setParamEndDate(String paramEndDate) {
        this.paramEndDate = paramEndDate;
    }

    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public void initOrderNum() {
        if (!StringUtil.isEmpty(getOrderIds())) {
            String orderIds = getOrderIds().trim();

            List<String> orderids = new ArrayList<String>();
            if (!StringUtil.isEmpty(orderIds)) {
                String[] arr = orderIds.split("[,; \\n\\t]");
                Set<String> set = new HashSet<String>();
                for (String arrS : arr) {
//                    && arrS.length() >= 16
                    if (!StringUtil.isEmpty(arrS)) {
                        set.add(arrS.trim());
                    }
                }
                orderids.addAll(set);
            }
            setOrderIds(StringUtil.joinListString(orderids, ","));
            setOrderNum(String.valueOf(orderids.size()));
        } else {
            setOrderNum("0");
        }
    }
}
