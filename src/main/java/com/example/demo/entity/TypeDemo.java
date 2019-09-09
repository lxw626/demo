package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TypeDemo implements Serializable {
    private String charType;

    private String varchar2Type;

    private String varcharType;

    private Date dateType;

    private Short integerType;

    private Short numberType;

    private BigDecimal numericType;

    private BigDecimal decimalType;

    private Date timestampType;

    private String longType;

    private static final long serialVersionUID = 1L;

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType == null ? null : charType.trim();
    }

    public String getVarchar2Type() {
        return varchar2Type;
    }

    public void setVarchar2Type(String varchar2Type) {
        this.varchar2Type = varchar2Type == null ? null : varchar2Type.trim();
    }

    public String getVarcharType() {
        return varcharType;
    }

    public void setVarcharType(String varcharType) {
        this.varcharType = varcharType == null ? null : varcharType.trim();
    }

    public Date getDateType() {
        return dateType;
    }

    public void setDateType(Date dateType) {
        this.dateType = dateType;
    }

    public Short getIntegerType() {
        return integerType;
    }

    public void setIntegerType(Short integerType) {
        this.integerType = integerType;
    }

    public Short getNumberType() {
        return numberType;
    }

    public void setNumberType(Short numberType) {
        this.numberType = numberType;
    }

    public BigDecimal getNumericType() {
        return numericType;
    }

    public void setNumericType(BigDecimal numericType) {
        this.numericType = numericType;
    }

    public BigDecimal getDecimalType() {
        return decimalType;
    }

    public void setDecimalType(BigDecimal decimalType) {
        this.decimalType = decimalType;
    }

    public Date getTimestampType() {
        return timestampType;
    }

    public void setTimestampType(Date timestampType) {
        this.timestampType = timestampType;
    }

    public String getLongType() {
        return longType;
    }

    public void setLongType(String longType) {
        this.longType = longType == null ? null : longType.trim();
    }
}