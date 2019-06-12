package sc.ustc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionsExample() {
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

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Integer value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Integer value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Integer value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Integer value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Integer value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Integer> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Integer> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Integer value1, Integer value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Integer value1, Integer value2) {
            addCriterion("qid not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNull() {
            addCriterion("qtype is null");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNotNull() {
            addCriterion("qtype is not null");
            return (Criteria) this;
        }

        public Criteria andQtypeEqualTo(String value) {
            addCriterion("qtype =", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotEqualTo(String value) {
            addCriterion("qtype <>", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThan(String value) {
            addCriterion("qtype >", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThanOrEqualTo(String value) {
            addCriterion("qtype >=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThan(String value) {
            addCriterion("qtype <", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThanOrEqualTo(String value) {
            addCriterion("qtype <=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLike(String value) {
            addCriterion("qtype like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotLike(String value) {
            addCriterion("qtype not like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeIn(List<String> values) {
            addCriterion("qtype in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotIn(List<String> values) {
            addCriterion("qtype not in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeBetween(String value1, String value2) {
            addCriterion("qtype between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotBetween(String value1, String value2) {
            addCriterion("qtype not between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQsummaryIsNull() {
            addCriterion("qsummary is null");
            return (Criteria) this;
        }

        public Criteria andQsummaryIsNotNull() {
            addCriterion("qsummary is not null");
            return (Criteria) this;
        }

        public Criteria andQsummaryEqualTo(String value) {
            addCriterion("qsummary =", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryNotEqualTo(String value) {
            addCriterion("qsummary <>", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryGreaterThan(String value) {
            addCriterion("qsummary >", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryGreaterThanOrEqualTo(String value) {
            addCriterion("qsummary >=", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryLessThan(String value) {
            addCriterion("qsummary <", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryLessThanOrEqualTo(String value) {
            addCriterion("qsummary <=", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryLike(String value) {
            addCriterion("qsummary like", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryNotLike(String value) {
            addCriterion("qsummary not like", value, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryIn(List<String> values) {
            addCriterion("qsummary in", values, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryNotIn(List<String> values) {
            addCriterion("qsummary not in", values, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryBetween(String value1, String value2) {
            addCriterion("qsummary between", value1, value2, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQsummaryNotBetween(String value1, String value2) {
            addCriterion("qsummary not between", value1, value2, "qsummary");
            return (Criteria) this;
        }

        public Criteria andQdetailIsNull() {
            addCriterion("qdetail is null");
            return (Criteria) this;
        }

        public Criteria andQdetailIsNotNull() {
            addCriterion("qdetail is not null");
            return (Criteria) this;
        }

        public Criteria andQdetailEqualTo(String value) {
            addCriterion("qdetail =", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailNotEqualTo(String value) {
            addCriterion("qdetail <>", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailGreaterThan(String value) {
            addCriterion("qdetail >", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailGreaterThanOrEqualTo(String value) {
            addCriterion("qdetail >=", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailLessThan(String value) {
            addCriterion("qdetail <", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailLessThanOrEqualTo(String value) {
            addCriterion("qdetail <=", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailLike(String value) {
            addCriterion("qdetail like", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailNotLike(String value) {
            addCriterion("qdetail not like", value, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailIn(List<String> values) {
            addCriterion("qdetail in", values, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailNotIn(List<String> values) {
            addCriterion("qdetail not in", values, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailBetween(String value1, String value2) {
            addCriterion("qdetail between", value1, value2, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdetailNotBetween(String value1, String value2) {
            addCriterion("qdetail not between", value1, value2, "qdetail");
            return (Criteria) this;
        }

        public Criteria andQdateIsNull() {
            addCriterion("qdate is null");
            return (Criteria) this;
        }

        public Criteria andQdateIsNotNull() {
            addCriterion("qdate is not null");
            return (Criteria) this;
        }

        public Criteria andQdateEqualTo(Date value) {
            addCriterion("qdate =", value, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateNotEqualTo(Date value) {
            addCriterion("qdate <>", value, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateGreaterThan(Date value) {
            addCriterion("qdate >", value, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateGreaterThanOrEqualTo(Date value) {
            addCriterion("qdate >=", value, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateLessThan(Date value) {
            addCriterion("qdate <", value, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateLessThanOrEqualTo(Date value) {
            addCriterion("qdate <=", value, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateIn(List<Date> values) {
            addCriterion("qdate in", values, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateNotIn(List<Date> values) {
            addCriterion("qdate not in", values, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateBetween(Date value1, Date value2) {
            addCriterion("qdate between", value1, value2, "qdate");
            return (Criteria) this;
        }

        public Criteria andQdateNotBetween(Date value1, Date value2) {
            addCriterion("qdate not between", value1, value2, "qdate");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andHasreadIsNull() {
            addCriterion("hasread is null");
            return (Criteria) this;
        }

        public Criteria andHasreadIsNotNull() {
            addCriterion("hasread is not null");
            return (Criteria) this;
        }

        public Criteria andHasreadEqualTo(Boolean value) {
            addCriterion("hasread =", value, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadNotEqualTo(Boolean value) {
            addCriterion("hasread <>", value, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadGreaterThan(Boolean value) {
            addCriterion("hasread >", value, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasread >=", value, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadLessThan(Boolean value) {
            addCriterion("hasread <", value, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadLessThanOrEqualTo(Boolean value) {
            addCriterion("hasread <=", value, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadIn(List<Boolean> values) {
            addCriterion("hasread in", values, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadNotIn(List<Boolean> values) {
            addCriterion("hasread not in", values, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadBetween(Boolean value1, Boolean value2) {
            addCriterion("hasread between", value1, value2, "hasread");
            return (Criteria) this;
        }

        public Criteria andHasreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasread not between", value1, value2, "hasread");
            return (Criteria) this;
        }

        public Criteria andIsAdviseIsNull() {
            addCriterion("is_advise is null");
            return (Criteria) this;
        }

        public Criteria andIsAdviseIsNotNull() {
            addCriterion("is_advise is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdviseEqualTo(Boolean value) {
            addCriterion("is_advise =", value, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseNotEqualTo(Boolean value) {
            addCriterion("is_advise <>", value, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseGreaterThan(Boolean value) {
            addCriterion("is_advise >", value, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_advise >=", value, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseLessThan(Boolean value) {
            addCriterion("is_advise <", value, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_advise <=", value, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseIn(List<Boolean> values) {
            addCriterion("is_advise in", values, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseNotIn(List<Boolean> values) {
            addCriterion("is_advise not in", values, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_advise between", value1, value2, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andIsAdviseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_advise not between", value1, value2, "isAdvise");
            return (Criteria) this;
        }

        public Criteria andQcountryIsNull() {
            addCriterion("qcountry is null");
            return (Criteria) this;
        }

        public Criteria andQcountryIsNotNull() {
            addCriterion("qcountry is not null");
            return (Criteria) this;
        }

        public Criteria andQcountryEqualTo(String value) {
            addCriterion("qcountry =", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryNotEqualTo(String value) {
            addCriterion("qcountry <>", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryGreaterThan(String value) {
            addCriterion("qcountry >", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryGreaterThanOrEqualTo(String value) {
            addCriterion("qcountry >=", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryLessThan(String value) {
            addCriterion("qcountry <", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryLessThanOrEqualTo(String value) {
            addCriterion("qcountry <=", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryLike(String value) {
            addCriterion("qcountry like", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryNotLike(String value) {
            addCriterion("qcountry not like", value, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryIn(List<String> values) {
            addCriterion("qcountry in", values, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryNotIn(List<String> values) {
            addCriterion("qcountry not in", values, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryBetween(String value1, String value2) {
            addCriterion("qcountry between", value1, value2, "qcountry");
            return (Criteria) this;
        }

        public Criteria andQcountryNotBetween(String value1, String value2) {
            addCriterion("qcountry not between", value1, value2, "qcountry");
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