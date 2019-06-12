package sc.ustc.bean;

public class School {
    private Integer sid;

    private String sname;

    private String swebsite;

    private String scountry;

    private String snature;

    private String scity;

    private String sstudentnum;

    private String sfoundingyear;

    private String sregion;

    private String img;

    private String detail;

    private Long hits;

    private String sspecialprofession;

    private String smaindepartment;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSwebsite() {
        return swebsite;
    }

    public void setSwebsite(String swebsite) {
        this.swebsite = swebsite == null ? null : swebsite.trim();
    }

    public String getScountry() {
        return scountry;
    }

    public void setScountry(String scountry) {
        this.scountry = scountry == null ? null : scountry.trim();
    }

    public String getSnature() {
        return snature;
    }

    public void setSnature(String snature) {
        this.snature = snature == null ? null : snature.trim();
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity == null ? null : scity.trim();
    }

    public String getSstudentnum() {
        return sstudentnum;
    }

    public void setSstudentnum(String sstudentnum) {
        this.sstudentnum = sstudentnum == null ? null : sstudentnum.trim();
    }

    public String getSfoundingyear() {
        return sfoundingyear;
    }

    public void setSfoundingyear(String sfoundingyear) {
        this.sfoundingyear = sfoundingyear == null ? null : sfoundingyear.trim();
    }

    public String getSregion() {
        return sregion;
    }

    public void setSregion(String sregion) {
        this.sregion = sregion == null ? null : sregion.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public String getSspecialprofession() {
        return sspecialprofession;
    }

    public void setSspecialprofession(String sspecialprofession) {
        this.sspecialprofession = sspecialprofession == null ? null : sspecialprofession.trim();
    }

    public String getSmaindepartment() {
        return smaindepartment;
    }

    public void setSmaindepartment(String smaindepartment) {
        this.smaindepartment = smaindepartment == null ? null : smaindepartment.trim();
    }
}