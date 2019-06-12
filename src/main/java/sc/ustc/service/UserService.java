package sc.ustc.service;

import java.util.List;

import sc.ustc.bean.User;


public interface UserService {

	public List<User> getAll() ;

	/**
	 * 通过用户名查询数据库是否存在重复用户名
	 * @param uname
	 * @return
	 */
	public boolean getUserByName(String uname);
	
	public void insertUser(User user) ;
	
	/**
	 * 通过用户名和密码查询数据库是否存在唯一的一条记录
	 * 是则返回true,否则返回false
	 * @param uname
	 * @param upassword
	 * @return
	 */
	public List<User> validateUser(String uname, String upassword);

	public Boolean updatePassword(Integer uid,String newPassword);
	
}
