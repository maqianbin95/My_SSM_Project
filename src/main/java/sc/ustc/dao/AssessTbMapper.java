package sc.ustc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sc.ustc.bean.AssessTb;
import sc.ustc.bean.AssessTbExample;

public interface AssessTbMapper {
    int countByExample(AssessTbExample example);

    int deleteByExample(AssessTbExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(AssessTb record);

    int insertSelective(AssessTb record);

    List<AssessTb> selectByExample(AssessTbExample example);

    AssessTb selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") AssessTb record, @Param("example") AssessTbExample example);

    int updateByExample(@Param("record") AssessTb record, @Param("example") AssessTbExample example);

    int updateByPrimaryKeySelective(AssessTb record);

    int updateByPrimaryKey(AssessTb record);
}