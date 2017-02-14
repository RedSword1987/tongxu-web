package com.tongxuweb.domain.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PMsgEmailChannelExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PMsgEmailChannelExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeIsNull() {
            addCriterion("email_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeIsNotNull() {
            addCriterion("email_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeEqualTo(String value) {
            addCriterion("email_channel_code =", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeNotEqualTo(String value) {
            addCriterion("email_channel_code <>", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeGreaterThan(String value) {
            addCriterion("email_channel_code >", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("email_channel_code >=", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeLessThan(String value) {
            addCriterion("email_channel_code <", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("email_channel_code <=", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeLike(String value) {
            addCriterion("email_channel_code like", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeNotLike(String value) {
            addCriterion("email_channel_code not like", value, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeIn(List<String> values) {
            addCriterion("email_channel_code in", values, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeNotIn(List<String> values) {
            addCriterion("email_channel_code not in", values, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeBetween(String value1, String value2) {
            addCriterion("email_channel_code between", value1, value2, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailChannelCodeNotBetween(String value1, String value2) {
            addCriterion("email_channel_code not between", value1, value2, "emailChannelCode");
            return (Criteria) this;
        }

        public Criteria andEmailAccountIsNull() {
            addCriterion("email_account is null");
            return (Criteria) this;
        }

        public Criteria andEmailAccountIsNotNull() {
            addCriterion("email_account is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAccountEqualTo(String value) {
            addCriterion("email_account =", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountNotEqualTo(String value) {
            addCriterion("email_account <>", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountGreaterThan(String value) {
            addCriterion("email_account >", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountGreaterThanOrEqualTo(String value) {
            addCriterion("email_account >=", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountLessThan(String value) {
            addCriterion("email_account <", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountLessThanOrEqualTo(String value) {
            addCriterion("email_account <=", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountLike(String value) {
            addCriterion("email_account like", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountNotLike(String value) {
            addCriterion("email_account not like", value, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountIn(List<String> values) {
            addCriterion("email_account in", values, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountNotIn(List<String> values) {
            addCriterion("email_account not in", values, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountBetween(String value1, String value2) {
            addCriterion("email_account between", value1, value2, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailAccountNotBetween(String value1, String value2) {
            addCriterion("email_account not between", value1, value2, "emailAccount");
            return (Criteria) this;
        }

        public Criteria andEmailPassIsNull() {
            addCriterion("email_pass is null");
            return (Criteria) this;
        }

        public Criteria andEmailPassIsNotNull() {
            addCriterion("email_pass is not null");
            return (Criteria) this;
        }

        public Criteria andEmailPassEqualTo(String value) {
            addCriterion("email_pass =", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassNotEqualTo(String value) {
            addCriterion("email_pass <>", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassGreaterThan(String value) {
            addCriterion("email_pass >", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassGreaterThanOrEqualTo(String value) {
            addCriterion("email_pass >=", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassLessThan(String value) {
            addCriterion("email_pass <", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassLessThanOrEqualTo(String value) {
            addCriterion("email_pass <=", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassLike(String value) {
            addCriterion("email_pass like", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassNotLike(String value) {
            addCriterion("email_pass not like", value, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassIn(List<String> values) {
            addCriterion("email_pass in", values, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassNotIn(List<String> values) {
            addCriterion("email_pass not in", values, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassBetween(String value1, String value2) {
            addCriterion("email_pass between", value1, value2, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPassNotBetween(String value1, String value2) {
            addCriterion("email_pass not between", value1, value2, "emailPass");
            return (Criteria) this;
        }

        public Criteria andEmailPortIsNull() {
            addCriterion("email_port is null");
            return (Criteria) this;
        }

        public Criteria andEmailPortIsNotNull() {
            addCriterion("email_port is not null");
            return (Criteria) this;
        }

        public Criteria andEmailPortEqualTo(Integer value) {
            addCriterion("email_port =", value, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortNotEqualTo(Integer value) {
            addCriterion("email_port <>", value, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortGreaterThan(Integer value) {
            addCriterion("email_port >", value, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_port >=", value, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortLessThan(Integer value) {
            addCriterion("email_port <", value, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortLessThanOrEqualTo(Integer value) {
            addCriterion("email_port <=", value, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortIn(List<Integer> values) {
            addCriterion("email_port in", values, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortNotIn(List<Integer> values) {
            addCriterion("email_port not in", values, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortBetween(Integer value1, Integer value2) {
            addCriterion("email_port between", value1, value2, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailPortNotBetween(Integer value1, Integer value2) {
            addCriterion("email_port not between", value1, value2, "emailPort");
            return (Criteria) this;
        }

        public Criteria andEmailHostIsNull() {
            addCriterion("email_host is null");
            return (Criteria) this;
        }

        public Criteria andEmailHostIsNotNull() {
            addCriterion("email_host is not null");
            return (Criteria) this;
        }

        public Criteria andEmailHostEqualTo(String value) {
            addCriterion("email_host =", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostNotEqualTo(String value) {
            addCriterion("email_host <>", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostGreaterThan(String value) {
            addCriterion("email_host >", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostGreaterThanOrEqualTo(String value) {
            addCriterion("email_host >=", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostLessThan(String value) {
            addCriterion("email_host <", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostLessThanOrEqualTo(String value) {
            addCriterion("email_host <=", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostLike(String value) {
            addCriterion("email_host like", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostNotLike(String value) {
            addCriterion("email_host not like", value, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostIn(List<String> values) {
            addCriterion("email_host in", values, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostNotIn(List<String> values) {
            addCriterion("email_host not in", values, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostBetween(String value1, String value2) {
            addCriterion("email_host between", value1, value2, "emailHost");
            return (Criteria) this;
        }

        public Criteria andEmailHostNotBetween(String value1, String value2) {
            addCriterion("email_host not between", value1, value2, "emailHost");
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