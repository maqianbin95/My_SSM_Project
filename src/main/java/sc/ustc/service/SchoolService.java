package sc.ustc.service;

import java.util.List;

import sc.ustc.bean.School;

public interface SchoolService {
	
	/**
	 * 在school表中查询所有国家
	 * 查询语句：select distinct scountry from school;
	 * <p>Title: selectAllContries</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	List<String> getAllContries();
	
	/**
	 * 获取所有的学校
	 * <p>Title: getAllSchool</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	List<School> getAllSchools();

	List<School> selectSchoolsByConditions(School school);

	School getSchoolsByName(String name);

	int updateSchool(School school);
	
	
}
