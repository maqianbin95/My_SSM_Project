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
    
    //���ӷ���:���»ش�
    List<QuestionsAnswersExtend> selectNewWenDa(Questions questions);
    //���ӷ���������ش�
    List<QuestionsAnswersExtend> selectAdviceWenDa(Questions questions);
//    //���ӷ����������û�uid��ѯ�ʴ�
//    List<QuestionsAnswersExtend> selectMyWenDaByUidRead(Integer uid);
//    //���ӷ����������û�uid��ѯ�ʴ�
//    List<QuestionsAnswersExtend> selectMyWenDaByUidUnread(Integer uid);
    //���ӷ���:����uid��ȡ����Աδ�ظ�������
    List<QuestionsAnswersExtend> getUnAnsweredWenDaByUid(Integer uid);
    //���ӷ���:����uid��ȡ����Ա�ѻظ�������
    List<QuestionsAnswersExtend> getAnsweredWenDaByUid(Integer uid);

    Questions selectByPrimaryKey(Integer qid);

    int updateByExampleSelective(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByExample(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);

	
}