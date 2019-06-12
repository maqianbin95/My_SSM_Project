package sc.ustc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sc.ustc.bean.Profession;
import sc.ustc.bean.ProfessionExample;

public interface ProfessionMapper {
    int countByExample(ProfessionExample example);

    int deleteByExample(ProfessionExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Profession record);

    int insertSelective(Profession record);

    List<Profession> selectByExample(ProfessionExample example);

    Profession selectByPrimaryKey(Integer pid);
    
    //查询所有专业方向
    List<String> selectMajors();

    int updateByExampleSelective(@Param("record") Profession record, @Param("example") ProfessionExample example);

    int updateByExample(@Param("record") Profession record, @Param("example") ProfessionExample example);

    int updateByPrimaryKeySelective(Profession record);

    int updateByPrimaryKey(Profession record);
}