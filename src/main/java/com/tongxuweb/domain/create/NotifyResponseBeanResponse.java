package com.tongxuweb.domain.create;

/**
 * Created by red
 */
public class NotifyResponseBeanResponse {
    /**
     * 交易结果code .
     */
    String ret_code;

    /**
     * 交易结果描述 .
     */
    String ret_msg;


    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }
}
