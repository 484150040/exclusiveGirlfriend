package com.cn.exclusiveGirlfriend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GirllikeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table girllike
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table girllike
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table girllike
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    public GirllikeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
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
     * This method corresponds to the database table girllike
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
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
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
     * This class corresponds to the database table girllike
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

        public Criteria andGlIdIsNull() {
            addCriterion("gl_id is null");
            return (Criteria) this;
        }

        public Criteria andGlIdIsNotNull() {
            addCriterion("gl_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlIdEqualTo(Integer value) {
            addCriterion("gl_id =", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdNotEqualTo(Integer value) {
            addCriterion("gl_id <>", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdGreaterThan(Integer value) {
            addCriterion("gl_id >", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gl_id >=", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdLessThan(Integer value) {
            addCriterion("gl_id <", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdLessThanOrEqualTo(Integer value) {
            addCriterion("gl_id <=", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdIn(List<Integer> values) {
            addCriterion("gl_id in", values, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdNotIn(List<Integer> values) {
            addCriterion("gl_id not in", values, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdBetween(Integer value1, Integer value2) {
            addCriterion("gl_id between", value1, value2, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gl_id not between", value1, value2, "glId");
            return (Criteria) this;
        }

        public Criteria andGlNameIsNull() {
            addCriterion("gl_name is null");
            return (Criteria) this;
        }

        public Criteria andGlNameIsNotNull() {
            addCriterion("gl_name is not null");
            return (Criteria) this;
        }

        public Criteria andGlNameEqualTo(String value) {
            addCriterion("gl_name =", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameNotEqualTo(String value) {
            addCriterion("gl_name <>", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameGreaterThan(String value) {
            addCriterion("gl_name >", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameGreaterThanOrEqualTo(String value) {
            addCriterion("gl_name >=", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameLessThan(String value) {
            addCriterion("gl_name <", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameLessThanOrEqualTo(String value) {
            addCriterion("gl_name <=", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameLike(String value) {
            addCriterion("gl_name like", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameNotLike(String value) {
            addCriterion("gl_name not like", value, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameIn(List<String> values) {
            addCriterion("gl_name in", values, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameNotIn(List<String> values) {
            addCriterion("gl_name not in", values, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameBetween(String value1, String value2) {
            addCriterion("gl_name between", value1, value2, "glName");
            return (Criteria) this;
        }

        public Criteria andGlNameNotBetween(String value1, String value2) {
            addCriterion("gl_name not between", value1, value2, "glName");
            return (Criteria) this;
        }

        public Criteria andGlColorIsNull() {
            addCriterion("gl_color is null");
            return (Criteria) this;
        }

        public Criteria andGlColorIsNotNull() {
            addCriterion("gl_color is not null");
            return (Criteria) this;
        }

        public Criteria andGlColorEqualTo(String value) {
            addCriterion("gl_color =", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorNotEqualTo(String value) {
            addCriterion("gl_color <>", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorGreaterThan(String value) {
            addCriterion("gl_color >", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorGreaterThanOrEqualTo(String value) {
            addCriterion("gl_color >=", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorLessThan(String value) {
            addCriterion("gl_color <", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorLessThanOrEqualTo(String value) {
            addCriterion("gl_color <=", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorLike(String value) {
            addCriterion("gl_color like", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorNotLike(String value) {
            addCriterion("gl_color not like", value, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorIn(List<String> values) {
            addCriterion("gl_color in", values, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorNotIn(List<String> values) {
            addCriterion("gl_color not in", values, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorBetween(String value1, String value2) {
            addCriterion("gl_color between", value1, value2, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlColorNotBetween(String value1, String value2) {
            addCriterion("gl_color not between", value1, value2, "glColor");
            return (Criteria) this;
        }

        public Criteria andGlStyleIsNull() {
            addCriterion("gl_style is null");
            return (Criteria) this;
        }

        public Criteria andGlStyleIsNotNull() {
            addCriterion("gl_style is not null");
            return (Criteria) this;
        }

        public Criteria andGlStyleEqualTo(String value) {
            addCriterion("gl_style =", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleNotEqualTo(String value) {
            addCriterion("gl_style <>", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleGreaterThan(String value) {
            addCriterion("gl_style >", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleGreaterThanOrEqualTo(String value) {
            addCriterion("gl_style >=", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleLessThan(String value) {
            addCriterion("gl_style <", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleLessThanOrEqualTo(String value) {
            addCriterion("gl_style <=", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleLike(String value) {
            addCriterion("gl_style like", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleNotLike(String value) {
            addCriterion("gl_style not like", value, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleIn(List<String> values) {
            addCriterion("gl_style in", values, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleNotIn(List<String> values) {
            addCriterion("gl_style not in", values, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleBetween(String value1, String value2) {
            addCriterion("gl_style between", value1, value2, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlStyleNotBetween(String value1, String value2) {
            addCriterion("gl_style not between", value1, value2, "glStyle");
            return (Criteria) this;
        }

        public Criteria andGlTypeIsNull() {
            addCriterion("gl_type is null");
            return (Criteria) this;
        }

        public Criteria andGlTypeIsNotNull() {
            addCriterion("gl_type is not null");
            return (Criteria) this;
        }

        public Criteria andGlTypeEqualTo(String value) {
            addCriterion("gl_type =", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeNotEqualTo(String value) {
            addCriterion("gl_type <>", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeGreaterThan(String value) {
            addCriterion("gl_type >", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gl_type >=", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeLessThan(String value) {
            addCriterion("gl_type <", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeLessThanOrEqualTo(String value) {
            addCriterion("gl_type <=", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeLike(String value) {
            addCriterion("gl_type like", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeNotLike(String value) {
            addCriterion("gl_type not like", value, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeIn(List<String> values) {
            addCriterion("gl_type in", values, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeNotIn(List<String> values) {
            addCriterion("gl_type not in", values, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeBetween(String value1, String value2) {
            addCriterion("gl_type between", value1, value2, "glType");
            return (Criteria) this;
        }

        public Criteria andGlTypeNotBetween(String value1, String value2) {
            addCriterion("gl_type not between", value1, value2, "glType");
            return (Criteria) this;
        }

        public Criteria andGlSizeIsNull() {
            addCriterion("gl_size is null");
            return (Criteria) this;
        }

        public Criteria andGlSizeIsNotNull() {
            addCriterion("gl_size is not null");
            return (Criteria) this;
        }

        public Criteria andGlSizeEqualTo(Integer value) {
            addCriterion("gl_size =", value, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeNotEqualTo(Integer value) {
            addCriterion("gl_size <>", value, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeGreaterThan(Integer value) {
            addCriterion("gl_size >", value, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gl_size >=", value, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeLessThan(Integer value) {
            addCriterion("gl_size <", value, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeLessThanOrEqualTo(Integer value) {
            addCriterion("gl_size <=", value, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeIn(List<Integer> values) {
            addCriterion("gl_size in", values, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeNotIn(List<Integer> values) {
            addCriterion("gl_size not in", values, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeBetween(Integer value1, Integer value2) {
            addCriterion("gl_size between", value1, value2, "glSize");
            return (Criteria) this;
        }

        public Criteria andGlSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("gl_size not between", value1, value2, "glSize");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andGlLevelIsNull() {
            addCriterion("gl_level is null");
            return (Criteria) this;
        }

        public Criteria andGlLevelIsNotNull() {
            addCriterion("gl_level is not null");
            return (Criteria) this;
        }

        public Criteria andGlLevelEqualTo(Integer value) {
            addCriterion("gl_level =", value, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelNotEqualTo(Integer value) {
            addCriterion("gl_level <>", value, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelGreaterThan(Integer value) {
            addCriterion("gl_level >", value, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("gl_level >=", value, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelLessThan(Integer value) {
            addCriterion("gl_level <", value, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelLessThanOrEqualTo(Integer value) {
            addCriterion("gl_level <=", value, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelIn(List<Integer> values) {
            addCriterion("gl_level in", values, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelNotIn(List<Integer> values) {
            addCriterion("gl_level not in", values, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelBetween(Integer value1, Integer value2) {
            addCriterion("gl_level between", value1, value2, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("gl_level not between", value1, value2, "glLevel");
            return (Criteria) this;
        }

        public Criteria andGlStateIsNull() {
            addCriterion("gl_state is null");
            return (Criteria) this;
        }

        public Criteria andGlStateIsNotNull() {
            addCriterion("gl_state is not null");
            return (Criteria) this;
        }

        public Criteria andGlStateEqualTo(Integer value) {
            addCriterion("gl_state =", value, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateNotEqualTo(Integer value) {
            addCriterion("gl_state <>", value, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateGreaterThan(Integer value) {
            addCriterion("gl_state >", value, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("gl_state >=", value, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateLessThan(Integer value) {
            addCriterion("gl_state <", value, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateLessThanOrEqualTo(Integer value) {
            addCriterion("gl_state <=", value, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateIn(List<Integer> values) {
            addCriterion("gl_state in", values, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateNotIn(List<Integer> values) {
            addCriterion("gl_state not in", values, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateBetween(Integer value1, Integer value2) {
            addCriterion("gl_state between", value1, value2, "glState");
            return (Criteria) this;
        }

        public Criteria andGlStateNotBetween(Integer value1, Integer value2) {
            addCriterion("gl_state not between", value1, value2, "glState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table girllike
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
     * This class corresponds to the database table girllike
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