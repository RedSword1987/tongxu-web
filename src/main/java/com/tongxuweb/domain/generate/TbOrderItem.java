package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbOrderItem implements Serializable {

    //id
    private Long id;

    //订单编号
    private String orderinfoId;

    //产品编码
    private String code;

    //产品ID
    private String itemId;

    //床大小
    private String skuTextSize;

    //床颜色
    private String skuTextColour;

    //商品进货价
    private BigDecimal itemJinhuo;

    //店铺id
    private String sellerId;

    //产品数量
    private Integer num;

    //创建时间
    private Date createdAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderinfoId() {
        return orderinfoId;
    }

    public void setOrderinfoId(String orderinfoId) {
        this.orderinfoId = orderinfoId == null ? null : orderinfoId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getSkuTextSize() {
        return skuTextSize;
    }

    public void setSkuTextSize(String skuTextSize) {
        this.skuTextSize = skuTextSize == null ? null : skuTextSize.trim();
    }

    public String getSkuTextColour() {
        return skuTextColour;
    }

    public void setSkuTextColour(String skuTextColour) {
        this.skuTextColour = skuTextColour == null ? null : skuTextColour.trim();
    }

    public BigDecimal getItemJinhuo() {
        return itemJinhuo;
    }

    public void setItemJinhuo(BigDecimal itemJinhuo) {
        this.itemJinhuo = itemJinhuo;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}