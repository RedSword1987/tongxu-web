package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class TaskGetdataTaobaoOrder implements Serializable {

    //id
    private Long id;

    //任务id
    private Long taskId;

    //购买人id
    private String buyerId;

    //购买人昵称
    private String buyerNick;

    //购买人手机
    private String buyerPhonenum;

    //购买时间
    private String orderinfoCreatetime;

    //订单编号
    private String orderinfoId;

    //实际支付金额
    private String payinfoActualfee;

    //状态说明
    private String statusinfoText;

    //状态类型
    private String statusinfoType;

    //创建人
    private Long createdBy;

    //修改人
    private Long updatedBy;

    //创建时间
    private Date createdAt;

    //修改时间
    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public String getBuyerPhonenum() {
        return buyerPhonenum;
    }

    public void setBuyerPhonenum(String buyerPhonenum) {
        this.buyerPhonenum = buyerPhonenum == null ? null : buyerPhonenum.trim();
    }

    public String getOrderinfoCreatetime() {
        return orderinfoCreatetime;
    }

    public void setOrderinfoCreatetime(String orderinfoCreatetime) {
        this.orderinfoCreatetime = orderinfoCreatetime == null ? null : orderinfoCreatetime.trim();
    }

    public String getOrderinfoId() {
        return orderinfoId;
    }

    public void setOrderinfoId(String orderinfoId) {
        this.orderinfoId = orderinfoId == null ? null : orderinfoId.trim();
    }

    public String getPayinfoActualfee() {
        return payinfoActualfee;
    }

    public void setPayinfoActualfee(String payinfoActualfee) {
        this.payinfoActualfee = payinfoActualfee == null ? null : payinfoActualfee.trim();
    }

    public String getStatusinfoText() {
        return statusinfoText;
    }

    public void setStatusinfoText(String statusinfoText) {
        this.statusinfoText = statusinfoText == null ? null : statusinfoText.trim();
    }

    public String getStatusinfoType() {
        return statusinfoType;
    }

    public void setStatusinfoType(String statusinfoType) {
        this.statusinfoType = statusinfoType == null ? null : statusinfoType.trim();
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}