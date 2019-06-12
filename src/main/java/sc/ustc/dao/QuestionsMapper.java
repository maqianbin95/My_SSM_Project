package sc.ustc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sc.ustc.bean.Questions;
import sc.ustc.bean.QuestionsAnswersExtend;
import sc.ustc.bean.QuestionsExample;

public interface QuestionsMapper {
    int countByExample(QuestionsExample example);

    int deleteByExample(QuestionsExample example);

    int deleteByPrimaryKey(Integer qid);

    int insert(Questions record);

    int insertSelective(Questions record);

    List<Questions> selectByExample(QuestionsExample example);
    
    //增加方法:最新回答
    List<QuestionsAnswersExtend> selectNewWenDa(Questions questions);
    //增加方法：建议回答
    List<QuestionsAnswersExtend> selectAdviceWenDa(Questions questions);
//    //增加方法，根据用户uid查询问答
//    List<QuestionsAnswersExtend> selectMyWenDaByUidRead(Integer uid);
//    //增加方法，根据用户uid查询问答
//    List<QuestionsAnswersExtend> selectMyWenDaByUidUnread(Integer uid);
    //增加方法:根据uid获取管理员未回复的问题
    List<QuestionsAnswersExtend> getUnAnsweredWenDaByUid(Integer uid);
    //增加方法:根据uid获取管理员已回复的问题
    List<QuestionsAnswersExtend> getAnsweredWenDaByUid(Integer uid);

    Questions selectByPrimaryKey(Integer qid);

    int updateByExampleSelective(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByExample(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);

	
}