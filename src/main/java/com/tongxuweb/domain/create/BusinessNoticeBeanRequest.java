package com.tongxuweb.domain.create;

import com.tongxuweb.domain.generate.ActivityPayNotify;

/**
 * Created by red
 */
public class BusinessNoticeBeanRequest {
    /**
     * 商户编号 .
     */
    String oid_partner;

    /**
     * 签名方式 .
     */
    String sign_type;

    /**
     * 签名串 .
     */
    String sign;

    /**
     * 商户付款流水号即订单号.
     */
    String no_order;

    /**
     * 商户付款请求时间.
     */
    String dt_order;

    /**
     * 金额.
     */
    String money_order;

    /**
     * 连连支付单.
     */
    String oid_paybill;

    /**
     * 商户付款请求时间.
     */
    String info_order;

    /**
     * 订单状态，付款结果以订单状态为判断依据.
     */
    String result_pay;

    /**
     * 清算时间.
     */
    String settle_date;

    public String getOid_partner() {
        return oid_partner;
    }

    public void setOid_partner(String oid_partner) {
        this.oid_partner = oid_partner;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNo_order() {
        return no_order;
    }

    public void setNo_order(String no_order) {
        this.no_order = no_order;
    }

    public String getDt_order() {
        return dt_order;
    }

    public void setDt_order(String dt_order) {
        this.dt_order = dt_order;
    }

    public String getMoney_order() {
        return money_order;
    }

    public void setMoney_order(String money_order) {
        this.money_order = money_order;
    }

    public String getOid_paybill() {
        return oid_paybill;
    }

    public void setOid_paybill(String oid_paybill) {
        this.oid_paybill = oid_paybill;
    }

    public String getInfo_order() {
        return info_order;
    }

    public void setInfo_order(String info_order) {
        this.info_order = info_order;
    }

    public String getResult_pay() {
        return result_pay;
    }

    public void setResult_pay(String result_pay) {
        this.result_pay = result_pay;
    }

    public String getSettle_date() {
        return settle_date;
    }

    public void setSettle_date(String settle_date) {
        this.settle_date = settle_date;
    }

    public ActivityPayNotify toAp() {
        ActivityPayNotify ap = new ActivityPayNotify();
        ap.setOidPartner(this.oid_partner);
        ap.setSignType(this.sign_type);
        ap.setSign(this.sign);
        ap.setNoOrder(this.no_order);
        ap.setDtOrder(this.dt_order);
        ap.setMoneyOrder(this.money_order);
        ap.setOidPaybill(this.oid_paybill);
        ap.setInfoOrder(this.info_order);
        ap.setResultPay(this.result_pay);
        ap.setSettleDate(this.settle_date);


        return ap;
    }
}
