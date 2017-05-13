package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbOrder implements Serializable {

    //id
    private Long id;

    //日期 yyyy-MM-dd
    private String date;

    //任务id
    private Long taskId;

    //购买人id
    private String buyerId;

    //购买人昵称
    private String buyerNick;

    //购买人手机
    private String buyerPhonenum;

    //虚拟手机号
    private String buyerVirtualPhone;

    //收获姓名
    private String buyerName;

    //省
    private String buyerProvice;

    //市
    private String buyerCity;

    //区号
    private String buyerArea;

    //邮编
    private String buyerPost;

    //地址合集
    private String buyerAddress;

    //物流里填的手机号
    private String buyerLogisticsPhone;

    //购买者留言
    private String buyMessage;

    //订单创建时间
    private String orderinfoCreatetime;

    //订单编号
    private String orderinfoId;

    //状态说明
    private String statusinfoText;

    //状态类型
    private String statusinfoType;

    //创建时间
    private String createTime;

    //付款时间
    private String payTime;

    //发货时间
    private String sendTime;

    //支付宝交易号
    private String alipayId;

    //订单阶段
    private String orderBar;

    //订单阶段说明
    private String orderBarText;

    //快递名称
    private String logisticsName;

    //快递编号
    private String logisticsNum;

    //淘宝物流编号
    private String logisticsNumTaobao;

    //物流最后信息
    private String logisticsLastDesc;

    //付款金额*佣金比例（一般是30%）
    private BigDecimal moneyYunyinYongjin;

    //付款金额*6%
    private BigDecimal moneyYunyinFuwufei;

    //扣点费
    private BigDecimal moneyYunyinKoudian;

    //优惠券
    private BigDecimal moneyYunyinYouhuiquan;

    //特殊费用
    private BigDecimal moneyYunyinTeshu;

    //快递费
    private BigDecimal moneyWuliuKuaidi;

    //仓库人工费
    private BigDecimal moneyWuliuChangku;

    //包装费
    private BigDecimal moneyWuliuBaozhuang;

    //运费险
    private BigDecimal moneyWuliuYunfeixian;

    //最后所得
    private BigDecimal moneyFinalMoney;

    //标记信息
    private String tagInfo;

    //物品数量
    private Integer itemNum;

    //创建时间
    private Date createdAt;

    //修改时间
    private Date updatedAt;

    //标题
    private String title;

    //0:无效订单 1:有效
    private Integer status;

    //实际支付金额
    private BigDecimal payinfoActualfee;

    //店铺id
    private String sellerId;

    //淘宝物流编号
    private String logisticsDesc;

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

    public String getBuyerVirtualPhone() {
        return buyerVirtualPhone;
    }

    public void setBuyerVirtualPhone(String buyerVirtualPhone) {
        this.buyerVirtualPhone = buyerVirtualPhone == null ? null : buyerVirtualPhone.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerProvice() {
        return buyerProvice;
    }

    public void setBuyerProvice(String buyerProvice) {
        this.buyerProvice = buyerProvice == null ? null : buyerProvice.trim();
    }

    public String getBuyerCity() {
        return buyerCity;
    }

    public void setBuyerCity(String buyerCity) {
        this.buyerCity = buyerCity == null ? null : buyerCity.trim();
    }

    public String getBuyerArea() {
        return buyerArea;
    }

    public void setBuyerArea(String buyerArea) {
        this.buyerArea = buyerArea == null ? null : buyerArea.trim();
    }

    public String getBuyerPost() {
        return buyerPost;
    }

    public void setBuyerPost(String buyerPost) {
        this.buyerPost = buyerPost == null ? null : buyerPost.trim();
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress == null ? null : buyerAddress.trim();
    }

    public String getBuyerLogisticsPhone() {
        return buyerLogisticsPhone;
    }

    public void setBuyerLogisticsPhone(String buyerLogisticsPhone) {
        this.buyerLogisticsPhone = buyerLogisticsPhone == null ? null : buyerLogisticsPhone.trim();
    }

    public String getBuyMessage() {
        return buyMessage;
    }

    public void setBuyMessage(String buyMessage) {
        this.buyMessage = buyMessage == null ? null : buyMessage.trim();
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    public String getAlipayId() {
        return alipayId;
    }

    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId == null ? null : alipayId.trim();
    }

    public String getOrderBar() {
        return orderBar;
    }

    public void setOrderBar(String orderBar) {
        this.orderBar = orderBar == null ? null : orderBar.trim();
    }

    public String getOrderBarText() {
        return orderBarText;
    }

    public void setOrderBarText(String orderBarText) {
        this.orderBarText = orderBarText == null ? null : orderBarText.trim();
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName == null ? null : logisticsName.trim();
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum == null ? null : logisticsNum.trim();
    }

    public String getLogisticsNumTaobao() {
        return logisticsNumTaobao;
    }

    public void setLogisticsNumTaobao(String logisticsNumTaobao) {
        this.logisticsNumTaobao = logisticsNumTaobao == null ? null : logisticsNumTaobao.trim();
    }

    public String getLogisticsLastDesc() {
        return logisticsLastDesc;
    }

    public void setLogisticsLastDesc(String logisticsLastDesc) {
        this.logisticsLastDesc = logisticsLastDesc == null ? null : logisticsLastDesc.trim();
    }

    public BigDecimal getMoneyYunyinYongjin() {
        return moneyYunyinYongjin;
    }

    public void setMoneyYunyinYongjin(BigDecimal moneyYunyinYongjin) {
        this.moneyYunyinYongjin = moneyYunyinYongjin;
    }

    public BigDecimal getMoneyYunyinFuwufei() {
        return moneyYunyinFuwufei;
    }

    public void setMoneyYunyinFuwufei(BigDecimal moneyYunyinFuwufei) {
        this.moneyYunyinFuwufei = moneyYunyinFuwufei;
    }

    public BigDecimal getMoneyYunyinKoudian() {
        return moneyYunyinKoudian;
    }

    public void setMoneyYunyinKoudian(BigDecimal moneyYunyinKoudian) {
        this.moneyYunyinKoudian = moneyYunyinKoudian;
    }

    public BigDecimal getMoneyYunyinYouhuiquan() {
        return moneyYunyinYouhuiquan;
    }

    public void setMoneyYunyinYouhuiquan(BigDecimal moneyYunyinYouhuiquan) {
        this.moneyYunyinYouhuiquan = moneyYunyinYouhuiquan;
    }

    public BigDecimal getMoneyYunyinTeshu() {
        return moneyYunyinTeshu;
    }

    public void setMoneyYunyinTeshu(BigDecimal moneyYunyinTeshu) {
        this.moneyYunyinTeshu = moneyYunyinTeshu;
    }

    public BigDecimal getMoneyWuliuKuaidi() {
        return moneyWuliuKuaidi;
    }

    public void setMoneyWuliuKuaidi(BigDecimal moneyWuliuKuaidi) {
        this.moneyWuliuKuaidi = moneyWuliuKuaidi;
    }

    public BigDecimal getMoneyWuliuChangku() {
        return moneyWuliuChangku;
    }

    public void setMoneyWuliuChangku(BigDecimal moneyWuliuChangku) {
        this.moneyWuliuChangku = moneyWuliuChangku;
    }

    public BigDecimal getMoneyWuliuBaozhuang() {
        return moneyWuliuBaozhuang;
    }

    public void setMoneyWuliuBaozhuang(BigDecimal moneyWuliuBaozhuang) {
        this.moneyWuliuBaozhuang = moneyWuliuBaozhuang;
    }

    public BigDecimal getMoneyWuliuYunfeixian() {
        return moneyWuliuYunfeixian;
    }

    public void setMoneyWuliuYunfeixian(BigDecimal moneyWuliuYunfeixian) {
        this.moneyWuliuYunfeixian = moneyWuliuYunfeixian;
    }

    public BigDecimal getMoneyFinalMoney() {
        return moneyFinalMoney;
    }

    public void setMoneyFinalMoney(BigDecimal moneyFinalMoney) {
        this.moneyFinalMoney = moneyFinalMoney;
    }

    public String getTagInfo() {
        return tagInfo;
    }

    public void setTagInfo(String tagInfo) {
        this.tagInfo = tagInfo == null ? null : tagInfo.trim();
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getPayinfoActualfee() {
        return payinfoActualfee;
    }

    public void setPayinfoActualfee(BigDecimal payinfoActualfee) {
        this.payinfoActualfee = payinfoActualfee;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getLogisticsDesc() {
        return logisticsDesc;
    }

    public void setLogisticsDesc(String logisticsDesc) {
        this.logisticsDesc = logisticsDesc == null ? null : logisticsDesc.trim();
    }
}