package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class Taobaoke implements Serializable {

    //id
    private Long id;

    private String pageShortCode;

    private String shortCode;

    //创建时间
    private Date createdAt;

    private String ip;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPageShortCode() {
        return pageShortCode;
    }

    public void setPageShortCode(String pageShortCode) {
        this.pageShortCode = pageShortCode == null ? null : pageShortCode.trim();
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode == null ? null : shortCode.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}