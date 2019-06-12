package sc.ustc.bean;

import javax.validation.constraints.Pattern;

public class User {
    private Integer uid;

    @Pattern(regexp="(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})",message="���У�飺�û���������6-16λӢ�Ļ����ֵ���ϣ�2-5λ�������")
    private String uname;
    
    private String upassword;
    
    private String unickname;
    
    private String ugender;
    @Pattern(regexp="^((13[0-9]|15[0-9]|17[0-9]|18[0-9])+\\d{8})$",message="���У�飺�ֻ���ʽ����")
    private String uphonenumber;
    @Pattern(regexp="^[a-z0-9]+([._\\\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$",message="���У��:�����ʽ����ȷ")
    private String uemail;
    @Pattern(regexp="^[1-9]\\d{4,10}$",message="���У��:QQ�Ÿ�ʽ����")
    private String uqq;

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

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname == null ? null : unickname.trim();
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender == null ? null : ugender.trim();
    }

    public String getUphonenumber() {
        return uphonenumber;
    }

    public void setUphonenumber(String uphonenumber) {
        this.uphonenumber = uphonenumber == null ? null : uphonenumber.trim();
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

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", unickname=" + unickname
				+ ", ugender=" + ugender + ", uphonenumber=" + uphonenumber + ", uemail=" + uemail + ", uqq=" + uqq
				+ "]";
	}
    
}