package com.tongxuweb.domain.entity.mainOrder;

import com.tongxuweb.domain.entity.mainOrder.subOrder.ItemInfo;
import com.tongxuweb.domain.entity.mainOrder.subOrder.PriceInfo;

/**
 * Created by higgs on 17/2/14.
 */
public class SubOrder {
    private Integer quantity;
    private PriceInfo priceInfo;

    private ItemInfo itemInfo;



    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
