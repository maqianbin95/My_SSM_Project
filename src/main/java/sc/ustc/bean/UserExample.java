package sc.ustc.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUnicknameIsNull() {
            addCriterion("unickname is null");
            return (Criteria) this;
        }

        public Criteria andUnicknameIsNotNull() {
            addCriterion("unickname is not null");
            return (Criteria) this;
        }

        public Criteria andUnicknameEqualTo(String value) {
            addCriterion("unickname =", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotEqualTo(String value) {
            addCriterion("unickname <>", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameGreaterThan(String value) {
            addCriterion("unickname >", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("unickname >=", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLessThan(String value) {
            addCriterion("unickname <", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLessThanOrEqualTo(String value) {
            addCriterion("unickname <=", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLike(String value) {
            addCriterion("unickname like", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotLike(String value) {
            addCriterion("unickname not like", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameIn(List<String> values) {
            addCriterion("unickname in", values, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotIn(List<String> values) {
            addCriterion("unickname not in", values, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameBetween(String value1, String value2) {
            addCriterion("unickname between", value1, value2, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotBetween(String value1, String value2) {
            addCriterion("unickname not between", value1, value2, "unickname");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNull() {
            addCriterion("ugender is null");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNotNull() {
            addCriterion("ugender is not null");
            return (Criteria) this;
        }

        public Criteria andUgenderEqualTo(String value) {
            addCriterion("ugender =", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotEqualTo(String value) {
            addCriterion("ugender <>", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThan(String value) {
            addCriterion("ugender >", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThanOrEqualTo(String value) {
            addCriterion("ugender >=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThan(String value) {
            addCriterion("ugender <", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThanOrEqualTo(String value) {
            addCriterion("ugender <=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLike(String value) {
            addCriterion("ugender like", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotLike(String value) {
            addCriterion("ugender not like", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderIn(List<String> values) {
            addCriterion("ugender in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotIn(List<String> values) {
            addCriterion("ugender not in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderBetween(String value1, String value2) {
            addCriterion("ugender between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotBetween(String value1, String value2) {
            addCriterion("ugender not between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUphonenumberIsNull() {
            addCriterion("uphonenumber is null");
            return (Criteria) this;
        }

        public Criteria andUphonenumberIsNotNull() {
            addCriterion("uphonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andUphonenumberEqualTo(String value) {
            addCriterion("uphonenumber =", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberNotEqualTo(String value) {
            addCriterion("uphonenumber <>", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberGreaterThan(String value) {
            addCriterion("uphonenumber >", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("uphonenumber >=", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberLessThan(String value) {
            addCriterion("uphonenumber <", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberLessThanOrEqualTo(String value) {
            addCriterion("uphonenumber <=", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberLike(String value) {
            addCriterion("uphonenumber like", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberNotLike(String value) {
            addCriterion("uphonenumber not like", value, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberIn(List<String> values) {
            addCriterion("uphonenumber in", values, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberNotIn(List<String> values) {
            addCriterion("uphonenumber not in", values, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberBetween(String value1, String value2) {
            addCriterion("uphonenumber between", value1, value2, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUphonenumberNotBetween(String value1, String value2) {
            addCriterion("uphonenumber not between", value1, value2, "uphonenumber");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUqqIsNull() {
            addCriterion("uQQ is null");
            return (Criteria) this;
        }

        public Criteria andUqqIsNotNull() {
            addCriterion("uQQ is not null");
            return (Criteria) this;
        }

        public Criteria andUqqEqualTo(String value) {
            addCriterion("uQQ =", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotEqualTo(String value) {
            addCriterion("uQQ <>", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqGreaterThan(String value) {
            addCriterion("uQQ >", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqGreaterThanOrEqualTo(String value) {
            addCriterion("uQQ >=", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLessThan(String value) {
            addCriterion("uQQ <", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLessThanOrEqualTo(String value) {
            addCriterion("uQQ <=", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLike(String value) {
            addCriterion("uQQ like", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotLike(String value) {
            addCriterion("uQQ not like", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqIn(List<String> values) {
            addCriterion("uQQ in", values, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotIn(List<String> values) {
            addCriterion("uQQ not in", values, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqBetween(String value1, String value2) {
            addCriterion("uQQ between", value1, value2, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotBetween(String value1, String value2) {
            addCriterion("uQQ not between", value1, value2, "uqq");
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