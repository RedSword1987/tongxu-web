package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbItem implements Serializable {

    private static final long serialVersionUID = 1L;
    //id
    private Long id;
    //产品编码
    private String code;
    //产品ID
    private String itemId;
    //床大小
    private String skuTextSize;
    //床颜色
    private String skuTextColour;
    //商品进货价
    private BigDecimal price;
    //创建时间
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getSkuTextSize() {
        return skuTextSize;
    }

    public void setSkuTextSize(String skuTextSize) {
        this.skuTextSize = skuTextSize == null ? null : skuTextSize.trim();
    }

    public String getSkuTextColour() {
        return skuTextColour;
    }

    public void setSkuTextColour(String skuTextColour) {
        this.skuTextColour = skuTextColour == null ? null : skuTextColour.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}