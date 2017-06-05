package com.tongxuweb.domain.entity.mainOrder;

/**
 */
public class Extra {
    private String batchSendGoods;
    private String currency;
    private String currencySymbol;
    private String isShowSellerService;
    private String sellerFlag;


    public String getBatchSendGoods() {
        return batchSendGoods;
    }

    public void setBatchSendGoods(String batchSendGoods) {
        this.batchSendGoods = batchSendGoods;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getIsShowSellerService() {
        return isShowSellerService;
    }

    public void setIsShowSellerService(String isShowSellerService) {
        this.isShowSellerService = isShowSellerService;
    }

    public String getSellerFlag() {
        return sellerFlag;
    }

    public void setSellerFlag(String sellerFlag) {
        this.sellerFlag = sellerFlag;
    }
}
