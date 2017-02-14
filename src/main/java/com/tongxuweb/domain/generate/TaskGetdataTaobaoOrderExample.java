package com.tongxuweb.domain.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskGetdataTaobaoOrderExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskGetdataTaobaoOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("buyer_id like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("buyer_id not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIsNull() {
            addCriterion("buyer_nick is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIsNotNull() {
            addCriterion("buyer_nick is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickEqualTo(String value) {
            addCriterion("buyer_nick =", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotEqualTo(String value) {
            addCriterion("buyer_nick <>", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThan(String value) {
            addCriterion("buyer_nick >", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nick >=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLessThan(String value) {
            addCriterion("buyer_nick <", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLessThanOrEqualTo(String value) {
            addCriterion("buyer_nick <=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLike(String value) {
            addCriterion("buyer_nick like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotLike(String value) {
            addCriterion("buyer_nick not like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIn(List<String> values) {
            addCriterion("buyer_nick in", values, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotIn(List<String> values) {
            addCriterion("buyer_nick not in", values, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickBetween(String value1, String value2) {
            addCriterion("buyer_nick between", value1, value2, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotBetween(String value1, String value2) {
            addCriterion("buyer_nick not between", value1, value2, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumIsNull() {
            addCriterion("buyer_phonenum is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumIsNotNull() {
            addCriterion("buyer_phonenum is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumEqualTo(String value) {
            addCriterion("buyer_phonenum =", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumNotEqualTo(String value) {
            addCriterion("buyer_phonenum <>", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumGreaterThan(String value) {
            addCriterion("buyer_phonenum >", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_phonenum >=", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumLessThan(String value) {
            addCriterion("buyer_phonenum <", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumLessThanOrEqualTo(String value) {
            addCriterion("buyer_phonenum <=", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumLike(String value) {
            addCriterion("buyer_phonenum like", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumNotLike(String value) {
            addCriterion("buyer_phonenum not like", value, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumIn(List<String> values) {
            addCriterion("buyer_phonenum in", values, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumNotIn(List<String> values) {
            addCriterion("buyer_phonenum not in", values, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumBetween(String value1, String value2) {
            addCriterion("buyer_phonenum between", value1, value2, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andBuyerPhonenumNotBetween(String value1, String value2) {
            addCriterion("buyer_phonenum not between", value1, value2, "buyerPhonenum");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeIsNull() {
            addCriterion("orderinfo_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeIsNotNull() {
            addCriterion("orderinfo_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeEqualTo(String value) {
            addCriterion("orderinfo_createtime =", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeNotEqualTo(String value) {
            addCriterion("orderinfo_createtime <>", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeGreaterThan(String value) {
            addCriterion("orderinfo_createtime >", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderinfo_createtime >=", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeLessThan(String value) {
            addCriterion("orderinfo_createtime <", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("orderinfo_createtime <=", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeLike(String value) {
            addCriterion("orderinfo_createtime like", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeNotLike(String value) {
            addCriterion("orderinfo_createtime not like", value, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeIn(List<String> values) {
            addCriterion("orderinfo_createtime in", values, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeNotIn(List<String> values) {
            addCriterion("orderinfo_createtime not in", values, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeBetween(String value1, String value2) {
            addCriterion("orderinfo_createtime between", value1, value2, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoCreatetimeNotBetween(String value1, String value2) {
            addCriterion("orderinfo_createtime not between", value1, value2, "orderinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdIsNull() {
            addCriterion("orderinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdIsNotNull() {
            addCriterion("orderinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdEqualTo(String value) {
            addCriterion("orderinfo_id =", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdNotEqualTo(String value) {
            addCriterion("orderinfo_id <>", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdGreaterThan(String value) {
            addCriterion("orderinfo_id >", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("orderinfo_id >=", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdLessThan(String value) {
            addCriterion("orderinfo_id <", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdLessThanOrEqualTo(String value) {
            addCriterion("orderinfo_id <=", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdLike(String value) {
            addCriterion("orderinfo_id like", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdNotLike(String value) {
            addCriterion("orderinfo_id not like", value, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdIn(List<String> values) {
            addCriterion("orderinfo_id in", values, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdNotIn(List<String> values) {
            addCriterion("orderinfo_id not in", values, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdBetween(String value1, String value2) {
            addCriterion("orderinfo_id between", value1, value2, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIdNotBetween(String value1, String value2) {
            addCriterion("orderinfo_id not between", value1, value2, "orderinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeIsNull() {
            addCriterion("payinfo_actualfee is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeIsNotNull() {
            addCriterion("payinfo_actualfee is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeEqualTo(String value) {
            addCriterion("payinfo_actualfee =", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeNotEqualTo(String value) {
            addCriterion("payinfo_actualfee <>", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeGreaterThan(String value) {
            addCriterion("payinfo_actualfee >", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeGreaterThanOrEqualTo(String value) {
            addCriterion("payinfo_actualfee >=", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeLessThan(String value) {
            addCriterion("payinfo_actualfee <", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeLessThanOrEqualTo(String value) {
            addCriterion("payinfo_actualfee <=", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeLike(String value) {
            addCriterion("payinfo_actualfee like", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeNotLike(String value) {
            addCriterion("payinfo_actualfee not like", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeIn(List<String> values) {
            addCriterion("payinfo_actualfee in", values, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeNotIn(List<String> values) {
            addCriterion("payinfo_actualfee not in", values, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeBetween(String value1, String value2) {
            addCriterion("payinfo_actualfee between", value1, value2, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeNotBetween(String value1, String value2) {
            addCriterion("payinfo_actualfee not between", value1, value2, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextIsNull() {
            addCriterion("statusinfo_text is null");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextIsNotNull() {
            addCriterion("statusinfo_text is not null");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextEqualTo(String value) {
            addCriterion("statusinfo_text =", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextNotEqualTo(String value) {
            addCriterion("statusinfo_text <>", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextGreaterThan(String value) {
            addCriterion("statusinfo_text >", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextGreaterThanOrEqualTo(String value) {
            addCriterion("statusinfo_text >=", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextLessThan(String value) {
            addCriterion("statusinfo_text <", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextLessThanOrEqualTo(String value) {
            addCriterion("statusinfo_text <=", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextLike(String value) {
            addCriterion("statusinfo_text like", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextNotLike(String value) {
            addCriterion("statusinfo_text not like", value, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextIn(List<String> values) {
            addCriterion("statusinfo_text in", values, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextNotIn(List<String> values) {
            addCriterion("statusinfo_text not in", values, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextBetween(String value1, String value2) {
            addCriterion("statusinfo_text between", value1, value2, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTextNotBetween(String value1, String value2) {
            addCriterion("statusinfo_text not between", value1, value2, "statusinfoText");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeIsNull() {
            addCriterion("statusinfo_type is null");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeIsNotNull() {
            addCriterion("statusinfo_type is not null");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeEqualTo(String value) {
            addCriterion("statusinfo_type =", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeNotEqualTo(String value) {
            addCriterion("statusinfo_type <>", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeGreaterThan(String value) {
            addCriterion("statusinfo_type >", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("statusinfo_type >=", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeLessThan(String value) {
            addCriterion("statusinfo_type <", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeLessThanOrEqualTo(String value) {
            addCriterion("statusinfo_type <=", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeLike(String value) {
            addCriterion("statusinfo_type like", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeNotLike(String value) {
            addCriterion("statusinfo_type not like", value, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeIn(List<String> values) {
            addCriterion("statusinfo_type in", values, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeNotIn(List<String> values) {
            addCriterion("statusinfo_type not in", values, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeBetween(String value1, String value2) {
            addCriterion("statusinfo_type between", value1, value2, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andStatusinfoTypeNotBetween(String value1, String value2) {
            addCriterion("statusinfo_type not between", value1, value2, "statusinfoType");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Long value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Long value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Long value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Long value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Long> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Long> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Long value1, Long value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    public static class Criterion {

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}