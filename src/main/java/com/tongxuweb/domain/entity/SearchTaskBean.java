package com.tongxuweb.domain.entity;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by higgs on 17/2/19.
 */
public class SearchTaskBean extends Pagination {


    Integer type;
    Date createdAt;


    public SearchTaskBean(HttpServletRequest request) {
        if (request != null) {
            String length = request.getParameter("limit");
            String start = request.getParameter("offset");
            if (StringUtil.isEmpty(length)) {
                setLimit(10);
            }else {
                setLimit(Integer.valueOf(length));
            }
            if (StringUtil.isEmpty(start)) {
                setOffset(0);
            }else{
                setOffset(Integer.valueOf(start));
            }

        }
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
