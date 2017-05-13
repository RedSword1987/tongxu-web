package com.tongxuweb.domain.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaobaokeExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaobaokeExample() {
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

        public Criteria andPageShortCodeIsNull() {
            addCriterion("page_short_code is null");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeIsNotNull() {
            addCriterion("page_short_code is not null");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeEqualTo(String value) {
            addCriterion("page_short_code =", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeNotEqualTo(String value) {
            addCriterion("page_short_code <>", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeGreaterThan(String value) {
            addCriterion("page_short_code >", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeGreaterThanOrEqualTo(String value) {
            addCriterion("page_short_code >=", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeLessThan(String value) {
            addCriterion("page_short_code <", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeLessThanOrEqualTo(String value) {
            addCriterion("page_short_code <=", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeLike(String value) {
            addCriterion("page_short_code like", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeNotLike(String value) {
            addCriterion("page_short_code not like", value, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeIn(List<String> values) {
            addCriterion("page_short_code in", values, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeNotIn(List<String> values) {
            addCriterion("page_short_code not in", values, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeBetween(String value1, String value2) {
            addCriterion("page_short_code between", value1, value2, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andPageShortCodeNotBetween(String value1, String value2) {
            addCriterion("page_short_code not between", value1, value2, "pageShortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeIsNull() {
            addCriterion("short_code is null");
            return (Criteria) this;
        }

        public Criteria andShortCodeIsNotNull() {
            addCriterion("short_code is not null");
            return (Criteria) this;
        }

        public Criteria andShortCodeEqualTo(String value) {
            addCriterion("short_code =", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeNotEqualTo(String value) {
            addCriterion("short_code <>", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeGreaterThan(String value) {
            addCriterion("short_code >", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeGreaterThanOrEqualTo(String value) {
            addCriterion("short_code >=", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeLessThan(String value) {
            addCriterion("short_code <", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeLessThanOrEqualTo(String value) {
            addCriterion("short_code <=", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeLike(String value) {
            addCriterion("short_code like", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeNotLike(String value) {
            addCriterion("short_code not like", value, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeIn(List<String> values) {
            addCriterion("short_code in", values, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeNotIn(List<String> values) {
            addCriterion("short_code not in", values, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeBetween(String value1, String value2) {
            addCriterion("short_code between", value1, value2, "shortCode");
            return (Criteria) this;
        }

        public Criteria andShortCodeNotBetween(String value1, String value2) {
            addCriterion("short_code not between", value1, value2, "shortCode");
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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