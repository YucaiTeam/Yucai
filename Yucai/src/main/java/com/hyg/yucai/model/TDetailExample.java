package com.hyg.yucai.model;

import java.util.ArrayList;
import java.util.List;

public class TDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDetailExample() {
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

        public Criteria andDetailidIsNull() {
            addCriterion("detailId is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("detailId is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(Integer value) {
            addCriterion("detailId =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(Integer value) {
            addCriterion("detailId <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(Integer value) {
            addCriterion("detailId >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detailId >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(Integer value) {
            addCriterion("detailId <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(Integer value) {
            addCriterion("detailId <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<Integer> values) {
            addCriterion("detailId in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<Integer> values) {
            addCriterion("detailId not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(Integer value1, Integer value2) {
            addCriterion("detailId between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("detailId not between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailcontentIsNull() {
            addCriterion("detailContent is null");
            return (Criteria) this;
        }

        public Criteria andDetailcontentIsNotNull() {
            addCriterion("detailContent is not null");
            return (Criteria) this;
        }

        public Criteria andDetailcontentEqualTo(String value) {
            addCriterion("detailContent =", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentNotEqualTo(String value) {
            addCriterion("detailContent <>", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentGreaterThan(String value) {
            addCriterion("detailContent >", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentGreaterThanOrEqualTo(String value) {
            addCriterion("detailContent >=", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentLessThan(String value) {
            addCriterion("detailContent <", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentLessThanOrEqualTo(String value) {
            addCriterion("detailContent <=", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentLike(String value) {
            addCriterion("detailContent like", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentNotLike(String value) {
            addCriterion("detailContent not like", value, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentIn(List<String> values) {
            addCriterion("detailContent in", values, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentNotIn(List<String> values) {
            addCriterion("detailContent not in", values, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentBetween(String value1, String value2) {
            addCriterion("detailContent between", value1, value2, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailcontentNotBetween(String value1, String value2) {
            addCriterion("detailContent not between", value1, value2, "detailcontent");
            return (Criteria) this;
        }

        public Criteria andDetailpriceIsNull() {
            addCriterion("detailPrice is null");
            return (Criteria) this;
        }

        public Criteria andDetailpriceIsNotNull() {
            addCriterion("detailPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDetailpriceEqualTo(String value) {
            addCriterion("detailPrice =", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceNotEqualTo(String value) {
            addCriterion("detailPrice <>", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceGreaterThan(String value) {
            addCriterion("detailPrice >", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceGreaterThanOrEqualTo(String value) {
            addCriterion("detailPrice >=", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceLessThan(String value) {
            addCriterion("detailPrice <", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceLessThanOrEqualTo(String value) {
            addCriterion("detailPrice <=", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceLike(String value) {
            addCriterion("detailPrice like", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceNotLike(String value) {
            addCriterion("detailPrice not like", value, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceIn(List<String> values) {
            addCriterion("detailPrice in", values, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceNotIn(List<String> values) {
            addCriterion("detailPrice not in", values, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceBetween(String value1, String value2) {
            addCriterion("detailPrice between", value1, value2, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpriceNotBetween(String value1, String value2) {
            addCriterion("detailPrice not between", value1, value2, "detailprice");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleIsNull() {
            addCriterion("detailPeople is null");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleIsNotNull() {
            addCriterion("detailPeople is not null");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleEqualTo(String value) {
            addCriterion("detailPeople =", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleNotEqualTo(String value) {
            addCriterion("detailPeople <>", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleGreaterThan(String value) {
            addCriterion("detailPeople >", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("detailPeople >=", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleLessThan(String value) {
            addCriterion("detailPeople <", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleLessThanOrEqualTo(String value) {
            addCriterion("detailPeople <=", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleLike(String value) {
            addCriterion("detailPeople like", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleNotLike(String value) {
            addCriterion("detailPeople not like", value, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleIn(List<String> values) {
            addCriterion("detailPeople in", values, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleNotIn(List<String> values) {
            addCriterion("detailPeople not in", values, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleBetween(String value1, String value2) {
            addCriterion("detailPeople between", value1, value2, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetailpeopleNotBetween(String value1, String value2) {
            addCriterion("detailPeople not between", value1, value2, "detailpeople");
            return (Criteria) this;
        }

        public Criteria andDetaileffectIsNull() {
            addCriterion("detailEffect is null");
            return (Criteria) this;
        }

        public Criteria andDetaileffectIsNotNull() {
            addCriterion("detailEffect is not null");
            return (Criteria) this;
        }

        public Criteria andDetaileffectEqualTo(String value) {
            addCriterion("detailEffect =", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectNotEqualTo(String value) {
            addCriterion("detailEffect <>", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectGreaterThan(String value) {
            addCriterion("detailEffect >", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectGreaterThanOrEqualTo(String value) {
            addCriterion("detailEffect >=", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectLessThan(String value) {
            addCriterion("detailEffect <", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectLessThanOrEqualTo(String value) {
            addCriterion("detailEffect <=", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectLike(String value) {
            addCriterion("detailEffect like", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectNotLike(String value) {
            addCriterion("detailEffect not like", value, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectIn(List<String> values) {
            addCriterion("detailEffect in", values, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectNotIn(List<String> values) {
            addCriterion("detailEffect not in", values, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectBetween(String value1, String value2) {
            addCriterion("detailEffect between", value1, value2, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andDetaileffectNotBetween(String value1, String value2) {
            addCriterion("detailEffect not between", value1, value2, "detaileffect");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andStandbyField01IsNull() {
            addCriterion("standby_field_01 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyField01IsNotNull() {
            addCriterion("standby_field_01 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyField01EqualTo(String value) {
            addCriterion("standby_field_01 =", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotEqualTo(String value) {
            addCriterion("standby_field_01 <>", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01GreaterThan(String value) {
            addCriterion("standby_field_01 >", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01GreaterThanOrEqualTo(String value) {
            addCriterion("standby_field_01 >=", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01LessThan(String value) {
            addCriterion("standby_field_01 <", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01LessThanOrEqualTo(String value) {
            addCriterion("standby_field_01 <=", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01Like(String value) {
            addCriterion("standby_field_01 like", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotLike(String value) {
            addCriterion("standby_field_01 not like", value, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01In(List<String> values) {
            addCriterion("standby_field_01 in", values, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotIn(List<String> values) {
            addCriterion("standby_field_01 not in", values, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01Between(String value1, String value2) {
            addCriterion("standby_field_01 between", value1, value2, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField01NotBetween(String value1, String value2) {
            addCriterion("standby_field_01 not between", value1, value2, "standbyField01");
            return (Criteria) this;
        }

        public Criteria andStandbyField02IsNull() {
            addCriterion("standby_field_02 is null");
            return (Criteria) this;
        }

        public Criteria andStandbyField02IsNotNull() {
            addCriterion("standby_field_02 is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyField02EqualTo(String value) {
            addCriterion("standby_field_02 =", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotEqualTo(String value) {
            addCriterion("standby_field_02 <>", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02GreaterThan(String value) {
            addCriterion("standby_field_02 >", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02GreaterThanOrEqualTo(String value) {
            addCriterion("standby_field_02 >=", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02LessThan(String value) {
            addCriterion("standby_field_02 <", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02LessThanOrEqualTo(String value) {
            addCriterion("standby_field_02 <=", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02Like(String value) {
            addCriterion("standby_field_02 like", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotLike(String value) {
            addCriterion("standby_field_02 not like", value, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02In(List<String> values) {
            addCriterion("standby_field_02 in", values, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotIn(List<String> values) {
            addCriterion("standby_field_02 not in", values, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02Between(String value1, String value2) {
            addCriterion("standby_field_02 between", value1, value2, "standbyField02");
            return (Criteria) this;
        }

        public Criteria andStandbyField02NotBetween(String value1, String value2) {
            addCriterion("standby_field_02 not between", value1, value2, "standbyField02");
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