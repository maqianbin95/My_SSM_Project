package sc.ustc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sc.ustc.bean.User;
import sc.ustc.bean.UserExample;
import sc.ustc.bean.UserExample.Criteria;
import sc.ustc.dao.UserMapper;
import sc.ustc.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired UserMapper userMapper;

	@Override
	public List<User> getAll() {
		
		return userMapper.selectByExample(null);
	}

	/**
	 * ͨ���û�����ѯ���ݿ��Ƿ�����ظ��û���
	 * @param uname
	 * @return
	 */
	@Override
	public boolean getUserByName(String uname) {
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUnameEqualTo(uname);
		long count=userMapper.countByExample(example);
		return count==0;
	}
	@Override
	public void insertUser(User user) {
		userMapper.insertSelective(user);
	}
	
	/**
	 * ͨ���û����������ѯ���ݿ��Ƿ����Ψһ��һ����¼
	 * ���򷵻�true,���򷵻�false
	 * @param uname
	 * @param upassword
	 * @return
	 */
	@Override
	public List<User> validateUser(String uname, String upassword) {
		UserExample example=new UserExample();
		Criteria criteria=example.createCriteria();
		criteria.andUnameEqualTo(uname).andUpasswordEqualTo(upassword);
		List<User> users=userMapper.selectByExample(example);
		return users;
		
	}

	@Override
	public Boolean updatePassword(Integer uid,String newPassword) {
		UserExample example=new UserExample();
		User user=new User();
		user.setUid(uid);
		user.setUpassword(newPassword);
		userMapper.updateByPrimaryKeySelective(user);
		return true;
	}
}
