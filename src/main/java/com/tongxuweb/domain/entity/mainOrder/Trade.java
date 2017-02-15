package com.tongxuweb.domain.entity.mainOrder;

/**
 * Created by higgs on 17/2/15.
 */
public class Trade {
    //private String buyer_provice;


    //private String buyer_city;
    //private String buyer_area;
    //private String buyer_post;
    private String buyerAddress;

    private String createTime;
    private String payTime;
    private String sendTime;
    private String alipayId;
    private String orderBar;
    private String orderBarText;
    private String logisticsName;
    private String logisticsNum;
    private String buyMessage;

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getAlipayId() {
        return alipayId;
    }

    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId;
    }

    public String getOrderBar() {
        return orderBar;
    }

    public void setOrderBar(String orderBar) {
        this.orderBar = orderBar;
    }

    public String getOrderBarText() {
        return orderBarText;
    }

    public void setOrderBarText(String orderBarText) {
        this.orderBarText = orderBarText;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum;
    }

    public String getBuyMessage() {
        return buyMessage;
    }

    public void setBuyMessage(String buyMessage) {
        this.buyMessage = buyMessage;
    }
}
