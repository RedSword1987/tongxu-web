package com.tongxuweb.domain.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbStaticSizeExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStaticSizeExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSize09IsNull() {
            addCriterion("size09 is null");
            return (Criteria) this;
        }

        public Criteria andSize09IsNotNull() {
            addCriterion("size09 is not null");
            return (Criteria) this;
        }

        public Criteria andSize09EqualTo(Integer value) {
            addCriterion("size09 =", value, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09NotEqualTo(Integer value) {
            addCriterion("size09 <>", value, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09GreaterThan(Integer value) {
            addCriterion("size09 >", value, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09GreaterThanOrEqualTo(Integer value) {
            addCriterion("size09 >=", value, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09LessThan(Integer value) {
            addCriterion("size09 <", value, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09LessThanOrEqualTo(Integer value) {
            addCriterion("size09 <=", value, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09In(List<Integer> values) {
            addCriterion("size09 in", values, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09NotIn(List<Integer> values) {
            addCriterion("size09 not in", values, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09Between(Integer value1, Integer value2) {
            addCriterion("size09 between", value1, value2, "size09");
            return (Criteria) this;
        }

        public Criteria andSize09NotBetween(Integer value1, Integer value2) {
            addCriterion("size09 not between", value1, value2, "size09");
            return (Criteria) this;
        }

        public Criteria andSize10IsNull() {
            addCriterion("size10 is null");
            return (Criteria) this;
        }

        public Criteria andSize10IsNotNull() {
            addCriterion("size10 is not null");
            return (Criteria) this;
        }

        public Criteria andSize10EqualTo(Integer value) {
            addCriterion("size10 =", value, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10NotEqualTo(Integer value) {
            addCriterion("size10 <>", value, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10GreaterThan(Integer value) {
            addCriterion("size10 >", value, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10GreaterThanOrEqualTo(Integer value) {
            addCriterion("size10 >=", value, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10LessThan(Integer value) {
            addCriterion("size10 <", value, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10LessThanOrEqualTo(Integer value) {
            addCriterion("size10 <=", value, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10In(List<Integer> values) {
            addCriterion("size10 in", values, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10NotIn(List<Integer> values) {
            addCriterion("size10 not in", values, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10Between(Integer value1, Integer value2) {
            addCriterion("size10 between", value1, value2, "size10");
            return (Criteria) this;
        }

        public Criteria andSize10NotBetween(Integer value1, Integer value2) {
            addCriterion("size10 not between", value1, value2, "size10");
            return (Criteria) this;
        }

        public Criteria andSize12IsNull() {
            addCriterion("size12 is null");
            return (Criteria) this;
        }

        public Criteria andSize12IsNotNull() {
            addCriterion("size12 is not null");
            return (Criteria) this;
        }

        public Criteria andSize12EqualTo(Integer value) {
            addCriterion("size12 =", value, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12NotEqualTo(Integer value) {
            addCriterion("size12 <>", value, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12GreaterThan(Integer value) {
            addCriterion("size12 >", value, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12GreaterThanOrEqualTo(Integer value) {
            addCriterion("size12 >=", value, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12LessThan(Integer value) {
            addCriterion("size12 <", value, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12LessThanOrEqualTo(Integer value) {
            addCriterion("size12 <=", value, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12In(List<Integer> values) {
            addCriterion("size12 in", values, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12NotIn(List<Integer> values) {
            addCriterion("size12 not in", values, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12Between(Integer value1, Integer value2) {
            addCriterion("size12 between", value1, value2, "size12");
            return (Criteria) this;
        }

        public Criteria andSize12NotBetween(Integer value1, Integer value2) {
            addCriterion("size12 not between", value1, value2, "size12");
            return (Criteria) this;
        }

        public Criteria andSize15IsNull() {
            addCriterion("size15 is null");
            return (Criteria) this;
        }

        public Criteria andSize15IsNotNull() {
            addCriterion("size15 is not null");
            return (Criteria) this;
        }

        public Criteria andSize15EqualTo(Integer value) {
            addCriterion("size15 =", value, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15NotEqualTo(Integer value) {
            addCriterion("size15 <>", value, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15GreaterThan(Integer value) {
            addCriterion("size15 >", value, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15GreaterThanOrEqualTo(Integer value) {
            addCriterion("size15 >=", value, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15LessThan(Integer value) {
            addCriterion("size15 <", value, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15LessThanOrEqualTo(Integer value) {
            addCriterion("size15 <=", value, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15In(List<Integer> values) {
            addCriterion("size15 in", values, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15NotIn(List<Integer> values) {
            addCriterion("size15 not in", values, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15Between(Integer value1, Integer value2) {
            addCriterion("size15 between", value1, value2, "size15");
            return (Criteria) this;
        }

        public Criteria andSize15NotBetween(Integer value1, Integer value2) {
            addCriterion("size15 not between", value1, value2, "size15");
            return (Criteria) this;
        }

        public Criteria andSize18IsNull() {
            addCriterion("size18 is null");
            return (Criteria) this;
        }

        public Criteria andSize18IsNotNull() {
            addCriterion("size18 is not null");
            return (Criteria) this;
        }

        public Criteria andSize18EqualTo(Integer value) {
            addCriterion("size18 =", value, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18NotEqualTo(Integer value) {
            addCriterion("size18 <>", value, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18GreaterThan(Integer value) {
            addCriterion("size18 >", value, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18GreaterThanOrEqualTo(Integer value) {
            addCriterion("size18 >=", value, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18LessThan(Integer value) {
            addCriterion("size18 <", value, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18LessThanOrEqualTo(Integer value) {
            addCriterion("size18 <=", value, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18In(List<Integer> values) {
            addCriterion("size18 in", values, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18NotIn(List<Integer> values) {
            addCriterion("size18 not in", values, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18Between(Integer value1, Integer value2) {
            addCriterion("size18 between", value1, value2, "size18");
            return (Criteria) this;
        }

        public Criteria andSize18NotBetween(Integer value1, Integer value2) {
            addCriterion("size18 not between", value1, value2, "size18");
            return (Criteria) this;
        }

        public Criteria andSize20IsNull() {
            addCriterion("size20 is null");
            return (Criteria) this;
        }

        public Criteria andSize20IsNotNull() {
            addCriterion("size20 is not null");
            return (Criteria) this;
        }

        public Criteria andSize20EqualTo(Integer value) {
            addCriterion("size20 =", value, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20NotEqualTo(Integer value) {
            addCriterion("size20 <>", value, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20GreaterThan(Integer value) {
            addCriterion("size20 >", value, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20GreaterThanOrEqualTo(Integer value) {
            addCriterion("size20 >=", value, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20LessThan(Integer value) {
            addCriterion("size20 <", value, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20LessThanOrEqualTo(Integer value) {
            addCriterion("size20 <=", value, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20In(List<Integer> values) {
            addCriterion("size20 in", values, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20NotIn(List<Integer> values) {
            addCriterion("size20 not in", values, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20Between(Integer value1, Integer value2) {
            addCriterion("size20 between", value1, value2, "size20");
            return (Criteria) this;
        }

        public Criteria andSize20NotBetween(Integer value1, Integer value2) {
            addCriterion("size20 not between", value1, value2, "size20");
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

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
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