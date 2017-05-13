package com.tongxuweb.domain.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderItemExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderItemExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeIsNull() {
            addCriterion("sku_text_size is null");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeIsNotNull() {
            addCriterion("sku_text_size is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeEqualTo(String value) {
            addCriterion("sku_text_size =", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeNotEqualTo(String value) {
            addCriterion("sku_text_size <>", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeGreaterThan(String value) {
            addCriterion("sku_text_size >", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_text_size >=", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeLessThan(String value) {
            addCriterion("sku_text_size <", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeLessThanOrEqualTo(String value) {
            addCriterion("sku_text_size <=", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeLike(String value) {
            addCriterion("sku_text_size like", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeNotLike(String value) {
            addCriterion("sku_text_size not like", value, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeIn(List<String> values) {
            addCriterion("sku_text_size in", values, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeNotIn(List<String> values) {
            addCriterion("sku_text_size not in", values, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeBetween(String value1, String value2) {
            addCriterion("sku_text_size between", value1, value2, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextSizeNotBetween(String value1, String value2) {
            addCriterion("sku_text_size not between", value1, value2, "skuTextSize");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourIsNull() {
            addCriterion("sku_text_colour is null");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourIsNotNull() {
            addCriterion("sku_text_colour is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourEqualTo(String value) {
            addCriterion("sku_text_colour =", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourNotEqualTo(String value) {
            addCriterion("sku_text_colour <>", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourGreaterThan(String value) {
            addCriterion("sku_text_colour >", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourGreaterThanOrEqualTo(String value) {
            addCriterion("sku_text_colour >=", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourLessThan(String value) {
            addCriterion("sku_text_colour <", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourLessThanOrEqualTo(String value) {
            addCriterion("sku_text_colour <=", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourLike(String value) {
            addCriterion("sku_text_colour like", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourNotLike(String value) {
            addCriterion("sku_text_colour not like", value, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourIn(List<String> values) {
            addCriterion("sku_text_colour in", values, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourNotIn(List<String> values) {
            addCriterion("sku_text_colour not in", values, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourBetween(String value1, String value2) {
            addCriterion("sku_text_colour between", value1, value2, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andSkuTextColourNotBetween(String value1, String value2) {
            addCriterion("sku_text_colour not between", value1, value2, "skuTextColour");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoIsNull() {
            addCriterion("item_jinhuo is null");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoIsNotNull() {
            addCriterion("item_jinhuo is not null");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoEqualTo(BigDecimal value) {
            addCriterion("item_jinhuo =", value, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoNotEqualTo(BigDecimal value) {
            addCriterion("item_jinhuo <>", value, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoGreaterThan(BigDecimal value) {
            addCriterion("item_jinhuo >", value, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_jinhuo >=", value, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoLessThan(BigDecimal value) {
            addCriterion("item_jinhuo <", value, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_jinhuo <=", value, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoIn(List<BigDecimal> values) {
            addCriterion("item_jinhuo in", values, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoNotIn(List<BigDecimal> values) {
            addCriterion("item_jinhuo not in", values, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_jinhuo between", value1, value2, "itemJinhuo");
            return (Criteria) this;
        }

        public Criteria andItemJinhuoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_jinhuo not between", value1, value2, "itemJinhuo");
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