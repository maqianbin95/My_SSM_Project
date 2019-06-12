package sc.ustc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sc.ustc.bean.Administrator;
import sc.ustc.bean.AdministratorExample;

public interface AdministratorMapper {
    int countByExample(AdministratorExample example);

    int deleteByExample(AdministratorExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    List<Administrator> selectByExample(AdministratorExample example);

    Administrator selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    int updateByExample(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}