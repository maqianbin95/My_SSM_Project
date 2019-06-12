package sc.ustc.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.jsqlparser.statement.select.Select;
import sc.ustc.bean.Msg;
import sc.ustc.bean.Questions;
import sc.ustc.bean.QuestionsAnswersExtend;
import sc.ustc.bean.QuestionsExample;
import sc.ustc.bean.QuestionsExample.Criteria;
import sc.ustc.dao.QuestionsMapper;
import sc.ustc.service.WenDaService;

@Service
public class WenDaServiceImpl implements WenDaService{

	@Autowired
	private QuestionsMapper questionsMapper;
	
	/**
	 * �����ʴ�
	 */
	@Override
	public List<QuestionsAnswersExtend> getNewWenDa(Questions questions) {
		System.out.println(questions);
		List<QuestionsAnswersExtend> extend=questionsMapper.selectNewWenDa(questions);
		System.out.println(extend);
		return extend;
	}

	/**
	 * �Ƽ��ʴ�
	 */
	@Override
	public List<QuestionsAnswersExtend> getAdviseWenDa(Questions questions) {
		List<QuestionsAnswersExtend> extend=questionsMapper.selectAdviceWenDa(questions);
		System.out.println(extend);
		return extend;
	}
	/**
	 * ��������
	 */
	@Override
	public Boolean insertQuestion(Questions questions) {
		questions.setQdate(new Date());
		questions.setHasread(false);
		questions.setIsAdvise(false);
		questionsMapper.insert(questions);
		return true;
	}

	/**
	 * ��ȡ����Ա�ѻظ����ʴ�
	 */
	@Override 
	public Msg getAnsweredWenDaByUid(Integer uid) {
		List<QuestionsAnswersExtend> list=questionsMapper.getAnsweredWenDaByUid(uid);
		List<QuestionsAnswersExtend> readQAs=new ArrayList<QuestionsAnswersExtend>();
		List<QuestionsAnswersExtend> unreadQAs=new ArrayList<QuestionsAnswersExtend>();
		for(QuestionsAnswersExtend qae:list) {
			if(qae.getHasread()) {
				readQAs.add(qae);
			}else {
				unreadQAs.add(qae);
			}
		}
		return Msg.success().add("readQAs", readQAs).add("unreadQAs", unreadQAs);
	}

	/**
	 * ��ȡ����Աδ�ظ����ʴ�
	 */
	@Override
	public Msg getUnAnsweredWenDaByUid(Integer uid) {
		List<QuestionsAnswersExtend> list=questionsMapper.getUnAnsweredWenDaByUid(uid);
		return Msg.success().add("unanswered_q", list);
	}

	@Override
	public Msg markReadByQid(Integer qid) {
		Questions questions=new Questions();
		questions.setQid(qid);
		questions.setHasread(true);
		questionsMapper.updateByPrimaryKeySelective(questions);
		return Msg.success();
	}

}
