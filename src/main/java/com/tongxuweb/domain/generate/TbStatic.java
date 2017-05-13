package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbStatic implements Serializable {

    //id
    private Long id;

    //日期 yyyy-MM-dd
    private String date;

    //店铺id
    private String sellerId;

    //付款订单数
    private Integer payNum;

    //货品数(一个订单可能多个物品)
    private Integer payItems;

    //实际支付金额
    private BigDecimal payinfoActualfee;

    //最后所得
    private BigDecimal finalMoney;

    //创建时间
    private Date createdAt;

    //店铺名称
    private String sellerName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public Integer getPayNum() {
        return payNum;
    }

    public void setPayNum(Integer payNum) {
        this.payNum = payNum;
    }

    public Integer getPayItems() {
        return payItems;
    }

    public void setPayItems(Integer payItems) {
        this.payItems = payItems;
    }

    public BigDecimal getPayinfoActualfee() {
        return payinfoActualfee;
    }

    public void setPayinfoActualfee(BigDecimal payinfoActualfee) {
        this.payinfoActualfee = payinfoActualfee;
    }

    public BigDecimal getFinalMoney() {
        return finalMoney;
    }

    public void setFinalMoney(BigDecimal finalMoney) {
        this.finalMoney = finalMoney;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }
}