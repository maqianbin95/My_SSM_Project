package sc.ustc.bean;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSwebsiteIsNull() {
            addCriterion("swebsite is null");
            return (Criteria) this;
        }

        public Criteria andSwebsiteIsNotNull() {
            addCriterion("swebsite is not null");
            return (Criteria) this;
        }

        public Criteria andSwebsiteEqualTo(String value) {
            addCriterion("swebsite =", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteNotEqualTo(String value) {
            addCriterion("swebsite <>", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteGreaterThan(String value) {
            addCriterion("swebsite >", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("swebsite >=", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteLessThan(String value) {
            addCriterion("swebsite <", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteLessThanOrEqualTo(String value) {
            addCriterion("swebsite <=", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteLike(String value) {
            addCriterion("swebsite like", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteNotLike(String value) {
            addCriterion("swebsite not like", value, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteIn(List<String> values) {
            addCriterion("swebsite in", values, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteNotIn(List<String> values) {
            addCriterion("swebsite not in", values, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteBetween(String value1, String value2) {
            addCriterion("swebsite between", value1, value2, "swebsite");
            return (Criteria) this;
        }

        public Criteria andSwebsiteNotBetween(String value1, String value2) {
            addCriterion("swebsite not between", value1, value2, "swebsite");
            return (Criteria) this;
        }

        public Criteria andScountryIsNull() {
            addCriterion("scountry is null");
            return (Criteria) this;
        }

        public Criteria andScountryIsNotNull() {
            addCriterion("scountry is not null");
            return (Criteria) this;
        }

        public Criteria andScountryEqualTo(String value) {
            addCriterion("scountry =", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotEqualTo(String value) {
            addCriterion("scountry <>", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryGreaterThan(String value) {
            addCriterion("scountry >", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryGreaterThanOrEqualTo(String value) {
            addCriterion("scountry >=", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryLessThan(String value) {
            addCriterion("scountry <", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryLessThanOrEqualTo(String value) {
            addCriterion("scountry <=", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryLike(String value) {
            addCriterion("scountry like", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotLike(String value) {
            addCriterion("scountry not like", value, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryIn(List<String> values) {
            addCriterion("scountry in", values, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotIn(List<String> values) {
            addCriterion("scountry not in", values, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryBetween(String value1, String value2) {
            addCriterion("scountry between", value1, value2, "scountry");
            return (Criteria) this;
        }

        public Criteria andScountryNotBetween(String value1, String value2) {
            addCriterion("scountry not between", value1, value2, "scountry");
            return (Criteria) this;
        }

        public Criteria andSnatureIsNull() {
            addCriterion("snature is null");
            return (Criteria) this;
        }

        public Criteria andSnatureIsNotNull() {
            addCriterion("snature is not null");
            return (Criteria) this;
        }

        public Criteria andSnatureEqualTo(String value) {
            addCriterion("snature =", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureNotEqualTo(String value) {
            addCriterion("snature <>", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureGreaterThan(String value) {
            addCriterion("snature >", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureGreaterThanOrEqualTo(String value) {
            addCriterion("snature >=", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureLessThan(String value) {
            addCriterion("snature <", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureLessThanOrEqualTo(String value) {
            addCriterion("snature <=", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureLike(String value) {
            addCriterion("snature like", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureNotLike(String value) {
            addCriterion("snature not like", value, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureIn(List<String> values) {
            addCriterion("snature in", values, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureNotIn(List<String> values) {
            addCriterion("snature not in", values, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureBetween(String value1, String value2) {
            addCriterion("snature between", value1, value2, "snature");
            return (Criteria) this;
        }

        public Criteria andSnatureNotBetween(String value1, String value2) {
            addCriterion("snature not between", value1, value2, "snature");
            return (Criteria) this;
        }

        public Criteria andScityIsNull() {
            addCriterion("scity is null");
            return (Criteria) this;
        }

        public Criteria andScityIsNotNull() {
            addCriterion("scity is not null");
            return (Criteria) this;
        }

        public Criteria andScityEqualTo(String value) {
            addCriterion("scity =", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotEqualTo(String value) {
            addCriterion("scity <>", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThan(String value) {
            addCriterion("scity >", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThanOrEqualTo(String value) {
            addCriterion("scity >=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThan(String value) {
            addCriterion("scity <", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThanOrEqualTo(String value) {
            addCriterion("scity <=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLike(String value) {
            addCriterion("scity like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotLike(String value) {
            addCriterion("scity not like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityIn(List<String> values) {
            addCriterion("scity in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotIn(List<String> values) {
            addCriterion("scity not in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityBetween(String value1, String value2) {
            addCriterion("scity between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotBetween(String value1, String value2) {
            addCriterion("scity not between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andSstudentnumIsNull() {
            addCriterion("sstudentnum is null");
            return (Criteria) this;
        }

        public Criteria andSstudentnumIsNotNull() {
            addCriterion("sstudentnum is not null");
            return (Criteria) this;
        }

        public Criteria andSstudentnumEqualTo(String value) {
            addCriterion("sstudentnum =", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumNotEqualTo(String value) {
            addCriterion("sstudentnum <>", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumGreaterThan(String value) {
            addCriterion("sstudentnum >", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumGreaterThanOrEqualTo(String value) {
            addCriterion("sstudentnum >=", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumLessThan(String value) {
            addCriterion("sstudentnum <", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumLessThanOrEqualTo(String value) {
            addCriterion("sstudentnum <=", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumLike(String value) {
            addCriterion("sstudentnum like", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumNotLike(String value) {
            addCriterion("sstudentnum not like", value, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumIn(List<String> values) {
            addCriterion("sstudentnum in", values, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumNotIn(List<String> values) {
            addCriterion("sstudentnum not in", values, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumBetween(String value1, String value2) {
            addCriterion("sstudentnum between", value1, value2, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSstudentnumNotBetween(String value1, String value2) {
            addCriterion("sstudentnum not between", value1, value2, "sstudentnum");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearIsNull() {
            addCriterion("sfoundingyear is null");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearIsNotNull() {
            addCriterion("sfoundingyear is not null");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearEqualTo(String value) {
            addCriterion("sfoundingyear =", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearNotEqualTo(String value) {
            addCriterion("sfoundingyear <>", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearGreaterThan(String value) {
            addCriterion("sfoundingyear >", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearGreaterThanOrEqualTo(String value) {
            addCriterion("sfoundingyear >=", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearLessThan(String value) {
            addCriterion("sfoundingyear <", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearLessThanOrEqualTo(String value) {
            addCriterion("sfoundingyear <=", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearLike(String value) {
            addCriterion("sfoundingyear like", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearNotLike(String value) {
            addCriterion("sfoundingyear not like", value, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearIn(List<String> values) {
            addCriterion("sfoundingyear in", values, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearNotIn(List<String> values) {
            addCriterion("sfoundingyear not in", values, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearBetween(String value1, String value2) {
            addCriterion("sfoundingyear between", value1, value2, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSfoundingyearNotBetween(String value1, String value2) {
            addCriterion("sfoundingyear not between", value1, value2, "sfoundingyear");
            return (Criteria) this;
        }

        public Criteria andSregionIsNull() {
            addCriterion("sregion is null");
            return (Criteria) this;
        }

        public Criteria andSregionIsNotNull() {
            addCriterion("sregion is not null");
            return (Criteria) this;
        }

        public Criteria andSregionEqualTo(String value) {
            addCriterion("sregion =", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionNotEqualTo(String value) {
            addCriterion("sregion <>", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionGreaterThan(String value) {
            addCriterion("sregion >", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionGreaterThanOrEqualTo(String value) {
            addCriterion("sregion >=", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionLessThan(String value) {
            addCriterion("sregion <", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionLessThanOrEqualTo(String value) {
            addCriterion("sregion <=", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionLike(String value) {
            addCriterion("sregion like", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionNotLike(String value) {
            addCriterion("sregion not like", value, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionIn(List<String> values) {
            addCriterion("sregion in", values, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionNotIn(List<String> values) {
            addCriterion("sregion not in", values, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionBetween(String value1, String value2) {
            addCriterion("sregion between", value1, value2, "sregion");
            return (Criteria) this;
        }

        public Criteria andSregionNotBetween(String value1, String value2) {
            addCriterion("sregion not between", value1, value2, "sregion");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Long value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Long value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Long value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Long value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Long value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Long value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Long> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Long> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Long value1, Long value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Long value1, Long value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionIsNull() {
            addCriterion("sspecialprofession is null");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionIsNotNull() {
            addCriterion("sspecialprofession is not null");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionEqualTo(String value) {
            addCriterion("sspecialprofession =", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionNotEqualTo(String value) {
            addCriterion("sspecialprofession <>", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionGreaterThan(String value) {
            addCriterion("sspecialprofession >", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionGreaterThanOrEqualTo(String value) {
            addCriterion("sspecialprofession >=", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionLessThan(String value) {
            addCriterion("sspecialprofession <", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionLessThanOrEqualTo(String value) {
            addCriterion("sspecialprofession <=", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionLike(String value) {
            addCriterion("sspecialprofession like", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionNotLike(String value) {
            addCriterion("sspecialprofession not like", value, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionIn(List<String> values) {
            addCriterion("sspecialprofession in", values, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionNotIn(List<String> values) {
            addCriterion("sspecialprofession not in", values, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionBetween(String value1, String value2) {
            addCriterion("sspecialprofession between", value1, value2, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSspecialprofessionNotBetween(String value1, String value2) {
            addCriterion("sspecialprofession not between", value1, value2, "sspecialprofession");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentIsNull() {
            addCriterion("smaindepartment is null");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentIsNotNull() {
            addCriterion("smaindepartment is not null");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentEqualTo(String value) {
            addCriterion("smaindepartment =", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentNotEqualTo(String value) {
            addCriterion("smaindepartment <>", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentGreaterThan(String value) {
            addCriterion("smaindepartment >", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("smaindepartment >=", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentLessThan(String value) {
            addCriterion("smaindepartment <", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentLessThanOrEqualTo(String value) {
            addCriterion("smaindepartment <=", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentLike(String value) {
            addCriterion("smaindepartment like", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentNotLike(String value) {
            addCriterion("smaindepartment not like", value, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentIn(List<String> values) {
            addCriterion("smaindepartment in", values, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentNotIn(List<String> values) {
            addCriterion("smaindepartment not in", values, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentBetween(String value1, String value2) {
            addCriterion("smaindepartment between", value1, value2, "smaindepartment");
            return (Criteria) this;
        }

        public Criteria andSmaindepartmentNotBetween(String value1, String value2) {
            addCriterion("smaindepartment not between", value1, value2, "smaindepartment");
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