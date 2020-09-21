package com.cn.exclusiveGirlfriend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlongrecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    public AlongrecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
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
     * This method corresponds to the database table alongrecord
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
     * This method corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alongrecord
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
     * This class corresponds to the database table alongrecord
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAPlaceIsNull() {
            addCriterion("a_place is null");
            return (Criteria) this;
        }

        public Criteria andAPlaceIsNotNull() {
            addCriterion("a_place is not null");
            return (Criteria) this;
        }

        public Criteria andAPlaceEqualTo(String value) {
            addCriterion("a_place =", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceNotEqualTo(String value) {
            addCriterion("a_place <>", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceGreaterThan(String value) {
            addCriterion("a_place >", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("a_place >=", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceLessThan(String value) {
            addCriterion("a_place <", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceLessThanOrEqualTo(String value) {
            addCriterion("a_place <=", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceLike(String value) {
            addCriterion("a_place like", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceNotLike(String value) {
            addCriterion("a_place not like", value, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceIn(List<String> values) {
            addCriterion("a_place in", values, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceNotIn(List<String> values) {
            addCriterion("a_place not in", values, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceBetween(String value1, String value2) {
            addCriterion("a_place between", value1, value2, "aPlace");
            return (Criteria) this;
        }

        public Criteria andAPlaceNotBetween(String value1, String value2) {
            addCriterion("a_place not between", value1, value2, "aPlace");
            return (Criteria) this;
        }

        public Criteria andATimeIsNull() {
            addCriterion("a_time is null");
            return (Criteria) this;
        }

        public Criteria andATimeIsNotNull() {
            addCriterion("a_time is not null");
            return (Criteria) this;
        }

        public Criteria andATimeEqualTo(Date value) {
            addCriterion("a_time =", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeNotEqualTo(Date value) {
            addCriterion("a_time <>", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeGreaterThan(Date value) {
            addCriterion("a_time >", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_time >=", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeLessThan(Date value) {
            addCriterion("a_time <", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeLessThanOrEqualTo(Date value) {
            addCriterion("a_time <=", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeIn(List<Date> values) {
            addCriterion("a_time in", values, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeNotIn(List<Date> values) {
            addCriterion("a_time not in", values, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeBetween(Date value1, Date value2) {
            addCriterion("a_time between", value1, value2, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeNotBetween(Date value1, Date value2) {
            addCriterion("a_time not between", value1, value2, "aTime");
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

        public Criteria andASttimeIsNull() {
            addCriterion("a_sttime is null");
            return (Criteria) this;
        }

        public Criteria andASttimeIsNotNull() {
            addCriterion("a_sttime is not null");
            return (Criteria) this;
        }

        public Criteria andASttimeEqualTo(Date value) {
            addCriterion("a_sttime =", value, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeNotEqualTo(Date value) {
            addCriterion("a_sttime <>", value, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeGreaterThan(Date value) {
            addCriterion("a_sttime >", value, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_sttime >=", value, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeLessThan(Date value) {
            addCriterion("a_sttime <", value, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeLessThanOrEqualTo(Date value) {
            addCriterion("a_sttime <=", value, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeIn(List<Date> values) {
            addCriterion("a_sttime in", values, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeNotIn(List<Date> values) {
            addCriterion("a_sttime not in", values, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeBetween(Date value1, Date value2) {
            addCriterion("a_sttime between", value1, value2, "aSttime");
            return (Criteria) this;
        }

        public Criteria andASttimeNotBetween(Date value1, Date value2) {
            addCriterion("a_sttime not between", value1, value2, "aSttime");
            return (Criteria) this;
        }

        public Criteria andAImgIsNull() {
            addCriterion("a_img is null");
            return (Criteria) this;
        }

        public Criteria andAImgIsNotNull() {
            addCriterion("a_img is not null");
            return (Criteria) this;
        }

        public Criteria andAImgEqualTo(String value) {
            addCriterion("a_img =", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotEqualTo(String value) {
            addCriterion("a_img <>", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgGreaterThan(String value) {
            addCriterion("a_img >", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgGreaterThanOrEqualTo(String value) {
            addCriterion("a_img >=", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgLessThan(String value) {
            addCriterion("a_img <", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgLessThanOrEqualTo(String value) {
            addCriterion("a_img <=", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgLike(String value) {
            addCriterion("a_img like", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotLike(String value) {
            addCriterion("a_img not like", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgIn(List<String> values) {
            addCriterion("a_img in", values, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotIn(List<String> values) {
            addCriterion("a_img not in", values, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgBetween(String value1, String value2) {
            addCriterion("a_img between", value1, value2, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotBetween(String value1, String value2) {
            addCriterion("a_img not between", value1, value2, "aImg");
            return (Criteria) this;
        }

        public Criteria andAMeetIsNull() {
            addCriterion("a_meet is null");
            return (Criteria) this;
        }

        public Criteria andAMeetIsNotNull() {
            addCriterion("a_meet is not null");
            return (Criteria) this;
        }

        public Criteria andAMeetEqualTo(Date value) {
            addCriterion("a_meet =", value, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetNotEqualTo(Date value) {
            addCriterion("a_meet <>", value, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetGreaterThan(Date value) {
            addCriterion("a_meet >", value, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetGreaterThanOrEqualTo(Date value) {
            addCriterion("a_meet >=", value, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetLessThan(Date value) {
            addCriterion("a_meet <", value, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetLessThanOrEqualTo(Date value) {
            addCriterion("a_meet <=", value, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetIn(List<Date> values) {
            addCriterion("a_meet in", values, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetNotIn(List<Date> values) {
            addCriterion("a_meet not in", values, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetBetween(Date value1, Date value2) {
            addCriterion("a_meet between", value1, value2, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeetNotBetween(Date value1, Date value2) {
            addCriterion("a_meet not between", value1, value2, "aMeet");
            return (Criteria) this;
        }

        public Criteria andAMeettimeIsNull() {
            addCriterion("a_meettime is null");
            return (Criteria) this;
        }

        public Criteria andAMeettimeIsNotNull() {
            addCriterion("a_meettime is not null");
            return (Criteria) this;
        }

        public Criteria andAMeettimeEqualTo(Long value) {
            addCriterion("a_meettime =", value, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeNotEqualTo(Long value) {
            addCriterion("a_meettime <>", value, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeGreaterThan(Long value) {
            addCriterion("a_meettime >", value, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeGreaterThanOrEqualTo(Long value) {
            addCriterion("a_meettime >=", value, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeLessThan(Long value) {
            addCriterion("a_meettime <", value, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeLessThanOrEqualTo(Long value) {
            addCriterion("a_meettime <=", value, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeIn(List<Long> values) {
            addCriterion("a_meettime in", values, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeNotIn(List<Long> values) {
            addCriterion("a_meettime not in", values, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeBetween(Long value1, Long value2) {
            addCriterion("a_meettime between", value1, value2, "aMeettime");
            return (Criteria) this;
        }

        public Criteria andAMeettimeNotBetween(Long value1, Long value2) {
            addCriterion("a_meettime not between", value1, value2, "aMeettime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table alongrecord
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
     * This class corresponds to the database table alongrecord
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