package sc.ustc.bean;

import java.util.Date;

public class Answers {
    private Integer aid;

    private Integer qid;

    private String adetail;

    private Date adate;

    private Integer uid;

    private Integer adminid;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getAdetail() {
        return adetail;
    }

    public void setAdetail(String adetail) {
        this.adetail = adetail == null ? null : adetail.trim();
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        this.adate = adate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }
}