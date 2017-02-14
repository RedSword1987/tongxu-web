package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class PMsgBatch implements Serializable {

    //id
    private Long id;

    //模版code
    private String templateCode;

    //0:草稿:1:提交未审核,2:审核拒绝,3:审核通过(审核通过不以编辑),4:删除
    private Integer status;

    //点击跳转url
    private String url;

    //消息标题
    private String title;

    //1:应用消息 2:短信 3:邮件
    private Integer type;

    //0:不是立即生效 1:立即生效
    private Integer isEffect;

    //生效开始时间(立即生效为当前时间)
    private Date effectAt;

    //接受者选择条件
    private String receiveJson;

    //发送的人数
    private Integer num;

    //审核人
    private Long auditedBy;

    //审核时间
    private Date auditedAt;

    //审核意见
    private String auditedRemark;

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

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getReceiveJson() {
        return receiveJson;
    }

    public void setReceiveJson(String receiveJson) {
        this.receiveJson = receiveJson == null ? null : receiveJson.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getAuditedBy() {
        return auditedBy;
    }

    public void setAuditedBy(Long auditedBy) {
        this.auditedBy = auditedBy;
    }

    public Date getAuditedAt() {
        return auditedAt;
    }

    public void setAuditedAt(Date auditedAt) {
        this.auditedAt = auditedAt;
    }

    public String getAuditedRemark() {
        return auditedRemark;
    }

    public void setAuditedRemark(String auditedRemark) {
        this.auditedRemark = auditedRemark == null ? null : auditedRemark.trim();
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