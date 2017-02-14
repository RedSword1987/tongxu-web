package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class PUser implements Serializable {

    //id
    private Long id;

    private String loginName;

    //登录密码
    private String loginPass;

    //支付密码
    private String payPass;

    //手势密码
    private String gesturePass;

    //用户姓名
    private String userName;

    //1:系统用户 2:客户创建用户(系统用户不可编辑)
    private Integer userType;

    //认真类型 1:短信
    private Integer authType;

    private String phone;

    //1:正常 2:停用 3:删除 4:锁定
    private Integer status;

    //密码重置:0:不需要 1:重置
    private Integer isReset;

    //登录失败次数(每日晚清0,超过10次,锁定)
    private Integer loginFailTimes;

    //支付失败次数(每日晚清0,超过10次,锁定)
    private Integer payFailTimes;

    //手势失败次数(每日晚清0,超过10次,锁定)
    private Integer gestureFailTimes;

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass == null ? null : payPass.trim();
    }

    public String getGesturePass() {
        return gesturePass;
    }

    public void setGesturePass(String gesturePass) {
        this.gesturePass = gesturePass == null ? null : gesturePass.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsReset() {
        return isReset;
    }

    public void setIsReset(Integer isReset) {
        this.isReset = isReset;
    }

    public Integer getLoginFailTimes() {
        return loginFailTimes;
    }

    public void setLoginFailTimes(Integer loginFailTimes) {
        this.loginFailTimes = loginFailTimes;
    }

    public Integer getPayFailTimes() {
        return payFailTimes;
    }

    public void setPayFailTimes(Integer payFailTimes) {
        this.payFailTimes = payFailTimes;
    }

    public Integer getGestureFailTimes() {
        return gestureFailTimes;
    }

    public void setGestureFailTimes(Integer gestureFailTimes) {
        this.gestureFailTimes = gestureFailTimes;
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