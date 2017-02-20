package com.tongxuweb.domain.entity;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by higgs on 17/2/20.
 */
public class SearchTaskResultBean extends Pagination {
    private Long id;
    private Date beginDate;
    private Date endDate;


    public SearchTaskResultBean(HttpServletRequest request) {
        if (request != null) {
            String length = request.getParameter("limit");
            String start = request.getParameter("offset");
            if (StringUtil.isEmpty(length)) {
                setLimit(10);
            } else {
                setLimit(Integer.valueOf(length));
            }
            if (StringUtil.isEmpty(start)) {
                setOffset(0);
            } else {
                setOffset(Integer.valueOf(start));
            }

            setId(Long.valueOf(String.valueOf(request.getParameter("id"))));

        }
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
