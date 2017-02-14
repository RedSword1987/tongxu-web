package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class PMsgEmailChannel implements Serializable {

    //id
    private Long id;

    //发送通道
    private String name;

    //通道CODE
    private String emailChannelCode;

    //账户
    private String emailAccount;

    //密码
    private String emailPass;

    //端口
    private Integer emailPort;

    //Host地址
    private String emailHost;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmailChannelCode() {
        return emailChannelCode;
    }

    public void setEmailChannelCode(String emailChannelCode) {
        this.emailChannelCode = emailChannelCode == null ? null : emailChannelCode.trim();
    }

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount == null ? null : emailAccount.trim();
    }

    public String getEmailPass() {
        return emailPass;
    }

    public void setEmailPass(String emailPass) {
        this.emailPass = emailPass == null ? null : emailPass.trim();
    }

    public Integer getEmailPort() {
        return emailPort;
    }

    public void setEmailPort(Integer emailPort) {
        this.emailPort = emailPort;
    }

    public String getEmailHost() {
        return emailHost;
    }

    public void setEmailHost(String emailHost) {
        this.emailHost = emailHost == null ? null : emailHost.trim();
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