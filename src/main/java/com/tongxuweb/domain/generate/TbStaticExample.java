package com.tongxuweb.domain.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbStaticExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStaticExample() {
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

        public Criteria andPayNumIsNull() {
            addCriterion("pay_num is null");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNotNull() {
            addCriterion("pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumEqualTo(Integer value) {
            addCriterion("pay_num =", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotEqualTo(Integer value) {
            addCriterion("pay_num <>", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThan(Integer value) {
            addCriterion("pay_num >", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_num >=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThan(Integer value) {
            addCriterion("pay_num <", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("pay_num <=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumIn(List<Integer> values) {
            addCriterion("pay_num in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotIn(List<Integer> values) {
            addCriterion("pay_num not in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumBetween(Integer value1, Integer value2) {
            addCriterion("pay_num between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_num not between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayItemsIsNull() {
            addCriterion("pay_items is null");
            return (Criteria) this;
        }

        public Criteria andPayItemsIsNotNull() {
            addCriterion("pay_items is not null");
            return (Criteria) this;
        }

        public Criteria andPayItemsEqualTo(Integer value) {
            addCriterion("pay_items =", value, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsNotEqualTo(Integer value) {
            addCriterion("pay_items <>", value, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsGreaterThan(Integer value) {
            addCriterion("pay_items >", value, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_items >=", value, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsLessThan(Integer value) {
            addCriterion("pay_items <", value, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsLessThanOrEqualTo(Integer value) {
            addCriterion("pay_items <=", value, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsIn(List<Integer> values) {
            addCriterion("pay_items in", values, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsNotIn(List<Integer> values) {
            addCriterion("pay_items not in", values, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsBetween(Integer value1, Integer value2) {
            addCriterion("pay_items between", value1, value2, "payItems");
            return (Criteria) this;
        }

        public Criteria andPayItemsNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_items not between", value1, value2, "payItems");
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

        public Criteria andPayinfoActualfeeEqualTo(BigDecimal value) {
            addCriterion("payinfo_actualfee =", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeNotEqualTo(BigDecimal value) {
            addCriterion("payinfo_actualfee <>", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeGreaterThan(BigDecimal value) {
            addCriterion("payinfo_actualfee >", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payinfo_actualfee >=", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeLessThan(BigDecimal value) {
            addCriterion("payinfo_actualfee <", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payinfo_actualfee <=", value, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeIn(List<BigDecimal> values) {
            addCriterion("payinfo_actualfee in", values, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeNotIn(List<BigDecimal> values) {
            addCriterion("payinfo_actualfee not in", values, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payinfo_actualfee between", value1, value2, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andPayinfoActualfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payinfo_actualfee not between", value1, value2, "payinfoActualfee");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyIsNull() {
            addCriterion("final_money is null");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyIsNotNull() {
            addCriterion("final_money is not null");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyEqualTo(BigDecimal value) {
            addCriterion("final_money =", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("final_money <>", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyGreaterThan(BigDecimal value) {
            addCriterion("final_money >", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_money >=", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyLessThan(BigDecimal value) {
            addCriterion("final_money <", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_money <=", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyIn(List<BigDecimal> values) {
            addCriterion("final_money in", values, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("final_money not in", values, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_money between", value1, value2, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_money not between", value1, value2, "finalMoney");
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