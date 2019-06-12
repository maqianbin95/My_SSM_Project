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
	 * 通过用户名查询数据库是否存在重复用户名
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
	 * 通过用户名和密码查询数据库是否存在唯一的一条记录
	 * 是则返回true,否则返回false
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
