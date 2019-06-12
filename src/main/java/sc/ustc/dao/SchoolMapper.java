package sc.ustc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sc.ustc.bean.School;
import sc.ustc.bean.SchoolExample;

public interface SchoolMapper {
    int countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Integer sid);
    
    List<String> selectAllContries();
	//新增方法:条件查询
	List<School> selectSchoolsByConditions(School school);


    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}