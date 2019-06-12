package sc.ustc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sc.ustc.bean.AssessTb;
import sc.ustc.dao.AssessTbMapper;
import sc.ustc.service.AssessService;
@Service
public class AssessServiceImpl implements AssessService{

	@Autowired
	private AssessTbMapper assessMapper;
	
	@Override
	public Boolean submitAssessTb(AssessTb assessTb) {
		assessMapper.insertSelective(assessTb);
		return null;
	}

}
