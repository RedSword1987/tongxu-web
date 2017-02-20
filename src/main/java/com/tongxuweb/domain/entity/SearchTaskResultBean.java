package com.tongxuweb.domain.entity;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.util.DbSpecialChar;
import com.tongxuweb.util.JsonUtil;
import com.tongxuweb.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * Created by higgs on 17/2/20.
 */
public class SearchTaskResultBean extends Pagination {

    private Long id;
    private Date beginDate;
    private Date endDate;
    String orderinfoId;
    String orderBarText;
    String statusinfoText;
    String logisticsName;
    String logisticsNum;
    String buyerNick;
    String buyerArea;
    String order = "desc";
    String sort = "id";

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
            if (!StringUtil.isEmpty(request.getParameter("id"))) {
                setId(Long.valueOf(String.valueOf(request.getParameter("id"))));
            }

            String orderP = request.getParameter("order");
            if ("asc".equalsIgnoreCase(orderP)) {
                this.order = "asc";
            }

            String sortP = request.getParameter("sort");
            if ("id".equalsIgnoreCase(sortP)) {
                this.sort = "id";
            } else if ("orderinfoId".equalsIgnoreCase(sortP)) {
                this.sort = "orderinfo_id";
            } else if ("orderinfoCreatetime".equalsIgnoreCase(sortP)) {
                this.sort = "orderinfo_createtime";
            } else if ("orderBarText".equalsIgnoreCase(sortP)) {
                this.sort = "order_bar_text";
            } else if ("statusinfoText".equalsIgnoreCase(sortP)) {
                this.sort = "statusinfo_text";
            } else if ("logisticsName".equalsIgnoreCase(sortP)) {
                this.sort = "logistics_name";
            } else if ("logisticsNum".equalsIgnoreCase(sortP)) {
                this.sort = "logistics_num";
            } else if ("logisticsNum".equalsIgnoreCase(sortP)) {
                this.sort = "logistics_num";
            } else if ("buyerNick".equalsIgnoreCase(sortP)) {
                this.sort = "buyer_nick";
            } else if ("buyerPhonenum".equalsIgnoreCase(sortP)) {
                this.sort = "buyer_phonenum";
            } else if ("buyerLogisticsPhone".equalsIgnoreCase(sortP)) {
                this.sort = "buyer_logistics_phone";
            } else if ("buyerProvice".equalsIgnoreCase(sortP)) {
                this.sort = "buyer_provice";
            } else if ("buyerCity".equalsIgnoreCase(sortP)) {
                this.sort = "buyer_city";
            } else if ("buyerArea".equalsIgnoreCase(sortP)) {
                this.sort = "buyer_area";
            } else if ("buyerPost".equalsIgnoreCase(sortP)) {
                this.sort = "buyer_post";
            } else if ("payTime".equalsIgnoreCase(sortP)) {
                this.sort = "pay_time";
            } else if ("sendTime".equalsIgnoreCase(sortP)) {
                this.sort = "send_time";
            } else if ("alipayId".equalsIgnoreCase(sortP)) {
                this.sort = "alipay_id";
            } else if ("logisticsLastDesc".equalsIgnoreCase(sortP)) {
                this.sort = "logistics_last_desc";
            }
            try {
                String searchFields = request.getParameter("searchFields");
                if (!StringUtil.isEmpty(searchFields)) {
                    //searchFields = new String(searchFields.getBytes("ISO-8859-1"), "UTF-8");
                    if (!StringUtil.isEmpty(searchFields)) {
                        Map<String, Map<String, String>> searchFieldsMap = JsonUtil.fromJson(searchFields, JsonUtil.type);
                        for (Map.Entry<String, Map<String, String>> en : searchFieldsMap.entrySet()) {
                            String value = String.valueOf(en.getValue().get("searchValue"));
                            if (!StringUtil.isEmpty(value)) {
                                String key = en.getKey();
                                if ("orderinfoId".equalsIgnoreCase(key)) {
                                    orderinfoId = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                } else if ("orderBarText".equalsIgnoreCase(key)) {
                                    orderBarText = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                } else if ("statusinfoText".equalsIgnoreCase(key)) {
                                    statusinfoText = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                } else if ("logisticsName".equalsIgnoreCase(key)) {
                                    logisticsName = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                } else if ("logisticsNum".equalsIgnoreCase(key)) {
                                    logisticsNum = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                } else if ("buyerNick".equalsIgnoreCase(key)) {
                                    buyerNick = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                } else if ("buyerArea".equalsIgnoreCase(key)) {
                                    buyerArea = "%" + DbSpecialChar.replaceForSqlMySql(value) + "%";
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {

            }
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

    public String getOrderinfoId() {
        return orderinfoId;
    }

    public void setOrderinfoId(String orderinfoId) {
        this.orderinfoId = orderinfoId;
    }

    public String getOrderBarText() {
        return orderBarText;
    }

    public void setOrderBarText(String orderBarText) {
        this.orderBarText = orderBarText;
    }

    public String getStatusinfoText() {
        return statusinfoText;
    }

    public void setStatusinfoText(String statusinfoText) {
        this.statusinfoText = statusinfoText;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerArea() {
        return buyerArea;
    }

    public void setBuyerArea(String buyerArea) {
        this.buyerArea = buyerArea;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        if (!StringUtil.isEmpty(sort)) {
            return "id";
        }
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
