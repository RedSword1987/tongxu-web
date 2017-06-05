package com.tongxuweb.domain.create;

import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.util.DateUtil;
import com.tongxuweb.util.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 */
public class OTaskGetdataTaobao extends TaskGetdataTaobao {
    List<String> orderids;
    String orderIds;
    String beginDateS;
    String endDateS;

    public String getBeginDateS() {
        return beginDateS;
    }

    public void setBeginDateS(String beginDateS) {
        this.beginDateS = beginDateS;
    }

    public String getEndDateS() {
        return endDateS;
    }

    public void setEndDateS(String endDateS) {
        this.endDateS = endDateS;
    }

    public String getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }

    public List<String> getOrderids() {
        return orderids;
    }

    public void setOrderids(List<String> orderids) {
        this.orderids = orderids;
    }

    public void init() {
        if (1 == getType() || 3 == getType()) {
            orderids = new ArrayList<String>();
            if (beginDateS != null) {
                setBeginDate(new Date(DateUtil.convertStringToLong(beginDateS + " 00:00:00", DateUtil.DATE_PATTERN_YYYY_MM_DD_HH_MM_SS) * 1000));
            }
            if (endDateS != null) {
                setEndDate(new Date(DateUtil.convertStringToLong(endDateS + " 23:59:59", DateUtil.DATE_PATTERN_YYYY_MM_DD_HH_MM_SS) * 1000));
            }

        } else if (2 == getType()) {
            setBeginDate(null);
            setEndDate(null);
            orderids = new ArrayList<String>();
            if (!StringUtil.isEmpty(orderIds)) {
                String[] arr = orderIds.split("[,; \\n\\t]");
                for (String arrS : arr) {
                    if (!StringUtil.isEmpty(arrS) && arrS.length() >= 16) {
                        orderids.add(arrS);
                    }
                }
            }
        }
    }
}
