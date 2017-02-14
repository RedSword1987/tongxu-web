package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class PMsg implements Serializable {

    //id
    private Long id;

    //p_msg_batch的id
    private Long msgBatchId;

    //p_msg_template的模版code
    private String templateCode;

    //1:应用消息 2:短信 3:邮件
    private Integer type;

    //1:配置消息 2:通知
    private Integer msgType;

    //参数name(描述)
    private Long receive;

    // 手机号 
    private String receivePhone;

    // 邮箱 
    private String receiveEmail;

    //0:草稿:1:提交未审核,2:审核拒绝,3:审核通过,4:删除,5:已经查看,6:已经发送,7:失败,8:成功
    private Integer status;

    //点击跳转url
    private String url;

    //消息标题
    private String title;

    //0:不是立即生效 1:立即生效
    private Integer isEffect;

    //生效开始时间(立即生效为当前时间)
    private Date effectAt;

    //应用消息读取时间
    private Date readAt;

    //短信通道Code
    private String emailChannelCode;

    //通道CODE
    private String messageChannelCode;

    //创建人
    private Long createdBy;

    //修改人
    private Long updatedBy;

    //创建时间
    private Date createdAt;

    //修改时间
    private Date updatedAt;

    //内容
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMsgBatchId() {
        return msgBatchId;
    }

    public void setMsgBatchId(Long msgBatchId) {
        this.msgBatchId = msgBatchId;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Long getReceive() {
        return receive;
    }

    public void setReceive(Long receive) {
        this.receive = receive;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail == null ? null : receiveEmail.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(Integer isEffect) {
        this.isEffect = isEffect;
    }

    public Date getEffectAt() {
        return effectAt;
    }

    public void setEffectAt(Date effectAt) {
        this.effectAt = effectAt;
    }

    public Date getReadAt() {
        return readAt;
    }

    public void setReadAt(Date readAt) {
        this.readAt = readAt;
    }

    public String getEmailChannelCode() {
        return emailChannelCode;
    }

    public void setEmailChannelCode(String emailChannelCode) {
        this.emailChannelCode = emailChannelCode == null ? null : emailChannelCode.trim();
    }

    public String getMessageChannelCode() {
        return messageChannelCode;
    }

    public void setMessageChannelCode(String messageChannelCode) {
        this.messageChannelCode = messageChannelCode == null ? null : messageChannelCode.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}