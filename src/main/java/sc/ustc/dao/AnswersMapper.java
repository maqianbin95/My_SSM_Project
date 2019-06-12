package sc.ustc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sc.ustc.bean.Answers;
import sc.ustc.bean.AnswersExample;

public interface AnswersMapper {
    int countByExample(AnswersExample example);

    int deleteByExample(AnswersExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Answers record);

    int insertSelective(Answers record);

    List<Answers> selectByExample(AnswersExample example);

    Answers selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Answers record, @Param("example") AnswersExample example);

    int updateByExample(@Param("record") Answers record, @Param("example") AnswersExample example);

    int updateByPrimaryKeySelective(Answers record);

    int updateByPrimaryKey(Answers record);
}