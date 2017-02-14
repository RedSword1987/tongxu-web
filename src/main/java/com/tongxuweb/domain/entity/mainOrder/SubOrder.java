package com.tongxuweb.domain.entity.mainOrder;

import com.tongxuweb.domain.entity.mainOrder.subOrder.ItemInfo;
import com.tongxuweb.domain.entity.mainOrder.subOrder.PriceInfo;

/**
 * Created by higgs on 17/2/14.
 */
public class SubOrder {
    private String quantity;
    private PriceInfo priceInfo;

    private ItemInfo itemInfo;


    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

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
}
