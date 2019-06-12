package sc.ustc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sc.ustc.bean.Profession;
import sc.ustc.bean.ProfessionExample;
import sc.ustc.bean.ProfessionExample.Criteria;
import sc.ustc.dao.ProfessionMapper;
import sc.ustc.service.ProfessionService;
@Service
public class ProfessionServiceImpl implements ProfessionService {

	@Autowired ProfessionMapper professionMapper;
	
	@Override
	public List<String> getMajors() {
		
		return professionMapper.selectMajors();
	}

}
