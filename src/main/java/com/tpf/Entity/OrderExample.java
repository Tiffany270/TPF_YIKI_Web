package com.tpf.Entity;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOusernameIsNull() {
            addCriterion("ousername is null");
            return (Criteria) this;
        }

        public Criteria andOusernameIsNotNull() {
            addCriterion("ousername is not null");
            return (Criteria) this;
        }

        public Criteria andOusernameEqualTo(String value) {
            addCriterion("ousername =", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameNotEqualTo(String value) {
            addCriterion("ousername <>", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameGreaterThan(String value) {
            addCriterion("ousername >", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameGreaterThanOrEqualTo(String value) {
            addCriterion("ousername >=", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameLessThan(String value) {
            addCriterion("ousername <", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameLessThanOrEqualTo(String value) {
            addCriterion("ousername <=", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameLike(String value) {
            addCriterion("ousername like", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameNotLike(String value) {
            addCriterion("ousername not like", value, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameIn(List<String> values) {
            addCriterion("ousername in", values, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameNotIn(List<String> values) {
            addCriterion("ousername not in", values, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameBetween(String value1, String value2) {
            addCriterion("ousername between", value1, value2, "ousername");
            return (Criteria) this;
        }

        public Criteria andOusernameNotBetween(String value1, String value2) {
            addCriterion("ousername not between", value1, value2, "ousername");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceIsNull() {
            addCriterion("ototalprice is null");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceIsNotNull() {
            addCriterion("ototalprice is not null");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceEqualTo(Double value) {
            addCriterion("ototalprice =", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceNotEqualTo(Double value) {
            addCriterion("ototalprice <>", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceGreaterThan(Double value) {
            addCriterion("ototalprice >", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ototalprice >=", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceLessThan(Double value) {
            addCriterion("ototalprice <", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("ototalprice <=", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceIn(List<Double> values) {
            addCriterion("ototalprice in", values, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceNotIn(List<Double> values) {
            addCriterion("ototalprice not in", values, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceBetween(Double value1, Double value2) {
            addCriterion("ototalprice between", value1, value2, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("ototalprice not between", value1, value2, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNull() {
            addCriterion("oaddress is null");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNotNull() {
            addCriterion("oaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOaddressEqualTo(String value) {
            addCriterion("oaddress =", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotEqualTo(String value) {
            addCriterion("oaddress <>", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThan(String value) {
            addCriterion("oaddress >", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThanOrEqualTo(String value) {
            addCriterion("oaddress >=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThan(String value) {
            addCriterion("oaddress <", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThanOrEqualTo(String value) {
            addCriterion("oaddress <=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLike(String value) {
            addCriterion("oaddress like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotLike(String value) {
            addCriterion("oaddress not like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressIn(List<String> values) {
            addCriterion("oaddress in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotIn(List<String> values) {
            addCriterion("oaddress not in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressBetween(String value1, String value2) {
            addCriterion("oaddress between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotBetween(String value1, String value2) {
            addCriterion("oaddress not between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andIssendIsNull() {
            addCriterion("isSend is null");
            return (Criteria) this;
        }

        public Criteria andIssendIsNotNull() {
            addCriterion("isSend is not null");
            return (Criteria) this;
        }

        public Criteria andIssendEqualTo(String value) {
            addCriterion("isSend =", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotEqualTo(String value) {
            addCriterion("isSend <>", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThan(String value) {
            addCriterion("isSend >", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThanOrEqualTo(String value) {
            addCriterion("isSend >=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThan(String value) {
            addCriterion("isSend <", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThanOrEqualTo(String value) {
            addCriterion("isSend <=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLike(String value) {
            addCriterion("isSend like", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotLike(String value) {
            addCriterion("isSend not like", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendIn(List<String> values) {
            addCriterion("isSend in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotIn(List<String> values) {
            addCriterion("isSend not in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendBetween(String value1, String value2) {
            addCriterion("isSend between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotBetween(String value1, String value2) {
            addCriterion("isSend not between", value1, value2, "issend");
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