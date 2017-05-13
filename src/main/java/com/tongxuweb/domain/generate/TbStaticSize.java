package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class TbStaticSize implements Serializable {

    //id
    private Long id;

    //日期 yyyy-MM-dd
    private String date;

    //店铺id
    private String sellerId;

    //床宽
    private Integer size09;

    //床宽
    private Integer size10;

    //床宽
    private Integer size12;

    //床宽
    private Integer size15;

    //床宽
    private Integer size18;

    //床宽
    private Integer size20;

    //创建时间
    private Date createdAt;

    //店铺名称
    private String sellerName;

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

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public Integer getSize09() {
        return size09;
    }

    public void setSize09(Integer size09) {
        this.size09 = size09;
    }

    public Integer getSize10() {
        return size10;
    }

    public void setSize10(Integer size10) {
        this.size10 = size10;
    }

    public Integer getSize12() {
        return size12;
    }

    public void setSize12(Integer size12) {
        this.size12 = size12;
    }

    public Integer getSize15() {
        return size15;
    }

    public void setSize15(Integer size15) {
        this.size15 = size15;
    }

    public Integer getSize18() {
        return size18;
    }

    public void setSize18(Integer size18) {
        this.size18 = size18;
    }

    public Integer getSize20() {
        return size20;
    }

    public void setSize20(Integer size20) {
        this.size20 = size20;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }
}