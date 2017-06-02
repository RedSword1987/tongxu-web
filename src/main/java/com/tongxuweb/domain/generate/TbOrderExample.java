package com.tongxuweb.domain.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andBuyerVirtualPhoneIsNull() {
            addCriterion("buyer_virtual_phone is null");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneIsNotNull() {
            addCriterion("buyer_virtual_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneEqualTo(String value) {
            addCriterion("buyer_virtual_phone =", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneNotEqualTo(String value) {
            addCriterion("buyer_virtual_phone <>", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneGreaterThan(String value) {
            addCriterion("buyer_virtual_phone >", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_virtual_phone >=", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneLessThan(String value) {
            addCriterion("buyer_virtual_phone <", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneLessThanOrEqualTo(String value) {
            addCriterion("buyer_virtual_phone <=", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneLike(String value) {
            addCriterion("buyer_virtual_phone like", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneNotLike(String value) {
            addCriterion("buyer_virtual_phone not like", value, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneIn(List<String> values) {
            addCriterion("buyer_virtual_phone in", values, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneNotIn(List<String> values) {
            addCriterion("buyer_virtual_phone not in", values, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneBetween(String value1, String value2) {
            addCriterion("buyer_virtual_phone between", value1, value2, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerVirtualPhoneNotBetween(String value1, String value2) {
            addCriterion("buyer_virtual_phone not between", value1, value2, "buyerVirtualPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceIsNull() {
            addCriterion("buyer_provice is null");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceIsNotNull() {
            addCriterion("buyer_provice is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceEqualTo(String value) {
            addCriterion("buyer_provice =", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceNotEqualTo(String value) {
            addCriterion("buyer_provice <>", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceGreaterThan(String value) {
            addCriterion("buyer_provice >", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_provice >=", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceLessThan(String value) {
            addCriterion("buyer_provice <", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceLessThanOrEqualTo(String value) {
            addCriterion("buyer_provice <=", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceLike(String value) {
            addCriterion("buyer_provice like", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceNotLike(String value) {
            addCriterion("buyer_provice not like", value, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceIn(List<String> values) {
            addCriterion("buyer_provice in", values, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceNotIn(List<String> values) {
            addCriterion("buyer_provice not in", values, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceBetween(String value1, String value2) {
            addCriterion("buyer_provice between", value1, value2, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerProviceNotBetween(String value1, String value2) {
            addCriterion("buyer_provice not between", value1, value2, "buyerProvice");
            return (Criteria) this;
        }

        public Criteria andBuyerCityIsNull() {
            addCriterion("buyer_city is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCityIsNotNull() {
            addCriterion("buyer_city is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCityEqualTo(String value) {
            addCriterion("buyer_city =", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityNotEqualTo(String value) {
            addCriterion("buyer_city <>", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityGreaterThan(String value) {
            addCriterion("buyer_city >", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_city >=", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityLessThan(String value) {
            addCriterion("buyer_city <", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityLessThanOrEqualTo(String value) {
            addCriterion("buyer_city <=", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityLike(String value) {
            addCriterion("buyer_city like", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityNotLike(String value) {
            addCriterion("buyer_city not like", value, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityIn(List<String> values) {
            addCriterion("buyer_city in", values, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityNotIn(List<String> values) {
            addCriterion("buyer_city not in", values, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityBetween(String value1, String value2) {
            addCriterion("buyer_city between", value1, value2, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerCityNotBetween(String value1, String value2) {
            addCriterion("buyer_city not between", value1, value2, "buyerCity");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaIsNull() {
            addCriterion("buyer_area is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaIsNotNull() {
            addCriterion("buyer_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaEqualTo(String value) {
            addCriterion("buyer_area =", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaNotEqualTo(String value) {
            addCriterion("buyer_area <>", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaGreaterThan(String value) {
            addCriterion("buyer_area >", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_area >=", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaLessThan(String value) {
            addCriterion("buyer_area <", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaLessThanOrEqualTo(String value) {
            addCriterion("buyer_area <=", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaLike(String value) {
            addCriterion("buyer_area like", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaNotLike(String value) {
            addCriterion("buyer_area not like", value, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaIn(List<String> values) {
            addCriterion("buyer_area in", values, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaNotIn(List<String> values) {
            addCriterion("buyer_area not in", values, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaBetween(String value1, String value2) {
            addCriterion("buyer_area between", value1, value2, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerAreaNotBetween(String value1, String value2) {
            addCriterion("buyer_area not between", value1, value2, "buyerArea");
            return (Criteria) this;
        }

        public Criteria andBuyerPostIsNull() {
            addCriterion("buyer_post is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostIsNotNull() {
            addCriterion("buyer_post is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostEqualTo(String value) {
            addCriterion("buyer_post =", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostNotEqualTo(String value) {
            addCriterion("buyer_post <>", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostGreaterThan(String value) {
            addCriterion("buyer_post >", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_post >=", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostLessThan(String value) {
            addCriterion("buyer_post <", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostLessThanOrEqualTo(String value) {
            addCriterion("buyer_post <=", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostLike(String value) {
            addCriterion("buyer_post like", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostNotLike(String value) {
            addCriterion("buyer_post not like", value, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostIn(List<String> values) {
            addCriterion("buyer_post in", values, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostNotIn(List<String> values) {
            addCriterion("buyer_post not in", values, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostBetween(String value1, String value2) {
            addCriterion("buyer_post between", value1, value2, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerPostNotBetween(String value1, String value2) {
            addCriterion("buyer_post not between", value1, value2, "buyerPost");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("buyer_address is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("buyer_address is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("buyer_address =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("buyer_address <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("buyer_address >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_address >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("buyer_address <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("buyer_address <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("buyer_address like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("buyer_address not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("buyer_address in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("buyer_address not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("buyer_address between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("buyer_address not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneIsNull() {
            addCriterion("buyer_logistics_phone is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneIsNotNull() {
            addCriterion("buyer_logistics_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneEqualTo(String value) {
            addCriterion("buyer_logistics_phone =", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneNotEqualTo(String value) {
            addCriterion("buyer_logistics_phone <>", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneGreaterThan(String value) {
            addCriterion("buyer_logistics_phone >", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_logistics_phone >=", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneLessThan(String value) {
            addCriterion("buyer_logistics_phone <", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneLessThanOrEqualTo(String value) {
            addCriterion("buyer_logistics_phone <=", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneLike(String value) {
            addCriterion("buyer_logistics_phone like", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneNotLike(String value) {
            addCriterion("buyer_logistics_phone not like", value, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneIn(List<String> values) {
            addCriterion("buyer_logistics_phone in", values, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneNotIn(List<String> values) {
            addCriterion("buyer_logistics_phone not in", values, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneBetween(String value1, String value2) {
            addCriterion("buyer_logistics_phone between", value1, value2, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerLogisticsPhoneNotBetween(String value1, String value2) {
            addCriterion("buyer_logistics_phone not between", value1, value2, "buyerLogisticsPhone");
            return (Criteria) this;
        }

        public Criteria andBuyMessageIsNull() {
            addCriterion("buy_message is null");
            return (Criteria) this;
        }

        public Criteria andBuyMessageIsNotNull() {
            addCriterion("buy_message is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMessageEqualTo(String value) {
            addCriterion("buy_message =", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotEqualTo(String value) {
            addCriterion("buy_message <>", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageGreaterThan(String value) {
            addCriterion("buy_message >", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageGreaterThanOrEqualTo(String value) {
            addCriterion("buy_message >=", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageLessThan(String value) {
            addCriterion("buy_message <", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageLessThanOrEqualTo(String value) {
            addCriterion("buy_message <=", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageLike(String value) {
            addCriterion("buy_message like", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotLike(String value) {
            addCriterion("buy_message not like", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageIn(List<String> values) {
            addCriterion("buy_message in", values, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotIn(List<String> values) {
            addCriterion("buy_message not in", values, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageBetween(String value1, String value2) {
            addCriterion("buy_message between", value1, value2, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotBetween(String value1, String value2) {
            addCriterion("buy_message not between", value1, value2, "buyMessage");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("pay_time like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("pay_time not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(String value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(String value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(String value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(String value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(String value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLike(String value) {
            addCriterion("send_time like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotLike(String value) {
            addCriterion("send_time not like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<String> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<String> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(String value1, String value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(String value1, String value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIsNull() {
            addCriterion("alipay_id is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIsNotNull() {
            addCriterion("alipay_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayIdEqualTo(String value) {
            addCriterion("alipay_id =", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotEqualTo(String value) {
            addCriterion("alipay_id <>", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdGreaterThan(String value) {
            addCriterion("alipay_id >", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_id >=", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLessThan(String value) {
            addCriterion("alipay_id <", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLessThanOrEqualTo(String value) {
            addCriterion("alipay_id <=", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLike(String value) {
            addCriterion("alipay_id like", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotLike(String value) {
            addCriterion("alipay_id not like", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIn(List<String> values) {
            addCriterion("alipay_id in", values, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotIn(List<String> values) {
            addCriterion("alipay_id not in", values, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdBetween(String value1, String value2) {
            addCriterion("alipay_id between", value1, value2, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotBetween(String value1, String value2) {
            addCriterion("alipay_id not between", value1, value2, "alipayId");
            return (Criteria) this;
        }

        public Criteria andOrderBarIsNull() {
            addCriterion("order_bar is null");
            return (Criteria) this;
        }

        public Criteria andOrderBarIsNotNull() {
            addCriterion("order_bar is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBarEqualTo(String value) {
            addCriterion("order_bar =", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarNotEqualTo(String value) {
            addCriterion("order_bar <>", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarGreaterThan(String value) {
            addCriterion("order_bar >", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarGreaterThanOrEqualTo(String value) {
            addCriterion("order_bar >=", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarLessThan(String value) {
            addCriterion("order_bar <", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarLessThanOrEqualTo(String value) {
            addCriterion("order_bar <=", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarLike(String value) {
            addCriterion("order_bar like", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarNotLike(String value) {
            addCriterion("order_bar not like", value, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarIn(List<String> values) {
            addCriterion("order_bar in", values, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarNotIn(List<String> values) {
            addCriterion("order_bar not in", values, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarBetween(String value1, String value2) {
            addCriterion("order_bar between", value1, value2, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarNotBetween(String value1, String value2) {
            addCriterion("order_bar not between", value1, value2, "orderBar");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextIsNull() {
            addCriterion("order_bar_text is null");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextIsNotNull() {
            addCriterion("order_bar_text is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextEqualTo(String value) {
            addCriterion("order_bar_text =", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextNotEqualTo(String value) {
            addCriterion("order_bar_text <>", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextGreaterThan(String value) {
            addCriterion("order_bar_text >", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextGreaterThanOrEqualTo(String value) {
            addCriterion("order_bar_text >=", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextLessThan(String value) {
            addCriterion("order_bar_text <", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextLessThanOrEqualTo(String value) {
            addCriterion("order_bar_text <=", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextLike(String value) {
            addCriterion("order_bar_text like", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextNotLike(String value) {
            addCriterion("order_bar_text not like", value, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextIn(List<String> values) {
            addCriterion("order_bar_text in", values, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextNotIn(List<String> values) {
            addCriterion("order_bar_text not in", values, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextBetween(String value1, String value2) {
            addCriterion("order_bar_text between", value1, value2, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andOrderBarTextNotBetween(String value1, String value2) {
            addCriterion("order_bar_text not between", value1, value2, "orderBarText");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIsNull() {
            addCriterion("logistics_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIsNotNull() {
            addCriterion("logistics_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameEqualTo(String value) {
            addCriterion("logistics_name =", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotEqualTo(String value) {
            addCriterion("logistics_name <>", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameGreaterThan(String value) {
            addCriterion("logistics_name >", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_name >=", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLessThan(String value) {
            addCriterion("logistics_name <", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_name <=", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameLike(String value) {
            addCriterion("logistics_name like", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotLike(String value) {
            addCriterion("logistics_name not like", value, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameIn(List<String> values) {
            addCriterion("logistics_name in", values, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotIn(List<String> values) {
            addCriterion("logistics_name not in", values, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameBetween(String value1, String value2) {
            addCriterion("logistics_name between", value1, value2, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNameNotBetween(String value1, String value2) {
            addCriterion("logistics_name not between", value1, value2, "logisticsName");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNull() {
            addCriterion("logistics_num is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNotNull() {
            addCriterion("logistics_num is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumEqualTo(String value) {
            addCriterion("logistics_num =", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotEqualTo(String value) {
            addCriterion("logistics_num <>", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThan(String value) {
            addCriterion("logistics_num >", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_num >=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThan(String value) {
            addCriterion("logistics_num <", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThanOrEqualTo(String value) {
            addCriterion("logistics_num <=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLike(String value) {
            addCriterion("logistics_num like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotLike(String value) {
            addCriterion("logistics_num not like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIn(List<String> values) {
            addCriterion("logistics_num in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotIn(List<String> values) {
            addCriterion("logistics_num not in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumBetween(String value1, String value2) {
            addCriterion("logistics_num between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotBetween(String value1, String value2) {
            addCriterion("logistics_num not between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoIsNull() {
            addCriterion("logistics_num_taobao is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoIsNotNull() {
            addCriterion("logistics_num_taobao is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoEqualTo(String value) {
            addCriterion("logistics_num_taobao =", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoNotEqualTo(String value) {
            addCriterion("logistics_num_taobao <>", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoGreaterThan(String value) {
            addCriterion("logistics_num_taobao >", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_num_taobao >=", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoLessThan(String value) {
            addCriterion("logistics_num_taobao <", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoLessThanOrEqualTo(String value) {
            addCriterion("logistics_num_taobao <=", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoLike(String value) {
            addCriterion("logistics_num_taobao like", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoNotLike(String value) {
            addCriterion("logistics_num_taobao not like", value, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoIn(List<String> values) {
            addCriterion("logistics_num_taobao in", values, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoNotIn(List<String> values) {
            addCriterion("logistics_num_taobao not in", values, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoBetween(String value1, String value2) {
            addCriterion("logistics_num_taobao between", value1, value2, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumTaobaoNotBetween(String value1, String value2) {
            addCriterion("logistics_num_taobao not between", value1, value2, "logisticsNumTaobao");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescIsNull() {
            addCriterion("logistics_last_desc is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescIsNotNull() {
            addCriterion("logistics_last_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescEqualTo(String value) {
            addCriterion("logistics_last_desc =", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescNotEqualTo(String value) {
            addCriterion("logistics_last_desc <>", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescGreaterThan(String value) {
            addCriterion("logistics_last_desc >", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_last_desc >=", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescLessThan(String value) {
            addCriterion("logistics_last_desc <", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescLessThanOrEqualTo(String value) {
            addCriterion("logistics_last_desc <=", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescLike(String value) {
            addCriterion("logistics_last_desc like", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescNotLike(String value) {
            addCriterion("logistics_last_desc not like", value, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescIn(List<String> values) {
            addCriterion("logistics_last_desc in", values, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescNotIn(List<String> values) {
            addCriterion("logistics_last_desc not in", values, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescBetween(String value1, String value2) {
            addCriterion("logistics_last_desc between", value1, value2, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andLogisticsLastDescNotBetween(String value1, String value2) {
            addCriterion("logistics_last_desc not between", value1, value2, "logisticsLastDesc");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinIsNull() {
            addCriterion("money_yunyin_yongjin is null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinIsNotNull() {
            addCriterion("money_yunyin_yongjin is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_yongjin =", value, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinNotEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_yongjin <>", value, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinGreaterThan(BigDecimal value) {
            addCriterion("money_yunyin_yongjin >", value, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_yongjin >=", value, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinLessThan(BigDecimal value) {
            addCriterion("money_yunyin_yongjin <", value, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_yongjin <=", value, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_yongjin in", values, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinNotIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_yongjin not in", values, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_yongjin between", value1, value2, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYongjinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_yongjin not between", value1, value2, "moneyYunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiIsNull() {
            addCriterion("money_yunyin_fuwufei is null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiIsNotNull() {
            addCriterion("money_yunyin_fuwufei is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_fuwufei =", value, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiNotEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_fuwufei <>", value, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiGreaterThan(BigDecimal value) {
            addCriterion("money_yunyin_fuwufei >", value, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_fuwufei >=", value, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiLessThan(BigDecimal value) {
            addCriterion("money_yunyin_fuwufei <", value, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_fuwufei <=", value, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_fuwufei in", values, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiNotIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_fuwufei not in", values, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_fuwufei between", value1, value2, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinFuwufeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_fuwufei not between", value1, value2, "moneyYunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianIsNull() {
            addCriterion("money_yunyin_koudian is null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianIsNotNull() {
            addCriterion("money_yunyin_koudian is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_koudian =", value, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianNotEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_koudian <>", value, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianGreaterThan(BigDecimal value) {
            addCriterion("money_yunyin_koudian >", value, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_koudian >=", value, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianLessThan(BigDecimal value) {
            addCriterion("money_yunyin_koudian <", value, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_koudian <=", value, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_koudian in", values, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianNotIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_koudian not in", values, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_koudian between", value1, value2, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinKoudianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_koudian not between", value1, value2, "moneyYunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanIsNull() {
            addCriterion("money_yunyin_youhuiquan is null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanIsNotNull() {
            addCriterion("money_yunyin_youhuiquan is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_youhuiquan =", value, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanNotEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_youhuiquan <>", value, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanGreaterThan(BigDecimal value) {
            addCriterion("money_yunyin_youhuiquan >", value, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_youhuiquan >=", value, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanLessThan(BigDecimal value) {
            addCriterion("money_yunyin_youhuiquan <", value, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_youhuiquan <=", value, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_youhuiquan in", values, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanNotIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_youhuiquan not in", values, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_youhuiquan between", value1, value2, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinYouhuiquanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_youhuiquan not between", value1, value2, "moneyYunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuIsNull() {
            addCriterion("money_yunyin_teshu is null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuIsNotNull() {
            addCriterion("money_yunyin_teshu is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_teshu =", value, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuNotEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_teshu <>", value, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuGreaterThan(BigDecimal value) {
            addCriterion("money_yunyin_teshu >", value, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_teshu >=", value, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuLessThan(BigDecimal value) {
            addCriterion("money_yunyin_teshu <", value, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_yunyin_teshu <=", value, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_teshu in", values, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuNotIn(List<BigDecimal> values) {
            addCriterion("money_yunyin_teshu not in", values, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_teshu between", value1, value2, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyYunyinTeshuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_yunyin_teshu not between", value1, value2, "moneyYunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiIsNull() {
            addCriterion("money_wuliu_kuaidi is null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiIsNotNull() {
            addCriterion("money_wuliu_kuaidi is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_kuaidi =", value, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiNotEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_kuaidi <>", value, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiGreaterThan(BigDecimal value) {
            addCriterion("money_wuliu_kuaidi >", value, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_kuaidi >=", value, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiLessThan(BigDecimal value) {
            addCriterion("money_wuliu_kuaidi <", value, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_kuaidi <=", value, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_kuaidi in", values, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiNotIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_kuaidi not in", values, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_kuaidi between", value1, value2, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuKuaidiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_kuaidi not between", value1, value2, "moneyWuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuIsNull() {
            addCriterion("money_wuliu_changku is null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuIsNotNull() {
            addCriterion("money_wuliu_changku is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_changku =", value, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuNotEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_changku <>", value, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuGreaterThan(BigDecimal value) {
            addCriterion("money_wuliu_changku >", value, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_changku >=", value, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuLessThan(BigDecimal value) {
            addCriterion("money_wuliu_changku <", value, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_changku <=", value, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_changku in", values, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuNotIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_changku not in", values, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_changku between", value1, value2, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuChangkuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_changku not between", value1, value2, "moneyWuliuChangku");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangIsNull() {
            addCriterion("money_wuliu_baozhuang is null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangIsNotNull() {
            addCriterion("money_wuliu_baozhuang is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_baozhuang =", value, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangNotEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_baozhuang <>", value, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangGreaterThan(BigDecimal value) {
            addCriterion("money_wuliu_baozhuang >", value, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_baozhuang >=", value, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangLessThan(BigDecimal value) {
            addCriterion("money_wuliu_baozhuang <", value, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_baozhuang <=", value, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_baozhuang in", values, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangNotIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_baozhuang not in", values, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_baozhuang between", value1, value2, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuBaozhuangNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_baozhuang not between", value1, value2, "moneyWuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianIsNull() {
            addCriterion("money_wuliu_yunfeixian is null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianIsNotNull() {
            addCriterion("money_wuliu_yunfeixian is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_yunfeixian =", value, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianNotEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_yunfeixian <>", value, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianGreaterThan(BigDecimal value) {
            addCriterion("money_wuliu_yunfeixian >", value, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_yunfeixian >=", value, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianLessThan(BigDecimal value) {
            addCriterion("money_wuliu_yunfeixian <", value, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_wuliu_yunfeixian <=", value, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_yunfeixian in", values, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianNotIn(List<BigDecimal> values) {
            addCriterion("money_wuliu_yunfeixian not in", values, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_yunfeixian between", value1, value2, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyWuliuYunfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_wuliu_yunfeixian not between", value1, value2, "moneyWuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyIsNull() {
            addCriterion("money_final_money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyIsNotNull() {
            addCriterion("money_final_money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyEqualTo(BigDecimal value) {
            addCriterion("money_final_money =", value, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money_final_money <>", value, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyGreaterThan(BigDecimal value) {
            addCriterion("money_final_money >", value, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_final_money >=", value, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyLessThan(BigDecimal value) {
            addCriterion("money_final_money <", value, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_final_money <=", value, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyIn(List<BigDecimal> values) {
            addCriterion("money_final_money in", values, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money_final_money not in", values, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_final_money between", value1, value2, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyFinalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_final_money not between", value1, value2, "moneyFinalMoney");
            return (Criteria) this;
        }

        public Criteria andTagInfoIsNull() {
            addCriterion("tag_info is null");
            return (Criteria) this;
        }

        public Criteria andTagInfoIsNotNull() {
            addCriterion("tag_info is not null");
            return (Criteria) this;
        }

        public Criteria andTagInfoEqualTo(String value) {
            addCriterion("tag_info =", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoNotEqualTo(String value) {
            addCriterion("tag_info <>", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoGreaterThan(String value) {
            addCriterion("tag_info >", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoGreaterThanOrEqualTo(String value) {
            addCriterion("tag_info >=", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoLessThan(String value) {
            addCriterion("tag_info <", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoLessThanOrEqualTo(String value) {
            addCriterion("tag_info <=", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoLike(String value) {
            addCriterion("tag_info like", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoNotLike(String value) {
            addCriterion("tag_info not like", value, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoIn(List<String> values) {
            addCriterion("tag_info in", values, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoNotIn(List<String> values) {
            addCriterion("tag_info not in", values, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoBetween(String value1, String value2) {
            addCriterion("tag_info between", value1, value2, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andTagInfoNotBetween(String value1, String value2) {
            addCriterion("tag_info not between", value1, value2, "tagInfo");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNull() {
            addCriterion("item_num is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion("item_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(Integer value) {
            addCriterion("item_num =", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(Integer value) {
            addCriterion("item_num <>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(Integer value) {
            addCriterion("item_num >", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_num >=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(Integer value) {
            addCriterion("item_num <", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(Integer value) {
            addCriterion("item_num <=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<Integer> values) {
            addCriterion("item_num in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<Integer> values) {
            addCriterion("item_num not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(Integer value1, Integer value2) {
            addCriterion("item_num between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("item_num not between", value1, value2, "itemNum");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andMoneyItemJinhuoIsNull() {
            addCriterion("money_item_jinhuo is null");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoIsNotNull() {
            addCriterion("money_item_jinhuo is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoEqualTo(BigDecimal value) {
            addCriterion("money_item_jinhuo =", value, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoNotEqualTo(BigDecimal value) {
            addCriterion("money_item_jinhuo <>", value, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoGreaterThan(BigDecimal value) {
            addCriterion("money_item_jinhuo >", value, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_item_jinhuo >=", value, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoLessThan(BigDecimal value) {
            addCriterion("money_item_jinhuo <", value, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_item_jinhuo <=", value, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoIn(List<BigDecimal> values) {
            addCriterion("money_item_jinhuo in", values, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoNotIn(List<BigDecimal> values) {
            addCriterion("money_item_jinhuo not in", values, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_item_jinhuo between", value1, value2, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemJinhuoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_item_jinhuo not between", value1, value2, "moneyItemJinhuo");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingIsNull() {
            addCriterion("money_item_zhenping is null");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingIsNotNull() {
            addCriterion("money_item_zhenping is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingEqualTo(BigDecimal value) {
            addCriterion("money_item_zhenping =", value, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingNotEqualTo(BigDecimal value) {
            addCriterion("money_item_zhenping <>", value, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingGreaterThan(BigDecimal value) {
            addCriterion("money_item_zhenping >", value, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_item_zhenping >=", value, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingLessThan(BigDecimal value) {
            addCriterion("money_item_zhenping <", value, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_item_zhenping <=", value, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingIn(List<BigDecimal> values) {
            addCriterion("money_item_zhenping in", values, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingNotIn(List<BigDecimal> values) {
            addCriterion("money_item_zhenping not in", values, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_item_zhenping between", value1, value2, "moneyItemZhenping");
            return (Criteria) this;
        }

        public Criteria andMoneyItemZhenpingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_item_zhenping not between", value1, value2, "moneyItemZhenping");
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
    }
}