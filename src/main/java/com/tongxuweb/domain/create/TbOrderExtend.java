package com.tongxuweb.domain.create;

import com.tongxuweb.domain.generate.TbOrder;
import com.tongxuweb.domain.generate.TbOrderItem;

import java.util.List;

/**
 */
public class TbOrderExtend extends TbOrder {
    List<TbOrderItem> tbOrderItemList;

    public List<TbOrderItem> getTbOrderItemList() {
        return tbOrderItemList;
    }

    public void setTbOrderItemList(List<TbOrderItem> tbOrderItemList) {
        this.tbOrderItemList = tbOrderItemList;


        if (tbOrderItemList != null && tbOrderItemList.size() > 0) {
            int num = 0;
            StringBuilder title = new StringBuilder();
            for (TbOrderItem tbOrderItem : tbOrderItemList) {
                if (tbOrderItem.getNum() != null) {
                    num = num + tbOrderItem.getNum();
                } else {
                    num = num + 1;
                }
                title.append(",").append(tbOrderItem.getSkuTextColour()).append(":").append(tbOrderItem.getSkuTextSize());
            }
            if (title.length() != 0) {
                title.deleteCharAt(0);
            }
            setTitle(title.toString());


            setItemNum(num);
        }
    }
}
