package sc.ustc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.ResolveResult;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;

import net.sf.jsqlparser.statement.select.Select;
import sc.ustc.bean.Msg;
import sc.ustc.bean.Questions;
import sc.ustc.bean.QuestionsAnswersExtend;
import sc.ustc.service.UserService;
import sc.ustc.service.WenDaService;

@Controller
public class WenDaController {

	@Autowired
	private WenDaService wenDaService;
	
	@Autowired
	private UserService userService;
	
	/**
	 *  δ���ʴ��Ϊ�Ѷ�
	 */
	@RequestMapping("/mark_read_qa")
	@ResponseBody
	public Msg markRead(HttpSession session,Integer qid) {
		Integer uid=(Integer) session.getAttribute("uid");
		return wenDaService.markReadByQid(qid);
	}
	
	/**
	 *  ��ȡ����Ա�ѻظ����ʴ�
	 */
	@RequestMapping("/get_answered_qa")
	@ResponseBody
	public Msg getMyAnswerdWenDa(HttpSession session) {
		Integer uid=(Integer) session.getAttribute("uid");
		System.out.println("��ǰ�û���"+session.getAttribute("uname")+":"+uid);
		return wenDaService.getAnsweredWenDaByUid(uid);
	}
	/**
	 *  ��ȡ����Աδ�ظ����ʴ�
	 */
	@RequestMapping("/get_unanswered_qa")
	@ResponseBody
	public Msg getMyUnAnswerdWenDa(HttpSession session) {
		Integer uid=(Integer) session.getAttribute("uid");
		return wenDaService.getUnAnsweredWenDaByUid(uid);
	}
	
	/**
	 * qsummary:��������Ĺؼ���-->questions.summary
	 * qtype:���ű�ǩ-->question.qtype
	 * new_hot:�����ʴ�����Ƽ��ʴ�-->���»ش𣺲�ʱ�䣻�Ƽ��ش𣺹���Ա�Ƽ�
	 */
	@RequestMapping("/get_wenda")
	@ResponseBody
	public Msg getWenDa(String qsummary, String qtype,String new_hot) {
		
		//����
		System.out.println(qsummary+":"+qtype+":"+new_hot);
		
		List<QuestionsAnswersExtend> qa_content;
		Questions questions=new Questions();
		if(!"".equals(qsummary)) {
			questions.setQsummary(qsummary);
		}
		if(!"".equals(qtype)) {
			questions.setQtype(qtype);
		}
		if("ȫ��".equals(qtype)) {
			questions.setQtype(null);
		}
		if("�����ʴ�".equals(new_hot)) {
			questions.setIsAdvise(false);
			//PageHelper.startPage(1, 5);
			qa_content=wenDaService.getNewWenDa(questions);
		}else {//new_hot="�Ƽ��ʴ�"
			questions.setIsAdvise(true);
			//PageHelper.startPage(1, 5);
			qa_content=wenDaService.getAdviseWenDa(questions);
		}
		return Msg.success().add("qa_content", qa_content);
	}

	/**
	 * �ʴ�ϵͳ�ύ����
	 */
	@RequestMapping("/submit_question")
	@ResponseBody
	public Msg submitQuestion(Questions questions,HttpSession session) {
		Integer uid=(Integer) session.getAttribute("uid");
		System.out.println("��ǰsession���û����ǣ�"+session.getAttribute("uname"));
		questions.setUid(uid);
		System.out.println(questions);
		
		Boolean falg=wenDaService.insertQuestion(questions);
		return Msg.success();
	}
	
	/**
	 * �ʴ�ϵͳ�ύ����
	 */
//	@RequestMapping("/searchQuestionResult")
//	@ResponseBody
//	public Msg submitQuestion(String key,String lable,String new_hot) {
//		
//		return Msg.success();
//	}
	
	
}
