package sc.ustc.bean;

public class AssessTb {
    private Integer uid;

    private String uname;

    private String uphone;

    private String uemail;

    private String uqq;

    private String countries;

    private String targetEducation;

    private String targetMajor;

    private String studyDate;

    private String budget;

    private String workExperience;

    private String currentEducation;

    private String currentSchoolType;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq == null ? null : uqq.trim();
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries == null ? null : countries.trim();
    }

    public String getTargetEducation() {
        return targetEducation;
    }

    public void setTargetEducation(String targetEducation) {
        this.targetEducation = targetEducation == null ? null : targetEducation.trim();
    }

    public String getTargetMajor() {
        return targetMajor;
    }

    public void setTargetMajor(String targetMajor) {
        this.targetMajor = targetMajor == null ? null : targetMajor.trim();
    }

    public String getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(String studyDate) {
        this.studyDate = studyDate == null ? null : studyDate.trim();
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget == null ? null : budget.trim();
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience == null ? null : workExperience.trim();
    }

    public String getCurrentEducation() {
        return currentEducation;
    }

    public void setCurrentEducation(String currentEducation) {
        this.currentEducation = currentEducation == null ? null : currentEducation.trim();
    }

    public String getCurrentSchoolType() {
        return currentSchoolType;
    }

    public void setCurrentSchoolType(String currentSchoolType) {
        this.currentSchoolType = currentSchoolType == null ? null : currentSchoolType.trim();
    }
}