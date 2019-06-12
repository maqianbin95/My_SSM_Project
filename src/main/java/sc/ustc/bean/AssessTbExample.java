package sc.ustc.bean;

import java.util.ArrayList;
import java.util.List;

public class AssessTbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessTbExample() {
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

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
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
            addCriterion("uqq is null");
            return (Criteria) this;
        }

        public Criteria andUqqIsNotNull() {
            addCriterion("uqq is not null");
            return (Criteria) this;
        }

        public Criteria andUqqEqualTo(String value) {
            addCriterion("uqq =", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotEqualTo(String value) {
            addCriterion("uqq <>", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqGreaterThan(String value) {
            addCriterion("uqq >", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqGreaterThanOrEqualTo(String value) {
            addCriterion("uqq >=", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLessThan(String value) {
            addCriterion("uqq <", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLessThanOrEqualTo(String value) {
            addCriterion("uqq <=", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqLike(String value) {
            addCriterion("uqq like", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotLike(String value) {
            addCriterion("uqq not like", value, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqIn(List<String> values) {
            addCriterion("uqq in", values, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotIn(List<String> values) {
            addCriterion("uqq not in", values, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqBetween(String value1, String value2) {
            addCriterion("uqq between", value1, value2, "uqq");
            return (Criteria) this;
        }

        public Criteria andUqqNotBetween(String value1, String value2) {
            addCriterion("uqq not between", value1, value2, "uqq");
            return (Criteria) this;
        }

        public Criteria andCountriesIsNull() {
            addCriterion("countries is null");
            return (Criteria) this;
        }

        public Criteria andCountriesIsNotNull() {
            addCriterion("countries is not null");
            return (Criteria) this;
        }

        public Criteria andCountriesEqualTo(String value) {
            addCriterion("countries =", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotEqualTo(String value) {
            addCriterion("countries <>", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesGreaterThan(String value) {
            addCriterion("countries >", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesGreaterThanOrEqualTo(String value) {
            addCriterion("countries >=", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesLessThan(String value) {
            addCriterion("countries <", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesLessThanOrEqualTo(String value) {
            addCriterion("countries <=", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesLike(String value) {
            addCriterion("countries like", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotLike(String value) {
            addCriterion("countries not like", value, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesIn(List<String> values) {
            addCriterion("countries in", values, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotIn(List<String> values) {
            addCriterion("countries not in", values, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesBetween(String value1, String value2) {
            addCriterion("countries between", value1, value2, "countries");
            return (Criteria) this;
        }

        public Criteria andCountriesNotBetween(String value1, String value2) {
            addCriterion("countries not between", value1, value2, "countries");
            return (Criteria) this;
        }

        public Criteria andTargetEducationIsNull() {
            addCriterion("target_education is null");
            return (Criteria) this;
        }

        public Criteria andTargetEducationIsNotNull() {
            addCriterion("target_education is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEducationEqualTo(String value) {
            addCriterion("target_education =", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationNotEqualTo(String value) {
            addCriterion("target_education <>", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationGreaterThan(String value) {
            addCriterion("target_education >", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationGreaterThanOrEqualTo(String value) {
            addCriterion("target_education >=", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationLessThan(String value) {
            addCriterion("target_education <", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationLessThanOrEqualTo(String value) {
            addCriterion("target_education <=", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationLike(String value) {
            addCriterion("target_education like", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationNotLike(String value) {
            addCriterion("target_education not like", value, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationIn(List<String> values) {
            addCriterion("target_education in", values, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationNotIn(List<String> values) {
            addCriterion("target_education not in", values, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationBetween(String value1, String value2) {
            addCriterion("target_education between", value1, value2, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetEducationNotBetween(String value1, String value2) {
            addCriterion("target_education not between", value1, value2, "targetEducation");
            return (Criteria) this;
        }

        public Criteria andTargetMajorIsNull() {
            addCriterion("target_major is null");
            return (Criteria) this;
        }

        public Criteria andTargetMajorIsNotNull() {
            addCriterion("target_major is not null");
            return (Criteria) this;
        }

        public Criteria andTargetMajorEqualTo(String value) {
            addCriterion("target_major =", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorNotEqualTo(String value) {
            addCriterion("target_major <>", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorGreaterThan(String value) {
            addCriterion("target_major >", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorGreaterThanOrEqualTo(String value) {
            addCriterion("target_major >=", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorLessThan(String value) {
            addCriterion("target_major <", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorLessThanOrEqualTo(String value) {
            addCriterion("target_major <=", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorLike(String value) {
            addCriterion("target_major like", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorNotLike(String value) {
            addCriterion("target_major not like", value, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorIn(List<String> values) {
            addCriterion("target_major in", values, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorNotIn(List<String> values) {
            addCriterion("target_major not in", values, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorBetween(String value1, String value2) {
            addCriterion("target_major between", value1, value2, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andTargetMajorNotBetween(String value1, String value2) {
            addCriterion("target_major not between", value1, value2, "targetMajor");
            return (Criteria) this;
        }

        public Criteria andStudyDateIsNull() {
            addCriterion("study_date is null");
            return (Criteria) this;
        }

        public Criteria andStudyDateIsNotNull() {
            addCriterion("study_date is not null");
            return (Criteria) this;
        }

        public Criteria andStudyDateEqualTo(String value) {
            addCriterion("study_date =", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotEqualTo(String value) {
            addCriterion("study_date <>", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateGreaterThan(String value) {
            addCriterion("study_date >", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateGreaterThanOrEqualTo(String value) {
            addCriterion("study_date >=", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLessThan(String value) {
            addCriterion("study_date <", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLessThanOrEqualTo(String value) {
            addCriterion("study_date <=", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLike(String value) {
            addCriterion("study_date like", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotLike(String value) {
            addCriterion("study_date not like", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateIn(List<String> values) {
            addCriterion("study_date in", values, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotIn(List<String> values) {
            addCriterion("study_date not in", values, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateBetween(String value1, String value2) {
            addCriterion("study_date between", value1, value2, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotBetween(String value1, String value2) {
            addCriterion("study_date not between", value1, value2, "studyDate");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNull() {
            addCriterion("budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(String value) {
            addCriterion("budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(String value) {
            addCriterion("budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(String value) {
            addCriterion("budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(String value) {
            addCriterion("budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(String value) {
            addCriterion("budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(String value) {
            addCriterion("budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLike(String value) {
            addCriterion("budget like", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotLike(String value) {
            addCriterion("budget not like", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<String> values) {
            addCriterion("budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<String> values) {
            addCriterion("budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(String value1, String value2) {
            addCriterion("budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(String value1, String value2) {
            addCriterion("budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNull() {
            addCriterion("work_experience is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNotNull() {
            addCriterion("work_experience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceEqualTo(String value) {
            addCriterion("work_experience =", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotEqualTo(String value) {
            addCriterion("work_experience <>", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThan(String value) {
            addCriterion("work_experience >", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience >=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThan(String value) {
            addCriterion("work_experience <", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThanOrEqualTo(String value) {
            addCriterion("work_experience <=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLike(String value) {
            addCriterion("work_experience like", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotLike(String value) {
            addCriterion("work_experience not like", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIn(List<String> values) {
            addCriterion("work_experience in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotIn(List<String> values) {
            addCriterion("work_experience not in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceBetween(String value1, String value2) {
            addCriterion("work_experience between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotBetween(String value1, String value2) {
            addCriterion("work_experience not between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationIsNull() {
            addCriterion("current_education is null");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationIsNotNull() {
            addCriterion("current_education is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationEqualTo(String value) {
            addCriterion("current_education =", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationNotEqualTo(String value) {
            addCriterion("current_education <>", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationGreaterThan(String value) {
            addCriterion("current_education >", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationGreaterThanOrEqualTo(String value) {
            addCriterion("current_education >=", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationLessThan(String value) {
            addCriterion("current_education <", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationLessThanOrEqualTo(String value) {
            addCriterion("current_education <=", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationLike(String value) {
            addCriterion("current_education like", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationNotLike(String value) {
            addCriterion("current_education not like", value, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationIn(List<String> values) {
            addCriterion("current_education in", values, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationNotIn(List<String> values) {
            addCriterion("current_education not in", values, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationBetween(String value1, String value2) {
            addCriterion("current_education between", value1, value2, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentEducationNotBetween(String value1, String value2) {
            addCriterion("current_education not between", value1, value2, "currentEducation");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeIsNull() {
            addCriterion("current_school_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeIsNotNull() {
            addCriterion("current_school_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeEqualTo(String value) {
            addCriterion("current_school_type =", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeNotEqualTo(String value) {
            addCriterion("current_school_type <>", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeGreaterThan(String value) {
            addCriterion("current_school_type >", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeGreaterThanOrEqualTo(String value) {
            addCriterion("current_school_type >=", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeLessThan(String value) {
            addCriterion("current_school_type <", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeLessThanOrEqualTo(String value) {
            addCriterion("current_school_type <=", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeLike(String value) {
            addCriterion("current_school_type like", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeNotLike(String value) {
            addCriterion("current_school_type not like", value, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeIn(List<String> values) {
            addCriterion("current_school_type in", values, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeNotIn(List<String> values) {
            addCriterion("current_school_type not in", values, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeBetween(String value1, String value2) {
            addCriterion("current_school_type between", value1, value2, "currentSchoolType");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolTypeNotBetween(String value1, String value2) {
            addCriterion("current_school_type not between", value1, value2, "currentSchoolType");
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