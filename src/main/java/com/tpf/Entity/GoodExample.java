package com.tpf.Entity;

import java.util.ArrayList;
import java.util.List;

public class GoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(Integer value) {
            addCriterion("gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(Integer value) {
            addCriterion("gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(Integer value) {
            addCriterion("gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(Integer value) {
            addCriterion("gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(Integer value) {
            addCriterion("gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<Integer> values) {
            addCriterion("gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<Integer> values) {
            addCriterion("gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(Integer value1, Integer value2) {
            addCriterion("gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGnumberIsNull() {
            addCriterion("gnumber is null");
            return (Criteria) this;
        }

        public Criteria andGnumberIsNotNull() {
            addCriterion("gnumber is not null");
            return (Criteria) this;
        }

        public Criteria andGnumberEqualTo(Integer value) {
            addCriterion("gnumber =", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberNotEqualTo(Integer value) {
            addCriterion("gnumber <>", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberGreaterThan(Integer value) {
            addCriterion("gnumber >", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("gnumber >=", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberLessThan(Integer value) {
            addCriterion("gnumber <", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberLessThanOrEqualTo(Integer value) {
            addCriterion("gnumber <=", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberIn(List<Integer> values) {
            addCriterion("gnumber in", values, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberNotIn(List<Integer> values) {
            addCriterion("gnumber not in", values, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberBetween(Integer value1, Integer value2) {
            addCriterion("gnumber between", value1, value2, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("gnumber not between", value1, value2, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGsizeIsNull() {
            addCriterion("gsize is null");
            return (Criteria) this;
        }

        public Criteria andGsizeIsNotNull() {
            addCriterion("gsize is not null");
            return (Criteria) this;
        }

        public Criteria andGsizeEqualTo(String value) {
            addCriterion("gsize =", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeNotEqualTo(String value) {
            addCriterion("gsize <>", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeGreaterThan(String value) {
            addCriterion("gsize >", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeGreaterThanOrEqualTo(String value) {
            addCriterion("gsize >=", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeLessThan(String value) {
            addCriterion("gsize <", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeLessThanOrEqualTo(String value) {
            addCriterion("gsize <=", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeLike(String value) {
            addCriterion("gsize like", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeNotLike(String value) {
            addCriterion("gsize not like", value, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeIn(List<String> values) {
            addCriterion("gsize in", values, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeNotIn(List<String> values) {
            addCriterion("gsize not in", values, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeBetween(String value1, String value2) {
            addCriterion("gsize between", value1, value2, "gsize");
            return (Criteria) this;
        }

        public Criteria andGsizeNotBetween(String value1, String value2) {
            addCriterion("gsize not between", value1, value2, "gsize");
            return (Criteria) this;
        }

        public Criteria andGpictureIsNull() {
            addCriterion("gpicture is null");
            return (Criteria) this;
        }

        public Criteria andGpictureIsNotNull() {
            addCriterion("gpicture is not null");
            return (Criteria) this;
        }

        public Criteria andGpictureEqualTo(String value) {
            addCriterion("gpicture =", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotEqualTo(String value) {
            addCriterion("gpicture <>", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureGreaterThan(String value) {
            addCriterion("gpicture >", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureGreaterThanOrEqualTo(String value) {
            addCriterion("gpicture >=", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureLessThan(String value) {
            addCriterion("gpicture <", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureLessThanOrEqualTo(String value) {
            addCriterion("gpicture <=", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureLike(String value) {
            addCriterion("gpicture like", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotLike(String value) {
            addCriterion("gpicture not like", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureIn(List<String> values) {
            addCriterion("gpicture in", values, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotIn(List<String> values) {
            addCriterion("gpicture not in", values, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureBetween(String value1, String value2) {
            addCriterion("gpicture between", value1, value2, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotBetween(String value1, String value2) {
            addCriterion("gpicture not between", value1, value2, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGdiscussIsNull() {
            addCriterion("gdiscuss is null");
            return (Criteria) this;
        }

        public Criteria andGdiscussIsNotNull() {
            addCriterion("gdiscuss is not null");
            return (Criteria) this;
        }

        public Criteria andGdiscussEqualTo(String value) {
            addCriterion("gdiscuss =", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussNotEqualTo(String value) {
            addCriterion("gdiscuss <>", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussGreaterThan(String value) {
            addCriterion("gdiscuss >", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussGreaterThanOrEqualTo(String value) {
            addCriterion("gdiscuss >=", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussLessThan(String value) {
            addCriterion("gdiscuss <", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussLessThanOrEqualTo(String value) {
            addCriterion("gdiscuss <=", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussLike(String value) {
            addCriterion("gdiscuss like", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussNotLike(String value) {
            addCriterion("gdiscuss not like", value, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussIn(List<String> values) {
            addCriterion("gdiscuss in", values, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussNotIn(List<String> values) {
            addCriterion("gdiscuss not in", values, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussBetween(String value1, String value2) {
            addCriterion("gdiscuss between", value1, value2, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGdiscussNotBetween(String value1, String value2) {
            addCriterion("gdiscuss not between", value1, value2, "gdiscuss");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNull() {
            addCriterion("gtype is null");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNotNull() {
            addCriterion("gtype is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeEqualTo(String value) {
            addCriterion("gtype =", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotEqualTo(String value) {
            addCriterion("gtype <>", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThan(String value) {
            addCriterion("gtype >", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThanOrEqualTo(String value) {
            addCriterion("gtype >=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThan(String value) {
            addCriterion("gtype <", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThanOrEqualTo(String value) {
            addCriterion("gtype <=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLike(String value) {
            addCriterion("gtype like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotLike(String value) {
            addCriterion("gtype not like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeIn(List<String> values) {
            addCriterion("gtype in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotIn(List<String> values) {
            addCriterion("gtype not in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeBetween(String value1, String value2) {
            addCriterion("gtype between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotBetween(String value1, String value2) {
            addCriterion("gtype not between", value1, value2, "gtype");
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