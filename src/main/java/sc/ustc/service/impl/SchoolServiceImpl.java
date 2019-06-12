package sc.ustc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sc.ustc.bean.School;
import sc.ustc.bean.SchoolExample;
import sc.ustc.bean.SchoolExample.Criteria;
import sc.ustc.dao.SchoolMapper;
import sc.ustc.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{
	
	@Autowired
	private SchoolMapper schoolMapper;

	/**
	 * ��school���в�ѯ���й���
	 * ��ѯ��䣺select distinct scountry from school;
	 */
	@Override
	public List<String> getAllContries() {
		return schoolMapper.selectAllContries();
	}

	/**
	 * ��ѯ����ѧУ������ѧУ�����������
	 */
	@Override
	public List<School> getAllSchools() {
		SchoolExample example=new SchoolExample();
		example.setOrderByClause("hits desc");//ѧУ�����������
		Criteria criteria = example.createCriteria();
		
		return schoolMapper.selectByExample(example);
	}

	@Override
	public List<School> selectSchoolsByConditions(School school) {
//		System.out.println(school);
//		SchoolExample example=new SchoolExample();
//		example.setOrderByClause("hits desc");
//		Criteria criteria = example.createCriteria();
//		if(school.getScountry()!=null) {
//			criteria.andScountryEqualTo(school.getScountry());
//		}
//		if(school.getSnature()!=null) {
//			criteria.andSnatureEqualTo(school.getSnature());
//		}
//		if(school.getSspecialprofession()!=null) {
//			criteria.andSspecialprofessionEqualTo(school.getSspecialprofession());
//		}
//		if(school.getSname()!=null) {
//			criteria.andSnameLike(school.getSname());
//		}
//		List<School> list=schoolMapper.selectByExample(example);
		List<School> list=schoolMapper.selectSchoolsByConditions(school);
		return list;
	}
	
	/**
	 * ͨ��ѧУ����ȡѧУ��Ϣ
	 */
	@Override
	public School getSchoolsByName(String name) {
		SchoolExample example=new SchoolExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andSnameEqualTo(name);
		List<School> list=schoolMapper.selectByExample(example);
		return list.get(0);//ֻ�᷵��һ����¼
			
	}

	/**
	 * ����ѧУ��Ϣ
	 */
	@Override
	public int updateSchool(School school) {
		
		return schoolMapper.updateByPrimaryKeySelective(school);
	}

}
