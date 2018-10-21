package com.lzx.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisDeliveryReceiptExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public DisDeliveryReceiptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
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

        public Criteria andDeliveryReceiptIdIsNull() {
            addCriterion("delivery_receipt_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdIsNotNull() {
            addCriterion("delivery_receipt_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdEqualTo(String value) {
            addCriterion("delivery_receipt_id =", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdNotEqualTo(String value) {
            addCriterion("delivery_receipt_id <>", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdGreaterThan(String value) {
            addCriterion("delivery_receipt_id >", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_receipt_id >=", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdLessThan(String value) {
            addCriterion("delivery_receipt_id <", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdLessThanOrEqualTo(String value) {
            addCriterion("delivery_receipt_id <=", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdLike(String value) {
            addCriterion("delivery_receipt_id like", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdNotLike(String value) {
            addCriterion("delivery_receipt_id not like", value, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdIn(List<String> values) {
            addCriterion("delivery_receipt_id in", values, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdNotIn(List<String> values) {
            addCriterion("delivery_receipt_id not in", values, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdBetween(String value1, String value2) {
            addCriterion("delivery_receipt_id between", value1, value2, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptIdNotBetween(String value1, String value2) {
            addCriterion("delivery_receipt_id not between", value1, value2, "deliveryReceiptId");
            return (Criteria) this;
        }

        public Criteria andStartCityIsNull() {
            addCriterion("start_city is null");
            return (Criteria) this;
        }

        public Criteria andStartCityIsNotNull() {
            addCriterion("start_city is not null");
            return (Criteria) this;
        }

        public Criteria andStartCityEqualTo(String value) {
            addCriterion("start_city =", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityNotEqualTo(String value) {
            addCriterion("start_city <>", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityGreaterThan(String value) {
            addCriterion("start_city >", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityGreaterThanOrEqualTo(String value) {
            addCriterion("start_city >=", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityLessThan(String value) {
            addCriterion("start_city <", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityLessThanOrEqualTo(String value) {
            addCriterion("start_city <=", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityLike(String value) {
            addCriterion("start_city like", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityNotLike(String value) {
            addCriterion("start_city not like", value, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityIn(List<String> values) {
            addCriterion("start_city in", values, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityNotIn(List<String> values) {
            addCriterion("start_city not in", values, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityBetween(String value1, String value2) {
            addCriterion("start_city between", value1, value2, "startCity");
            return (Criteria) this;
        }

        public Criteria andStartCityNotBetween(String value1, String value2) {
            addCriterion("start_city not between", value1, value2, "startCity");
            return (Criteria) this;
        }

        public Criteria andEndCityIsNull() {
            addCriterion("end_city is null");
            return (Criteria) this;
        }

        public Criteria andEndCityIsNotNull() {
            addCriterion("end_city is not null");
            return (Criteria) this;
        }

        public Criteria andEndCityEqualTo(String value) {
            addCriterion("end_city =", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityNotEqualTo(String value) {
            addCriterion("end_city <>", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityGreaterThan(String value) {
            addCriterion("end_city >", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityGreaterThanOrEqualTo(String value) {
            addCriterion("end_city >=", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityLessThan(String value) {
            addCriterion("end_city <", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityLessThanOrEqualTo(String value) {
            addCriterion("end_city <=", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityLike(String value) {
            addCriterion("end_city like", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityNotLike(String value) {
            addCriterion("end_city not like", value, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityIn(List<String> values) {
            addCriterion("end_city in", values, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityNotIn(List<String> values) {
            addCriterion("end_city not in", values, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityBetween(String value1, String value2) {
            addCriterion("end_city between", value1, value2, "endCity");
            return (Criteria) this;
        }

        public Criteria andEndCityNotBetween(String value1, String value2) {
            addCriterion("end_city not between", value1, value2, "endCity");
            return (Criteria) this;
        }

        public Criteria andMidCityIsNull() {
            addCriterion("mid_city is null");
            return (Criteria) this;
        }

        public Criteria andMidCityIsNotNull() {
            addCriterion("mid_city is not null");
            return (Criteria) this;
        }

        public Criteria andMidCityEqualTo(String value) {
            addCriterion("mid_city =", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityNotEqualTo(String value) {
            addCriterion("mid_city <>", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityGreaterThan(String value) {
            addCriterion("mid_city >", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityGreaterThanOrEqualTo(String value) {
            addCriterion("mid_city >=", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityLessThan(String value) {
            addCriterion("mid_city <", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityLessThanOrEqualTo(String value) {
            addCriterion("mid_city <=", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityLike(String value) {
            addCriterion("mid_city like", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityNotLike(String value) {
            addCriterion("mid_city not like", value, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityIn(List<String> values) {
            addCriterion("mid_city in", values, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityNotIn(List<String> values) {
            addCriterion("mid_city not in", values, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityBetween(String value1, String value2) {
            addCriterion("mid_city between", value1, value2, "midCity");
            return (Criteria) this;
        }

        public Criteria andMidCityNotBetween(String value1, String value2) {
            addCriterion("mid_city not between", value1, value2, "midCity");
            return (Criteria) this;
        }

        public Criteria andMakeDateIsNull() {
            addCriterion("make_date is null");
            return (Criteria) this;
        }

        public Criteria andMakeDateIsNotNull() {
            addCriterion("make_date is not null");
            return (Criteria) this;
        }

        public Criteria andMakeDateEqualTo(Date value) {
            addCriterion("make_date =", value, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateNotEqualTo(Date value) {
            addCriterion("make_date <>", value, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateGreaterThan(Date value) {
            addCriterion("make_date >", value, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("make_date >=", value, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateLessThan(Date value) {
            addCriterion("make_date <", value, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateLessThanOrEqualTo(Date value) {
            addCriterion("make_date <=", value, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateIn(List<Date> values) {
            addCriterion("make_date in", values, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateNotIn(List<Date> values) {
            addCriterion("make_date not in", values, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateBetween(Date value1, Date value2) {
            addCriterion("make_date between", value1, value2, "makeDate");
            return (Criteria) this;
        }

        public Criteria andMakeDateNotBetween(Date value1, Date value2) {
            addCriterion("make_date not between", value1, value2, "makeDate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_delivery_receipt
     *
     * @mbg.generated
     */
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