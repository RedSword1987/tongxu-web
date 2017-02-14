package com.tongxuweb.domain.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PUserExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PUserExample() {
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

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPassIsNull() {
            addCriterion("login_pass is null");
            return (Criteria) this;
        }

        public Criteria andLoginPassIsNotNull() {
            addCriterion("login_pass is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPassEqualTo(String value) {
            addCriterion("login_pass =", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotEqualTo(String value) {
            addCriterion("login_pass <>", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassGreaterThan(String value) {
            addCriterion("login_pass >", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassGreaterThanOrEqualTo(String value) {
            addCriterion("login_pass >=", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLessThan(String value) {
            addCriterion("login_pass <", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLessThanOrEqualTo(String value) {
            addCriterion("login_pass <=", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLike(String value) {
            addCriterion("login_pass like", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotLike(String value) {
            addCriterion("login_pass not like", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassIn(List<String> values) {
            addCriterion("login_pass in", values, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotIn(List<String> values) {
            addCriterion("login_pass not in", values, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassBetween(String value1, String value2) {
            addCriterion("login_pass between", value1, value2, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotBetween(String value1, String value2) {
            addCriterion("login_pass not between", value1, value2, "loginPass");
            return (Criteria) this;
        }

        public Criteria andPayPassIsNull() {
            addCriterion("pay_pass is null");
            return (Criteria) this;
        }

        public Criteria andPayPassIsNotNull() {
            addCriterion("pay_pass is not null");
            return (Criteria) this;
        }

        public Criteria andPayPassEqualTo(String value) {
            addCriterion("pay_pass =", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassNotEqualTo(String value) {
            addCriterion("pay_pass <>", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassGreaterThan(String value) {
            addCriterion("pay_pass >", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassGreaterThanOrEqualTo(String value) {
            addCriterion("pay_pass >=", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassLessThan(String value) {
            addCriterion("pay_pass <", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassLessThanOrEqualTo(String value) {
            addCriterion("pay_pass <=", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassLike(String value) {
            addCriterion("pay_pass like", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassNotLike(String value) {
            addCriterion("pay_pass not like", value, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassIn(List<String> values) {
            addCriterion("pay_pass in", values, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassNotIn(List<String> values) {
            addCriterion("pay_pass not in", values, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassBetween(String value1, String value2) {
            addCriterion("pay_pass between", value1, value2, "payPass");
            return (Criteria) this;
        }

        public Criteria andPayPassNotBetween(String value1, String value2) {
            addCriterion("pay_pass not between", value1, value2, "payPass");
            return (Criteria) this;
        }

        public Criteria andGesturePassIsNull() {
            addCriterion("gesture_pass is null");
            return (Criteria) this;
        }

        public Criteria andGesturePassIsNotNull() {
            addCriterion("gesture_pass is not null");
            return (Criteria) this;
        }

        public Criteria andGesturePassEqualTo(String value) {
            addCriterion("gesture_pass =", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassNotEqualTo(String value) {
            addCriterion("gesture_pass <>", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassGreaterThan(String value) {
            addCriterion("gesture_pass >", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassGreaterThanOrEqualTo(String value) {
            addCriterion("gesture_pass >=", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassLessThan(String value) {
            addCriterion("gesture_pass <", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassLessThanOrEqualTo(String value) {
            addCriterion("gesture_pass <=", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassLike(String value) {
            addCriterion("gesture_pass like", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassNotLike(String value) {
            addCriterion("gesture_pass not like", value, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassIn(List<String> values) {
            addCriterion("gesture_pass in", values, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassNotIn(List<String> values) {
            addCriterion("gesture_pass not in", values, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassBetween(String value1, String value2) {
            addCriterion("gesture_pass between", value1, value2, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andGesturePassNotBetween(String value1, String value2) {
            addCriterion("gesture_pass not between", value1, value2, "gesturePass");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(Integer value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(Integer value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(Integer value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(Integer value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(Integer value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<Integer> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<Integer> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(Integer value1, Integer value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsResetIsNull() {
            addCriterion("is_reset is null");
            return (Criteria) this;
        }

        public Criteria andIsResetIsNotNull() {
            addCriterion("is_reset is not null");
            return (Criteria) this;
        }

        public Criteria andIsResetEqualTo(Integer value) {
            addCriterion("is_reset =", value, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetNotEqualTo(Integer value) {
            addCriterion("is_reset <>", value, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetGreaterThan(Integer value) {
            addCriterion("is_reset >", value, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_reset >=", value, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetLessThan(Integer value) {
            addCriterion("is_reset <", value, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetLessThanOrEqualTo(Integer value) {
            addCriterion("is_reset <=", value, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetIn(List<Integer> values) {
            addCriterion("is_reset in", values, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetNotIn(List<Integer> values) {
            addCriterion("is_reset not in", values, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetBetween(Integer value1, Integer value2) {
            addCriterion("is_reset between", value1, value2, "isReset");
            return (Criteria) this;
        }

        public Criteria andIsResetNotBetween(Integer value1, Integer value2) {
            addCriterion("is_reset not between", value1, value2, "isReset");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesIsNull() {
            addCriterion("login_fail_times is null");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesIsNotNull() {
            addCriterion("login_fail_times is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesEqualTo(Integer value) {
            addCriterion("login_fail_times =", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesNotEqualTo(Integer value) {
            addCriterion("login_fail_times <>", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesGreaterThan(Integer value) {
            addCriterion("login_fail_times >", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_fail_times >=", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesLessThan(Integer value) {
            addCriterion("login_fail_times <", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesLessThanOrEqualTo(Integer value) {
            addCriterion("login_fail_times <=", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesIn(List<Integer> values) {
            addCriterion("login_fail_times in", values, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesNotIn(List<Integer> values) {
            addCriterion("login_fail_times not in", values, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesBetween(Integer value1, Integer value2) {
            addCriterion("login_fail_times between", value1, value2, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("login_fail_times not between", value1, value2, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesIsNull() {
            addCriterion("pay_fail_times is null");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesIsNotNull() {
            addCriterion("pay_fail_times is not null");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesEqualTo(Integer value) {
            addCriterion("pay_fail_times =", value, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesNotEqualTo(Integer value) {
            addCriterion("pay_fail_times <>", value, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesGreaterThan(Integer value) {
            addCriterion("pay_fail_times >", value, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_fail_times >=", value, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesLessThan(Integer value) {
            addCriterion("pay_fail_times <", value, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesLessThanOrEqualTo(Integer value) {
            addCriterion("pay_fail_times <=", value, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesIn(List<Integer> values) {
            addCriterion("pay_fail_times in", values, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesNotIn(List<Integer> values) {
            addCriterion("pay_fail_times not in", values, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesBetween(Integer value1, Integer value2) {
            addCriterion("pay_fail_times between", value1, value2, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andPayFailTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_fail_times not between", value1, value2, "payFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesIsNull() {
            addCriterion("gesture_fail_times is null");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesIsNotNull() {
            addCriterion("gesture_fail_times is not null");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesEqualTo(Integer value) {
            addCriterion("gesture_fail_times =", value, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesNotEqualTo(Integer value) {
            addCriterion("gesture_fail_times <>", value, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesGreaterThan(Integer value) {
            addCriterion("gesture_fail_times >", value, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("gesture_fail_times >=", value, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesLessThan(Integer value) {
            addCriterion("gesture_fail_times <", value, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesLessThanOrEqualTo(Integer value) {
            addCriterion("gesture_fail_times <=", value, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesIn(List<Integer> values) {
            addCriterion("gesture_fail_times in", values, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesNotIn(List<Integer> values) {
            addCriterion("gesture_fail_times not in", values, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesBetween(Integer value1, Integer value2) {
            addCriterion("gesture_fail_times between", value1, value2, "gestureFailTimes");
            return (Criteria) this;
        }

        public Criteria andGestureFailTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("gesture_fail_times not between", value1, value2, "gestureFailTimes");
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