package com.tongxuweb.domain.entity.mainOrder.subOrder;

import com.tongxuweb.domain.entity.common.KeyMap;

import java.util.List;

/**
 * Created by higgs on 17/2/14.
 */
public class ItemInfo {


    private String  title;

    private String  itemUrl;

    private List<KeyMap> extra;

    private List<KeyMap> skuText;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public List<KeyMap> getExtra() {
        return extra;
    }

    public void setExtra(List<KeyMap> extra) {
        this.extra = extra;
    }

    public List<KeyMap> getSkuText() {
        return skuText;
    }

    public void setSkuText(List<KeyMap> skuText) {
        this.skuText = skuText;
    }
}
