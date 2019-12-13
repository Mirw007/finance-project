package com.qf.j1906.po;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPdcIdIsNull() {
            addCriterion("pdc_id is null");
            return (Criteria) this;
        }

        public Criteria andPdcIdIsNotNull() {
            addCriterion("pdc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdcIdEqualTo(Long value) {
            addCriterion("pdc_id =", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdNotEqualTo(Long value) {
            addCriterion("pdc_id <>", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdGreaterThan(Long value) {
            addCriterion("pdc_id >", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pdc_id >=", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdLessThan(Long value) {
            addCriterion("pdc_id <", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdLessThanOrEqualTo(Long value) {
            addCriterion("pdc_id <=", value, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdIn(List<Long> values) {
            addCriterion("pdc_id in", values, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdNotIn(List<Long> values) {
            addCriterion("pdc_id not in", values, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdBetween(Long value1, Long value2) {
            addCriterion("pdc_id between", value1, value2, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcIdNotBetween(Long value1, Long value2) {
            addCriterion("pdc_id not between", value1, value2, "pdcId");
            return (Criteria) this;
        }

        public Criteria andPdcNameIsNull() {
            addCriterion("pdc_name is null");
            return (Criteria) this;
        }

        public Criteria andPdcNameIsNotNull() {
            addCriterion("pdc_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdcNameEqualTo(String value) {
            addCriterion("pdc_name =", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameNotEqualTo(String value) {
            addCriterion("pdc_name <>", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameGreaterThan(String value) {
            addCriterion("pdc_name >", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdc_name >=", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameLessThan(String value) {
            addCriterion("pdc_name <", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameLessThanOrEqualTo(String value) {
            addCriterion("pdc_name <=", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameLike(String value) {
            addCriterion("pdc_name like", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameNotLike(String value) {
            addCriterion("pdc_name not like", value, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameIn(List<String> values) {
            addCriterion("pdc_name in", values, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameNotIn(List<String> values) {
            addCriterion("pdc_name not in", values, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameBetween(String value1, String value2) {
            addCriterion("pdc_name between", value1, value2, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcNameNotBetween(String value1, String value2) {
            addCriterion("pdc_name not between", value1, value2, "pdcName");
            return (Criteria) this;
        }

        public Criteria andPdcRiskIsNull() {
            addCriterion("pdc_risk is null");
            return (Criteria) this;
        }

        public Criteria andPdcRiskIsNotNull() {
            addCriterion("pdc_risk is not null");
            return (Criteria) this;
        }

        public Criteria andPdcRiskEqualTo(String value) {
            addCriterion("pdc_risk =", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskNotEqualTo(String value) {
            addCriterion("pdc_risk <>", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskGreaterThan(String value) {
            addCriterion("pdc_risk >", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskGreaterThanOrEqualTo(String value) {
            addCriterion("pdc_risk >=", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskLessThan(String value) {
            addCriterion("pdc_risk <", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskLessThanOrEqualTo(String value) {
            addCriterion("pdc_risk <=", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskLike(String value) {
            addCriterion("pdc_risk like", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskNotLike(String value) {
            addCriterion("pdc_risk not like", value, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskIn(List<String> values) {
            addCriterion("pdc_risk in", values, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskNotIn(List<String> values) {
            addCriterion("pdc_risk not in", values, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskBetween(String value1, String value2) {
            addCriterion("pdc_risk between", value1, value2, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcRiskNotBetween(String value1, String value2) {
            addCriterion("pdc_risk not between", value1, value2, "pdcRisk");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineIsNull() {
            addCriterion("pdc_deadline is null");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineIsNotNull() {
            addCriterion("pdc_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineEqualTo(String value) {
            addCriterion("pdc_deadline =", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineNotEqualTo(String value) {
            addCriterion("pdc_deadline <>", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineGreaterThan(String value) {
            addCriterion("pdc_deadline >", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("pdc_deadline >=", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineLessThan(String value) {
            addCriterion("pdc_deadline <", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineLessThanOrEqualTo(String value) {
            addCriterion("pdc_deadline <=", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineLike(String value) {
            addCriterion("pdc_deadline like", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineNotLike(String value) {
            addCriterion("pdc_deadline not like", value, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineIn(List<String> values) {
            addCriterion("pdc_deadline in", values, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineNotIn(List<String> values) {
            addCriterion("pdc_deadline not in", values, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineBetween(String value1, String value2) {
            addCriterion("pdc_deadline between", value1, value2, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcDeadlineNotBetween(String value1, String value2) {
            addCriterion("pdc_deadline not between", value1, value2, "pdcDeadline");
            return (Criteria) this;
        }

        public Criteria andPdcCodeIsNull() {
            addCriterion("pdc_code is null");
            return (Criteria) this;
        }

        public Criteria andPdcCodeIsNotNull() {
            addCriterion("pdc_code is not null");
            return (Criteria) this;
        }

        public Criteria andPdcCodeEqualTo(Long value) {
            addCriterion("pdc_code =", value, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeNotEqualTo(Long value) {
            addCriterion("pdc_code <>", value, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeGreaterThan(Long value) {
            addCriterion("pdc_code >", value, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("pdc_code >=", value, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeLessThan(Long value) {
            addCriterion("pdc_code <", value, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeLessThanOrEqualTo(Long value) {
            addCriterion("pdc_code <=", value, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeIn(List<Long> values) {
            addCriterion("pdc_code in", values, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeNotIn(List<Long> values) {
            addCriterion("pdc_code not in", values, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeBetween(Long value1, Long value2) {
            addCriterion("pdc_code between", value1, value2, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcCodeNotBetween(Long value1, Long value2) {
            addCriterion("pdc_code not between", value1, value2, "pdcCode");
            return (Criteria) this;
        }

        public Criteria andPdcTypeIsNull() {
            addCriterion("pdc_type is null");
            return (Criteria) this;
        }

        public Criteria andPdcTypeIsNotNull() {
            addCriterion("pdc_type is not null");
            return (Criteria) this;
        }

        public Criteria andPdcTypeEqualTo(String value) {
            addCriterion("pdc_type =", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeNotEqualTo(String value) {
            addCriterion("pdc_type <>", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeGreaterThan(String value) {
            addCriterion("pdc_type >", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pdc_type >=", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeLessThan(String value) {
            addCriterion("pdc_type <", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeLessThanOrEqualTo(String value) {
            addCriterion("pdc_type <=", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeLike(String value) {
            addCriterion("pdc_type like", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeNotLike(String value) {
            addCriterion("pdc_type not like", value, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeIn(List<String> values) {
            addCriterion("pdc_type in", values, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeNotIn(List<String> values) {
            addCriterion("pdc_type not in", values, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeBetween(String value1, String value2) {
            addCriterion("pdc_type between", value1, value2, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcTypeNotBetween(String value1, String value2) {
            addCriterion("pdc_type not between", value1, value2, "pdcType");
            return (Criteria) this;
        }

        public Criteria andPdcValueIsNull() {
            addCriterion("pdc_value is null");
            return (Criteria) this;
        }

        public Criteria andPdcValueIsNotNull() {
            addCriterion("pdc_value is not null");
            return (Criteria) this;
        }

        public Criteria andPdcValueEqualTo(Double value) {
            addCriterion("pdc_value =", value, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueNotEqualTo(Double value) {
            addCriterion("pdc_value <>", value, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueGreaterThan(Double value) {
            addCriterion("pdc_value >", value, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueGreaterThanOrEqualTo(Double value) {
            addCriterion("pdc_value >=", value, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueLessThan(Double value) {
            addCriterion("pdc_value <", value, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueLessThanOrEqualTo(Double value) {
            addCriterion("pdc_value <=", value, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueIn(List<Double> values) {
            addCriterion("pdc_value in", values, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueNotIn(List<Double> values) {
            addCriterion("pdc_value not in", values, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueBetween(Double value1, Double value2) {
            addCriterion("pdc_value between", value1, value2, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcValueNotBetween(Double value1, Double value2) {
            addCriterion("pdc_value not between", value1, value2, "pdcValue");
            return (Criteria) this;
        }

        public Criteria andPdcLevelIsNull() {
            addCriterion("pdc_level is null");
            return (Criteria) this;
        }

        public Criteria andPdcLevelIsNotNull() {
            addCriterion("pdc_level is not null");
            return (Criteria) this;
        }

        public Criteria andPdcLevelEqualTo(Integer value) {
            addCriterion("pdc_level =", value, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelNotEqualTo(Integer value) {
            addCriterion("pdc_level <>", value, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelGreaterThan(Integer value) {
            addCriterion("pdc_level >", value, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdc_level >=", value, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelLessThan(Integer value) {
            addCriterion("pdc_level <", value, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelLessThanOrEqualTo(Integer value) {
            addCriterion("pdc_level <=", value, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelIn(List<Integer> values) {
            addCriterion("pdc_level in", values, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelNotIn(List<Integer> values) {
            addCriterion("pdc_level not in", values, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelBetween(Integer value1, Integer value2) {
            addCriterion("pdc_level between", value1, value2, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("pdc_level not between", value1, value2, "pdcLevel");
            return (Criteria) this;
        }

        public Criteria andPdcPriceIsNull() {
            addCriterion("pdc_price is null");
            return (Criteria) this;
        }

        public Criteria andPdcPriceIsNotNull() {
            addCriterion("pdc_price is not null");
            return (Criteria) this;
        }

        public Criteria andPdcPriceEqualTo(Double value) {
            addCriterion("pdc_price =", value, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceNotEqualTo(Double value) {
            addCriterion("pdc_price <>", value, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceGreaterThan(Double value) {
            addCriterion("pdc_price >", value, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pdc_price >=", value, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceLessThan(Double value) {
            addCriterion("pdc_price <", value, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceLessThanOrEqualTo(Double value) {
            addCriterion("pdc_price <=", value, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceIn(List<Double> values) {
            addCriterion("pdc_price in", values, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceNotIn(List<Double> values) {
            addCriterion("pdc_price not in", values, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceBetween(Double value1, Double value2) {
            addCriterion("pdc_price between", value1, value2, "pdcPrice");
            return (Criteria) this;
        }

        public Criteria andPdcPriceNotBetween(Double value1, Double value2) {
            addCriterion("pdc_price not between", value1, value2, "pdcPrice");
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