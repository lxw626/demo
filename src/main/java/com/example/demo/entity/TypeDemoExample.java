package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TypeDemoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeDemoExample() {
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

        public Criteria andCharTypeIsNull() {
            addCriterion("CHAR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCharTypeIsNotNull() {
            addCriterion("CHAR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCharTypeEqualTo(String value) {
            addCriterion("CHAR_TYPE =", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeNotEqualTo(String value) {
            addCriterion("CHAR_TYPE <>", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeGreaterThan(String value) {
            addCriterion("CHAR_TYPE >", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHAR_TYPE >=", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeLessThan(String value) {
            addCriterion("CHAR_TYPE <", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeLessThanOrEqualTo(String value) {
            addCriterion("CHAR_TYPE <=", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeLike(String value) {
            addCriterion("CHAR_TYPE like", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeNotLike(String value) {
            addCriterion("CHAR_TYPE not like", value, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeIn(List<String> values) {
            addCriterion("CHAR_TYPE in", values, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeNotIn(List<String> values) {
            addCriterion("CHAR_TYPE not in", values, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeBetween(String value1, String value2) {
            addCriterion("CHAR_TYPE between", value1, value2, "charType");
            return (Criteria) this;
        }

        public Criteria andCharTypeNotBetween(String value1, String value2) {
            addCriterion("CHAR_TYPE not between", value1, value2, "charType");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeIsNull() {
            addCriterion("VARCHAR2_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeIsNotNull() {
            addCriterion("VARCHAR2_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeEqualTo(String value) {
            addCriterion("VARCHAR2_TYPE =", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeNotEqualTo(String value) {
            addCriterion("VARCHAR2_TYPE <>", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeGreaterThan(String value) {
            addCriterion("VARCHAR2_TYPE >", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeGreaterThanOrEqualTo(String value) {
            addCriterion("VARCHAR2_TYPE >=", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeLessThan(String value) {
            addCriterion("VARCHAR2_TYPE <", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeLessThanOrEqualTo(String value) {
            addCriterion("VARCHAR2_TYPE <=", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeLike(String value) {
            addCriterion("VARCHAR2_TYPE like", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeNotLike(String value) {
            addCriterion("VARCHAR2_TYPE not like", value, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeIn(List<String> values) {
            addCriterion("VARCHAR2_TYPE in", values, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeNotIn(List<String> values) {
            addCriterion("VARCHAR2_TYPE not in", values, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeBetween(String value1, String value2) {
            addCriterion("VARCHAR2_TYPE between", value1, value2, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarchar2TypeNotBetween(String value1, String value2) {
            addCriterion("VARCHAR2_TYPE not between", value1, value2, "varchar2Type");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeIsNull() {
            addCriterion("VARCHAR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeIsNotNull() {
            addCriterion("VARCHAR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeEqualTo(String value) {
            addCriterion("VARCHAR_TYPE =", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeNotEqualTo(String value) {
            addCriterion("VARCHAR_TYPE <>", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeGreaterThan(String value) {
            addCriterion("VARCHAR_TYPE >", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VARCHAR_TYPE >=", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeLessThan(String value) {
            addCriterion("VARCHAR_TYPE <", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeLessThanOrEqualTo(String value) {
            addCriterion("VARCHAR_TYPE <=", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeLike(String value) {
            addCriterion("VARCHAR_TYPE like", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeNotLike(String value) {
            addCriterion("VARCHAR_TYPE not like", value, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeIn(List<String> values) {
            addCriterion("VARCHAR_TYPE in", values, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeNotIn(List<String> values) {
            addCriterion("VARCHAR_TYPE not in", values, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeBetween(String value1, String value2) {
            addCriterion("VARCHAR_TYPE between", value1, value2, "varcharType");
            return (Criteria) this;
        }

        public Criteria andVarcharTypeNotBetween(String value1, String value2) {
            addCriterion("VARCHAR_TYPE not between", value1, value2, "varcharType");
            return (Criteria) this;
        }

        public Criteria andDateTypeIsNull() {
            addCriterion("DATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDateTypeIsNotNull() {
            addCriterion("DATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDateTypeEqualTo(Date value) {
            addCriterion("DATE_TYPE =", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeNotEqualTo(Date value) {
            addCriterion("DATE_TYPE <>", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeGreaterThan(Date value) {
            addCriterion("DATE_TYPE >", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_TYPE >=", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeLessThan(Date value) {
            addCriterion("DATE_TYPE <", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeLessThanOrEqualTo(Date value) {
            addCriterion("DATE_TYPE <=", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeIn(List<Date> values) {
            addCriterion("DATE_TYPE in", values, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeNotIn(List<Date> values) {
            addCriterion("DATE_TYPE not in", values, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeBetween(Date value1, Date value2) {
            addCriterion("DATE_TYPE between", value1, value2, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeNotBetween(Date value1, Date value2) {
            addCriterion("DATE_TYPE not between", value1, value2, "dateType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeIsNull() {
            addCriterion("INTEGER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeIsNotNull() {
            addCriterion("INTEGER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeEqualTo(Short value) {
            addCriterion("INTEGER_TYPE =", value, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeNotEqualTo(Short value) {
            addCriterion("INTEGER_TYPE <>", value, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeGreaterThan(Short value) {
            addCriterion("INTEGER_TYPE >", value, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INTEGER_TYPE >=", value, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeLessThan(Short value) {
            addCriterion("INTEGER_TYPE <", value, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeLessThanOrEqualTo(Short value) {
            addCriterion("INTEGER_TYPE <=", value, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeIn(List<Short> values) {
            addCriterion("INTEGER_TYPE in", values, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeNotIn(List<Short> values) {
            addCriterion("INTEGER_TYPE not in", values, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeBetween(Short value1, Short value2) {
            addCriterion("INTEGER_TYPE between", value1, value2, "integerType");
            return (Criteria) this;
        }

        public Criteria andIntegerTypeNotBetween(Short value1, Short value2) {
            addCriterion("INTEGER_TYPE not between", value1, value2, "integerType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeIsNull() {
            addCriterion("NUMBER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumberTypeIsNotNull() {
            addCriterion("NUMBER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumberTypeEqualTo(Short value) {
            addCriterion("NUMBER_TYPE =", value, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeNotEqualTo(Short value) {
            addCriterion("NUMBER_TYPE <>", value, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeGreaterThan(Short value) {
            addCriterion("NUMBER_TYPE >", value, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("NUMBER_TYPE >=", value, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeLessThan(Short value) {
            addCriterion("NUMBER_TYPE <", value, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeLessThanOrEqualTo(Short value) {
            addCriterion("NUMBER_TYPE <=", value, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeIn(List<Short> values) {
            addCriterion("NUMBER_TYPE in", values, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeNotIn(List<Short> values) {
            addCriterion("NUMBER_TYPE not in", values, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeBetween(Short value1, Short value2) {
            addCriterion("NUMBER_TYPE between", value1, value2, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumberTypeNotBetween(Short value1, Short value2) {
            addCriterion("NUMBER_TYPE not between", value1, value2, "numberType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeIsNull() {
            addCriterion("NUMERIC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumericTypeIsNotNull() {
            addCriterion("NUMERIC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumericTypeEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_TYPE =", value, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeNotEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_TYPE <>", value, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeGreaterThan(BigDecimal value) {
            addCriterion("NUMERIC_TYPE >", value, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_TYPE >=", value, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeLessThan(BigDecimal value) {
            addCriterion("NUMERIC_TYPE <", value, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_TYPE <=", value, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeIn(List<BigDecimal> values) {
            addCriterion("NUMERIC_TYPE in", values, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeNotIn(List<BigDecimal> values) {
            addCriterion("NUMERIC_TYPE not in", values, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMERIC_TYPE between", value1, value2, "numericType");
            return (Criteria) this;
        }

        public Criteria andNumericTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMERIC_TYPE not between", value1, value2, "numericType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeIsNull() {
            addCriterion("DECIMAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeIsNotNull() {
            addCriterion("DECIMAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeEqualTo(BigDecimal value) {
            addCriterion("DECIMAL_TYPE =", value, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeNotEqualTo(BigDecimal value) {
            addCriterion("DECIMAL_TYPE <>", value, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeGreaterThan(BigDecimal value) {
            addCriterion("DECIMAL_TYPE >", value, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DECIMAL_TYPE >=", value, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeLessThan(BigDecimal value) {
            addCriterion("DECIMAL_TYPE <", value, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DECIMAL_TYPE <=", value, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeIn(List<BigDecimal> values) {
            addCriterion("DECIMAL_TYPE in", values, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeNotIn(List<BigDecimal> values) {
            addCriterion("DECIMAL_TYPE not in", values, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DECIMAL_TYPE between", value1, value2, "decimalType");
            return (Criteria) this;
        }

        public Criteria andDecimalTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DECIMAL_TYPE not between", value1, value2, "decimalType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeIsNull() {
            addCriterion("TIMESTAMP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeIsNotNull() {
            addCriterion("TIMESTAMP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeEqualTo(Date value) {
            addCriterion("TIMESTAMP_TYPE =", value, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeNotEqualTo(Date value) {
            addCriterion("TIMESTAMP_TYPE <>", value, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeGreaterThan(Date value) {
            addCriterion("TIMESTAMP_TYPE >", value, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeGreaterThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP_TYPE >=", value, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeLessThan(Date value) {
            addCriterion("TIMESTAMP_TYPE <", value, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeLessThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP_TYPE <=", value, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeIn(List<Date> values) {
            addCriterion("TIMESTAMP_TYPE in", values, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeNotIn(List<Date> values) {
            addCriterion("TIMESTAMP_TYPE not in", values, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP_TYPE between", value1, value2, "timestampType");
            return (Criteria) this;
        }

        public Criteria andTimestampTypeNotBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP_TYPE not between", value1, value2, "timestampType");
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