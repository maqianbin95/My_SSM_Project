package sc.ustc.bean;

import java.util.List;
/**
 * �������չ��
* <p>Title: QuestionsAnswersExtend</p>  
* <p>Description: </p>  
* @author shenlan  
* @date 2019��3��12��
 */
public class QuestionsAnswersExtend extends Questions{
	private Answers answers;
	private User user;
	
	public Answers getAnswers() {
		return answers;
	}
	public void setAnswers(Answers answers) {
		this.answers = answers;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "QuestionsAnswersExtend [answers=" + answers + ", user=" + user + ", getQid()=" + getQid()
				+ ", getQtype()=" + getQtype() + ", getQsummary()=" + getQsummary() + ", getQdetail()=" + getQdetail()
				+ ", getQdate()=" + getQdate() + ", getUid()=" + getUid() + ", getHasread()=" + getHasread()
				+ ", getIsAdvise()=" + getIsAdvise() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
