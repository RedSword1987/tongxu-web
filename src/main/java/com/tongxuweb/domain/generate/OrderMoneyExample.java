package com.tongxuweb.domain.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderMoneyExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderMoneyExample() {
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

        public Criteria andItemZhenpingIsNull() {
            addCriterion("item_zhenping is null");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingIsNotNull() {
            addCriterion("item_zhenping is not null");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingEqualTo(BigDecimal value) {
            addCriterion("item_zhenping =", value, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingNotEqualTo(BigDecimal value) {
            addCriterion("item_zhenping <>", value, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingGreaterThan(BigDecimal value) {
            addCriterion("item_zhenping >", value, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_zhenping >=", value, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingLessThan(BigDecimal value) {
            addCriterion("item_zhenping <", value, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_zhenping <=", value, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingIn(List<BigDecimal> values) {
            addCriterion("item_zhenping in", values, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingNotIn(List<BigDecimal> values) {
            addCriterion("item_zhenping not in", values, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_zhenping between", value1, value2, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andItemZhenpingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_zhenping not between", value1, value2, "itemZhenping");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinIsNull() {
            addCriterion("yunyin_yongjin is null");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinIsNotNull() {
            addCriterion("yunyin_yongjin is not null");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinEqualTo(BigDecimal value) {
            addCriterion("yunyin_yongjin =", value, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinNotEqualTo(BigDecimal value) {
            addCriterion("yunyin_yongjin <>", value, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinGreaterThan(BigDecimal value) {
            addCriterion("yunyin_yongjin >", value, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_yongjin >=", value, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinLessThan(BigDecimal value) {
            addCriterion("yunyin_yongjin <", value, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_yongjin <=", value, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinIn(List<BigDecimal> values) {
            addCriterion("yunyin_yongjin in", values, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinNotIn(List<BigDecimal> values) {
            addCriterion("yunyin_yongjin not in", values, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_yongjin between", value1, value2, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinYongjinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_yongjin not between", value1, value2, "yunyinYongjin");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiIsNull() {
            addCriterion("yunyin_fuwufei is null");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiIsNotNull() {
            addCriterion("yunyin_fuwufei is not null");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiEqualTo(BigDecimal value) {
            addCriterion("yunyin_fuwufei =", value, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiNotEqualTo(BigDecimal value) {
            addCriterion("yunyin_fuwufei <>", value, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiGreaterThan(BigDecimal value) {
            addCriterion("yunyin_fuwufei >", value, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_fuwufei >=", value, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiLessThan(BigDecimal value) {
            addCriterion("yunyin_fuwufei <", value, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_fuwufei <=", value, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiIn(List<BigDecimal> values) {
            addCriterion("yunyin_fuwufei in", values, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiNotIn(List<BigDecimal> values) {
            addCriterion("yunyin_fuwufei not in", values, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_fuwufei between", value1, value2, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinFuwufeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_fuwufei not between", value1, value2, "yunyinFuwufei");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianIsNull() {
            addCriterion("yunyin_koudian is null");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianIsNotNull() {
            addCriterion("yunyin_koudian is not null");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianEqualTo(BigDecimal value) {
            addCriterion("yunyin_koudian =", value, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianNotEqualTo(BigDecimal value) {
            addCriterion("yunyin_koudian <>", value, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianGreaterThan(BigDecimal value) {
            addCriterion("yunyin_koudian >", value, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_koudian >=", value, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianLessThan(BigDecimal value) {
            addCriterion("yunyin_koudian <", value, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_koudian <=", value, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianIn(List<BigDecimal> values) {
            addCriterion("yunyin_koudian in", values, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianNotIn(List<BigDecimal> values) {
            addCriterion("yunyin_koudian not in", values, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_koudian between", value1, value2, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinKoudianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_koudian not between", value1, value2, "yunyinKoudian");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanIsNull() {
            addCriterion("yunyin_youhuiquan is null");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanIsNotNull() {
            addCriterion("yunyin_youhuiquan is not null");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanEqualTo(BigDecimal value) {
            addCriterion("yunyin_youhuiquan =", value, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanNotEqualTo(BigDecimal value) {
            addCriterion("yunyin_youhuiquan <>", value, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanGreaterThan(BigDecimal value) {
            addCriterion("yunyin_youhuiquan >", value, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_youhuiquan >=", value, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanLessThan(BigDecimal value) {
            addCriterion("yunyin_youhuiquan <", value, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_youhuiquan <=", value, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanIn(List<BigDecimal> values) {
            addCriterion("yunyin_youhuiquan in", values, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanNotIn(List<BigDecimal> values) {
            addCriterion("yunyin_youhuiquan not in", values, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_youhuiquan between", value1, value2, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinYouhuiquanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_youhuiquan not between", value1, value2, "yunyinYouhuiquan");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuIsNull() {
            addCriterion("yunyin_teshu is null");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuIsNotNull() {
            addCriterion("yunyin_teshu is not null");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuEqualTo(BigDecimal value) {
            addCriterion("yunyin_teshu =", value, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuNotEqualTo(BigDecimal value) {
            addCriterion("yunyin_teshu <>", value, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuGreaterThan(BigDecimal value) {
            addCriterion("yunyin_teshu >", value, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_teshu >=", value, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuLessThan(BigDecimal value) {
            addCriterion("yunyin_teshu <", value, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yunyin_teshu <=", value, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuIn(List<BigDecimal> values) {
            addCriterion("yunyin_teshu in", values, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuNotIn(List<BigDecimal> values) {
            addCriterion("yunyin_teshu not in", values, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_teshu between", value1, value2, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andYunyinTeshuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yunyin_teshu not between", value1, value2, "yunyinTeshu");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiIsNull() {
            addCriterion("wuliu_kuaidi is null");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiIsNotNull() {
            addCriterion("wuliu_kuaidi is not null");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiEqualTo(BigDecimal value) {
            addCriterion("wuliu_kuaidi =", value, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiNotEqualTo(BigDecimal value) {
            addCriterion("wuliu_kuaidi <>", value, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiGreaterThan(BigDecimal value) {
            addCriterion("wuliu_kuaidi >", value, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_kuaidi >=", value, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiLessThan(BigDecimal value) {
            addCriterion("wuliu_kuaidi <", value, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_kuaidi <=", value, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiIn(List<BigDecimal> values) {
            addCriterion("wuliu_kuaidi in", values, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiNotIn(List<BigDecimal> values) {
            addCriterion("wuliu_kuaidi not in", values, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_kuaidi between", value1, value2, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuKuaidiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_kuaidi not between", value1, value2, "wuliuKuaidi");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuIsNull() {
            addCriterion("wuliu_changku is null");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuIsNotNull() {
            addCriterion("wuliu_changku is not null");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuEqualTo(BigDecimal value) {
            addCriterion("wuliu_changku =", value, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuNotEqualTo(BigDecimal value) {
            addCriterion("wuliu_changku <>", value, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuGreaterThan(BigDecimal value) {
            addCriterion("wuliu_changku >", value, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_changku >=", value, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuLessThan(BigDecimal value) {
            addCriterion("wuliu_changku <", value, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_changku <=", value, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuIn(List<BigDecimal> values) {
            addCriterion("wuliu_changku in", values, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuNotIn(List<BigDecimal> values) {
            addCriterion("wuliu_changku not in", values, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_changku between", value1, value2, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuChangkuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_changku not between", value1, value2, "wuliuChangku");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangIsNull() {
            addCriterion("wuliu_baozhuang is null");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangIsNotNull() {
            addCriterion("wuliu_baozhuang is not null");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangEqualTo(BigDecimal value) {
            addCriterion("wuliu_baozhuang =", value, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangNotEqualTo(BigDecimal value) {
            addCriterion("wuliu_baozhuang <>", value, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangGreaterThan(BigDecimal value) {
            addCriterion("wuliu_baozhuang >", value, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_baozhuang >=", value, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangLessThan(BigDecimal value) {
            addCriterion("wuliu_baozhuang <", value, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_baozhuang <=", value, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangIn(List<BigDecimal> values) {
            addCriterion("wuliu_baozhuang in", values, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangNotIn(List<BigDecimal> values) {
            addCriterion("wuliu_baozhuang not in", values, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_baozhuang between", value1, value2, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuBaozhuangNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_baozhuang not between", value1, value2, "wuliuBaozhuang");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianIsNull() {
            addCriterion("wuliu_yunfeixian is null");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianIsNotNull() {
            addCriterion("wuliu_yunfeixian is not null");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianEqualTo(BigDecimal value) {
            addCriterion("wuliu_yunfeixian =", value, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianNotEqualTo(BigDecimal value) {
            addCriterion("wuliu_yunfeixian <>", value, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianGreaterThan(BigDecimal value) {
            addCriterion("wuliu_yunfeixian >", value, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_yunfeixian >=", value, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianLessThan(BigDecimal value) {
            addCriterion("wuliu_yunfeixian <", value, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wuliu_yunfeixian <=", value, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianIn(List<BigDecimal> values) {
            addCriterion("wuliu_yunfeixian in", values, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianNotIn(List<BigDecimal> values) {
            addCriterion("wuliu_yunfeixian not in", values, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_yunfeixian between", value1, value2, "wuliuYunfeixian");
            return (Criteria) this;
        }

        public Criteria andWuliuYunfeixianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wuliu_yunfeixian not between", value1, value2, "wuliuYunfeixian");
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