package sc.ustc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswersExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
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

        public Criteria andAdetailIsNull() {
            addCriterion("adetail is null");
            return (Criteria) this;
        }

        public Criteria andAdetailIsNotNull() {
            addCriterion("adetail is not null");
            return (Criteria) this;
        }

        public Criteria andAdetailEqualTo(String value) {
            addCriterion("adetail =", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotEqualTo(String value) {
            addCriterion("adetail <>", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailGreaterThan(String value) {
            addCriterion("adetail >", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailGreaterThanOrEqualTo(String value) {
            addCriterion("adetail >=", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailLessThan(String value) {
            addCriterion("adetail <", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailLessThanOrEqualTo(String value) {
            addCriterion("adetail <=", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailLike(String value) {
            addCriterion("adetail like", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotLike(String value) {
            addCriterion("adetail not like", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailIn(List<String> values) {
            addCriterion("adetail in", values, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotIn(List<String> values) {
            addCriterion("adetail not in", values, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailBetween(String value1, String value2) {
            addCriterion("adetail between", value1, value2, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotBetween(String value1, String value2) {
            addCriterion("adetail not between", value1, value2, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdateIsNull() {
            addCriterion("adate is null");
            return (Criteria) this;
        }

        public Criteria andAdateIsNotNull() {
            addCriterion("adate is not null");
            return (Criteria) this;
        }

        public Criteria andAdateEqualTo(Date value) {
            addCriterion("adate =", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotEqualTo(Date value) {
            addCriterion("adate <>", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThan(Date value) {
            addCriterion("adate >", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThanOrEqualTo(Date value) {
            addCriterion("adate >=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThan(Date value) {
            addCriterion("adate <", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThanOrEqualTo(Date value) {
            addCriterion("adate <=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateIn(List<Date> values) {
            addCriterion("adate in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotIn(List<Date> values) {
            addCriterion("adate not in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateBetween(Date value1, Date value2) {
            addCriterion("adate between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotBetween(Date value1, Date value2) {
            addCriterion("adate not between", value1, value2, "adate");
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

        public Criteria andAdminidIsNull() {
            addCriterion("adminid is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminid is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminid =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminid <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminid >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminid >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminid <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminid <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminid in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminid not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminid between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminid not between", value1, value2, "adminid");
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