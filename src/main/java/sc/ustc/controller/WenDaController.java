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
	 *  未读问答改为已读
	 */
	@RequestMapping("/mark_read_qa")
	@ResponseBody
	public Msg markRead(HttpSession session,Integer qid) {
		Integer uid=(Integer) session.getAttribute("uid");
		return wenDaService.markReadByQid(qid);
	}
	
	/**
	 *  获取管理员已回复的问答
	 */
	@RequestMapping("/get_answered_qa")
	@ResponseBody
	public Msg getMyAnswerdWenDa(HttpSession session) {
		Integer uid=(Integer) session.getAttribute("uid");
		System.out.println("当前用户："+session.getAttribute("uname")+":"+uid);
		return wenDaService.getAnsweredWenDaByUid(uid);
	}
	/**
	 *  获取管理员未回复的问答
	 */
	@RequestMapping("/get_unanswered_qa")
	@ResponseBody
	public Msg getMyUnAnswerdWenDa(HttpSession session) {
		Integer uid=(Integer) session.getAttribute("uid");
		return wenDaService.getUnAnsweredWenDaByUid(uid);
	}
	
	/**
	 * qsummary:搜索框里的关键字-->questions.summary
	 * qtype:热门标签-->question.qtype
	 * new_hot:最新问答或者推荐问答-->最新回答：查时间；推荐回答：管理员推荐
	 */
	@RequestMapping("/get_wenda")
	@ResponseBody
	public Msg getWenDa(String qsummary, String qtype,String new_hot) {
		
		//测试
		System.out.println(qsummary+":"+qtype+":"+new_hot);
		
		List<QuestionsAnswersExtend> qa_content;
		Questions questions=new Questions();
		if(!"".equals(qsummary)) {
			questions.setQsummary(qsummary);
		}
		if(!"".equals(qtype)) {
			questions.setQtype(qtype);
		}
		if("全部".equals(qtype)) {
			questions.setQtype(null);
		}
		if("最新问答".equals(new_hot)) {
			questions.setIsAdvise(false);
			//PageHelper.startPage(1, 5);
			qa_content=wenDaService.getNewWenDa(questions);
		}else {//new_hot="推荐问答"
			questions.setIsAdvise(true);
			//PageHelper.startPage(1, 5);
			qa_content=wenDaService.getAdviseWenDa(questions);
		}
		return Msg.success().add("qa_content", qa_content);
	}

	/**
	 * 问答系统提交问题
	 */
	@RequestMapping("/submit_question")
	@ResponseBody
	public Msg submitQuestion(Questions questions,HttpSession session) {
		Integer uid=(Integer) session.getAttribute("uid");
		System.out.println("当前session中用户名是："+session.getAttribute("uname"));
		questions.setUid(uid);
		System.out.println(questions);
		
		Boolean falg=wenDaService.insertQuestion(questions);
		return Msg.success();
	}
	
	/**
	 * 问答系统提交问题
	 */
//	@RequestMapping("/searchQuestionResult")
//	@ResponseBody
//	public Msg submitQuestion(String key,String lable,String new_hot) {
//		
//		return Msg.success();
//	}
	
	
}
