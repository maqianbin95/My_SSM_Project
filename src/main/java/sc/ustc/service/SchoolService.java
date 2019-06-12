package sc.ustc.service;

import java.util.List;

import sc.ustc.bean.School;

public interface SchoolService {
	
	/**
	 * ��school���в�ѯ���й���
	 * ��ѯ��䣺select distinct scountry from school;
	 * <p>Title: selectAllContries</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	List<String> getAllContries();
	
	/**
	 * ��ȡ���е�ѧУ
	 * <p>Title: getAllSchool</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	List<School> getAllSchools();

	List<School> selectSchoolsByConditions(School school);

	School getSchoolsByName(String name);

	int updateSchool(School school);
	
	
}
