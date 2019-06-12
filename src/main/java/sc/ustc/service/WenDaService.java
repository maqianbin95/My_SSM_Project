package sc.ustc.service;

import java.util.List;

import sc.ustc.bean.Msg;
import sc.ustc.bean.Questions;
import sc.ustc.bean.QuestionsAnswersExtend;

public interface WenDaService {

	List<QuestionsAnswersExtend> getNewWenDa(Questions questions);

	List<QuestionsAnswersExtend> getAdviseWenDa(Questions questions);

	Boolean insertQuestion(Questions questions);

	Msg getAnsweredWenDaByUid(Integer uid);
	
	Msg getUnAnsweredWenDaByUid(Integer uid);

	Msg markReadByQid(Integer qid);

}
