package com.tongxuweb.domain.entity;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.util.DbSpecialChar;
import com.tongxuweb.util.JsonUtil;
import com.tongxuweb.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by higgs on 17/2/19.
 */
public class SearchTaskBean extends Pagination {

    String order = "desc";
    String sort = "id";
    Integer type;
    Integer status;
    String taskName;


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



            String sortP = request.getParameter("sort");
            if ("id".equalsIgnoreCase(sortP)) {
                this.sort = "id";
            } else if ("type".equalsIgnoreCase(sortP)) {
                this.sort = "type";
            } else if ("taskName".equalsIgnoreCase(sortP)) {
                this.sort = "task_name";
            } else if ("typeNum".equalsIgnoreCase(sortP)) {
                this.sort = "type_num";
            } else if ("begin_date".equalsIgnoreCase(sortP)) {
                this.sort = "begin_date";
            } else if ("end_date".equalsIgnoreCase(sortP)) {
                this.sort = "end_date";
            } else if ("status".equalsIgnoreCase(sortP)) {
                this.sort = "status";
            }else if ("createdAt".equalsIgnoreCase(sortP)) {
                this.sort = "created_at";
            }

            String orderP = request.getParameter("order");
            if ("asc".equalsIgnoreCase(orderP) && !StringUtil.isEmpty(request.getParameter("sort"))) {
                this.order = "asc";
            }

            try {
                String searchFields = request.getParameter("searchFields");
                if (!StringUtil.isEmpty(searchFields)) {
                    searchFields = new String(searchFields.getBytes("ISO-8859-1"), "UTF-8");
                    if (!StringUtil.isEmpty(searchFields)) {
                        Map<String, Map<String, String>> searchFieldsMap = JsonUtil.fromJson(searchFields, JsonUtil.type);
                        for (Map.Entry<String, Map<String, String>> en : searchFieldsMap.entrySet()) {
                            String value = String.valueOf(en.getValue().get("searchValue"));
                            if (!StringUtil.isEmpty(value)) {
                                String key = en.getKey();
                                if ("type".equalsIgnoreCase(key)) {
                                    type = Integer.valueOf(value);
                                } else if ("status".equalsIgnoreCase(key)) {
                                    status = Integer.valueOf(value);
                                } else if ("taskName".equalsIgnoreCase(key)) {
                                    taskName = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                }
                            }
                        }
                    }


                }
            } catch (Exception e) {

            }
        }
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        if (StringUtil.isEmpty(sort)) {
            return "id";
        }
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
