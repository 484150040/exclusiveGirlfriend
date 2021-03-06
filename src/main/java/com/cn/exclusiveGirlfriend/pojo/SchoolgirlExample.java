package com.cn.exclusiveGirlfriend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolgirlExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    public SchoolgirlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
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
     * This method corresponds to the database table schoolgirl
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
     * This method corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schoolgirl
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
     * This class corresponds to the database table schoolgirl
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningIsNull() {
            addCriterion("s_padcleaning is null");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningIsNotNull() {
            addCriterion("s_padcleaning is not null");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningEqualTo(String value) {
            addCriterion("s_padcleaning =", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningNotEqualTo(String value) {
            addCriterion("s_padcleaning <>", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningGreaterThan(String value) {
            addCriterion("s_padcleaning >", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningGreaterThanOrEqualTo(String value) {
            addCriterion("s_padcleaning >=", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningLessThan(String value) {
            addCriterion("s_padcleaning <", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningLessThanOrEqualTo(String value) {
            addCriterion("s_padcleaning <=", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningLike(String value) {
            addCriterion("s_padcleaning like", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningNotLike(String value) {
            addCriterion("s_padcleaning not like", value, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningIn(List<String> values) {
            addCriterion("s_padcleaning in", values, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningNotIn(List<String> values) {
            addCriterion("s_padcleaning not in", values, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningBetween(String value1, String value2) {
            addCriterion("s_padcleaning between", value1, value2, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadcleaningNotBetween(String value1, String value2) {
            addCriterion("s_padcleaning not between", value1, value2, "sPadcleaning");
            return (Criteria) this;
        }

        public Criteria andSPadsizeIsNull() {
            addCriterion("s_padsize is null");
            return (Criteria) this;
        }

        public Criteria andSPadsizeIsNotNull() {
            addCriterion("s_padsize is not null");
            return (Criteria) this;
        }

        public Criteria andSPadsizeEqualTo(String value) {
            addCriterion("s_padsize =", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeNotEqualTo(String value) {
            addCriterion("s_padsize <>", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeGreaterThan(String value) {
            addCriterion("s_padsize >", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeGreaterThanOrEqualTo(String value) {
            addCriterion("s_padsize >=", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeLessThan(String value) {
            addCriterion("s_padsize <", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeLessThanOrEqualTo(String value) {
            addCriterion("s_padsize <=", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeLike(String value) {
            addCriterion("s_padsize like", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeNotLike(String value) {
            addCriterion("s_padsize not like", value, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeIn(List<String> values) {
            addCriterion("s_padsize in", values, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeNotIn(List<String> values) {
            addCriterion("s_padsize not in", values, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeBetween(String value1, String value2) {
            addCriterion("s_padsize between", value1, value2, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadsizeNotBetween(String value1, String value2) {
            addCriterion("s_padsize not between", value1, value2, "sPadsize");
            return (Criteria) this;
        }

        public Criteria andSPadserviceIsNull() {
            addCriterion("s_padservice is null");
            return (Criteria) this;
        }

        public Criteria andSPadserviceIsNotNull() {
            addCriterion("s_padservice is not null");
            return (Criteria) this;
        }

        public Criteria andSPadserviceEqualTo(String value) {
            addCriterion("s_padservice =", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceNotEqualTo(String value) {
            addCriterion("s_padservice <>", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceGreaterThan(String value) {
            addCriterion("s_padservice >", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceGreaterThanOrEqualTo(String value) {
            addCriterion("s_padservice >=", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceLessThan(String value) {
            addCriterion("s_padservice <", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceLessThanOrEqualTo(String value) {
            addCriterion("s_padservice <=", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceLike(String value) {
            addCriterion("s_padservice like", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceNotLike(String value) {
            addCriterion("s_padservice not like", value, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceIn(List<String> values) {
            addCriterion("s_padservice in", values, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceNotIn(List<String> values) {
            addCriterion("s_padservice not in", values, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceBetween(String value1, String value2) {
            addCriterion("s_padservice between", value1, value2, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadserviceNotBetween(String value1, String value2) {
            addCriterion("s_padservice not between", value1, value2, "sPadservice");
            return (Criteria) this;
        }

        public Criteria andSPadagingIsNull() {
            addCriterion("s_padaging is null");
            return (Criteria) this;
        }

        public Criteria andSPadagingIsNotNull() {
            addCriterion("s_padaging is not null");
            return (Criteria) this;
        }

        public Criteria andSPadagingEqualTo(Integer value) {
            addCriterion("s_padaging =", value, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingNotEqualTo(Integer value) {
            addCriterion("s_padaging <>", value, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingGreaterThan(Integer value) {
            addCriterion("s_padaging >", value, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_padaging >=", value, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingLessThan(Integer value) {
            addCriterion("s_padaging <", value, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingLessThanOrEqualTo(Integer value) {
            addCriterion("s_padaging <=", value, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingIn(List<Integer> values) {
            addCriterion("s_padaging in", values, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingNotIn(List<Integer> values) {
            addCriterion("s_padaging not in", values, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingBetween(Integer value1, Integer value2) {
            addCriterion("s_padaging between", value1, value2, "sPadaging");
            return (Criteria) this;
        }

        public Criteria andSPadagingNotBetween(Integer value1, Integer value2) {
            addCriterion("s_padaging not between", value1, value2, "sPadaging");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schoolgirl
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
     * This class corresponds to the database table schoolgirl
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