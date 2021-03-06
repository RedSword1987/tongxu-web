package com.tongxuweb.domain.generate;

import java.io.Serializable;

public class TbOrderStatusInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    //id
    private Long id;
    private String name;
    //0:无效订单 1:有效订单
    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}