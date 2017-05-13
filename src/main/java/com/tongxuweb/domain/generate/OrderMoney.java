package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderMoney implements Serializable {

    //id
    private Long id;

    //任务id
    private Long taskId;

    //订单编号
    private String orderinfoId;

    //产品编码
    private String code;

    //产品ID
    private String itemId;

    //实际支付金额
    private BigDecimal payinfoActualfee;

    //商品进货价
    private BigDecimal itemJinhuo;

    //赠品进货价
    private BigDecimal itemZhenping;

    //付款金额*佣金比例（一般是30%）
    private BigDecimal yunyinYongjin;

    //付款金额*6%
    private BigDecimal yunyinFuwufei;

    //扣点费
    private BigDecimal yunyinKoudian;

    //优惠券
    private BigDecimal yunyinYouhuiquan;

    //特殊费用
    private BigDecimal yunyinTeshu;

    //快递费
    private BigDecimal wuliuKuaidi;

    //仓库人工费
    private BigDecimal wuliuChangku;

    //包装费
    private BigDecimal wuliuBaozhuang;

    //运费险
    private BigDecimal wuliuYunfeixian;

    //最后所得
    private BigDecimal finalMoney;

    //购买时间
    private String orderinfoCreatetime;

    //付款时间
    private String payTime;

    //状态说明
    private String statusinfoText;

    //状态类型
    private String statusinfoType;

    //床大小
    private String skuTextSize;

    //床颜色
    private String skuTextColour;

    //店铺ID
    private String sellerId;

    //店铺名称
    private String sellerName;

    //标记信息
    private String tagInfo;

    //创建时间
    private Date createdAt;

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

    public BigDecimal getPayinfoActualfee() {
        return payinfoActualfee;
    }

    public void setPayinfoActualfee(BigDecimal payinfoActualfee) {
        this.payinfoActualfee = payinfoActualfee;
    }

    public BigDecimal getItemJinhuo() {
        return itemJinhuo;
    }

    public void setItemJinhuo(BigDecimal itemJinhuo) {
        this.itemJinhuo = itemJinhuo;
    }

    public BigDecimal getItemZhenping() {
        return itemZhenping;
    }

    public void setItemZhenping(BigDecimal itemZhenping) {
        this.itemZhenping = itemZhenping;
    }

    public BigDecimal getYunyinYongjin() {
        return yunyinYongjin;
    }

    public void setYunyinYongjin(BigDecimal yunyinYongjin) {
        this.yunyinYongjin = yunyinYongjin;
    }

    public BigDecimal getYunyinFuwufei() {
        return yunyinFuwufei;
    }

    public void setYunyinFuwufei(BigDecimal yunyinFuwufei) {
        this.yunyinFuwufei = yunyinFuwufei;
    }

    public BigDecimal getYunyinKoudian() {
        return yunyinKoudian;
    }

    public void setYunyinKoudian(BigDecimal yunyinKoudian) {
        this.yunyinKoudian = yunyinKoudian;
    }

    public BigDecimal getYunyinYouhuiquan() {
        return yunyinYouhuiquan;
    }

    public void setYunyinYouhuiquan(BigDecimal yunyinYouhuiquan) {
        this.yunyinYouhuiquan = yunyinYouhuiquan;
    }

    public BigDecimal getYunyinTeshu() {
        return yunyinTeshu;
    }

    public void setYunyinTeshu(BigDecimal yunyinTeshu) {
        this.yunyinTeshu = yunyinTeshu;
    }

    public BigDecimal getWuliuKuaidi() {
        return wuliuKuaidi;
    }

    public void setWuliuKuaidi(BigDecimal wuliuKuaidi) {
        this.wuliuKuaidi = wuliuKuaidi;
    }

    public BigDecimal getWuliuChangku() {
        return wuliuChangku;
    }

    public void setWuliuChangku(BigDecimal wuliuChangku) {
        this.wuliuChangku = wuliuChangku;
    }

    public BigDecimal getWuliuBaozhuang() {
        return wuliuBaozhuang;
    }

    public void setWuliuBaozhuang(BigDecimal wuliuBaozhuang) {
        this.wuliuBaozhuang = wuliuBaozhuang;
    }

    public BigDecimal getWuliuYunfeixian() {
        return wuliuYunfeixian;
    }

    public void setWuliuYunfeixian(BigDecimal wuliuYunfeixian) {
        this.wuliuYunfeixian = wuliuYunfeixian;
    }

    public BigDecimal getFinalMoney() {
        return finalMoney;
    }

    public void setFinalMoney(BigDecimal finalMoney) {
        this.finalMoney = finalMoney;
    }

    public String getOrderinfoCreatetime() {
        return orderinfoCreatetime;
    }

    public void setOrderinfoCreatetime(String orderinfoCreatetime) {
        this.orderinfoCreatetime = orderinfoCreatetime == null ? null : orderinfoCreatetime.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
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

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getTagInfo() {
        return tagInfo;
    }

    public void setTagInfo(String tagInfo) {
        this.tagInfo = tagInfo == null ? null : tagInfo.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}