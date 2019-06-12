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
	 * 在school表中查询所有国家
	 * 查询语句：select distinct scountry from school;
	 */
	@Override
	public List<String> getAllContries() {
		return schoolMapper.selectAllContries();
	}

	/**
	 * 查询所有学校，并且学校按点击量排序
	 */
	@Override
	public List<School> getAllSchools() {
		SchoolExample example=new SchoolExample();
		example.setOrderByClause("hits desc");//学校按点击量排序
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
	 * 通过学校名获取学校信息
	 */
	@Override
	public School getSchoolsByName(String name) {
		SchoolExample example=new SchoolExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andSnameEqualTo(name);
		List<School> list=schoolMapper.selectByExample(example);
		return list.get(0);//只会返回一条记录
			
	}

	/**
	 * 更新学校信息
	 */
	@Override
	public int updateSchool(School school) {
		
		return schoolMapper.updateByPrimaryKeySelective(school);
	}

}
