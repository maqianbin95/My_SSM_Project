package sc.ustc.bean;

import java.util.Date;

public class Questions {
    private Integer qid;

    private String qtype;

    private String qsummary;

    private String qdetail;

    private Date qdate;

    private Integer uid;

    private Boolean hasread;

    private Boolean isAdvise;

    private String qcountry;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype == null ? null : qtype.trim();
    }

    public String getQsummary() {
        return qsummary;
    }

    public void setQsummary(String qsummary) {
        this.qsummary = qsummary == null ? null : qsummary.trim();
    }

    public String getQdetail() {
        return qdetail;
    }

    public void setQdetail(String qdetail) {
        this.qdetail = qdetail == null ? null : qdetail.trim();
    }

    public Date getQdate() {
        return qdate;
    }

    public void setQdate(Date qdate) {
        this.qdate = qdate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Boolean getHasread() {
        return hasread;
    }

    public void setHasread(Boolean hasread) {
        this.hasread = hasread;
    }

    public Boolean getIsAdvise() {
        return isAdvise;
    }

    public void setIsAdvise(Boolean isAdvise) {
        this.isAdvise = isAdvise;
    }

    public String getQcountry() {
        return qcountry;
    }

    public void setQcountry(String qcountry) {
        this.qcountry = qcountry == null ? null : qcountry.trim();
    }

	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", qtype=" + qtype + ", qsummary=" + qsummary + ", qdetail=" + qdetail
				+ ", qdate=" + qdate + ", uid=" + uid + ", hasread=" + hasread + ", isAdvise=" + isAdvise
				+ ", qcountry=" + qcountry + "]";
	}
    
}