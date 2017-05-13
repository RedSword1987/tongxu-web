package com.tongxuweb.domain.generate;

import java.io.Serializable;

public class TbSeller implements Serializable {

    //id
    private Long id;

    //店铺id
    private String sellerId;

    //店铺名称
    private String sellerName;

    //0:不启用 1:启用
    private Integer sellerStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getSellerStatus() {
        return sellerStatus;
    }

    public void setSellerStatus(Integer sellerStatus) {
        this.sellerStatus = sellerStatus;
    }
}