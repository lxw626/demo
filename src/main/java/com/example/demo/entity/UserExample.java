package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uId is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uId is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uId =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uId <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uId >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uId >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uId <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uId <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uId in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uId not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uId between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uId not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uName is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uName is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uName =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uName <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uName >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uName >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uName <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uName <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uName like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uName not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uName in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uName not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uName between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uName not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("uPassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("uPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("uPassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("uPassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("uPassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("uPassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("uPassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("uPassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("uPassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("uPassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("uPassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("uPassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("uPassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("uPassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uPhone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uPhone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uPhone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uPhone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uPhone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uPhone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uPhone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uPhone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uPhone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uPhone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uPhone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uPhone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uPhone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andJiguanIsNull() {
            addCriterion("jiGuan is null");
            return (Criteria) this;
        }

        public Criteria andJiguanIsNotNull() {
            addCriterion("jiGuan is not null");
            return (Criteria) this;
        }

        public Criteria andJiguanEqualTo(String value) {
            addCriterion("jiGuan =", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotEqualTo(String value) {
            addCriterion("jiGuan <>", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThan(String value) {
            addCriterion("jiGuan >", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThanOrEqualTo(String value) {
            addCriterion("jiGuan >=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThan(String value) {
            addCriterion("jiGuan <", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThanOrEqualTo(String value) {
            addCriterion("jiGuan <=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLike(String value) {
            addCriterion("jiGuan like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotLike(String value) {
            addCriterion("jiGuan not like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanIn(List<String> values) {
            addCriterion("jiGuan in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotIn(List<String> values) {
            addCriterion("jiGuan not in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanBetween(String value1, String value2) {
            addCriterion("jiGuan between", value1, value2, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotBetween(String value1, String value2) {
            addCriterion("jiGuan not between", value1, value2, "jiguan");
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