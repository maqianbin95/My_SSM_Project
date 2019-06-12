package sc.ustc.service;

import java.util.List;

import sc.ustc.bean.User;


public interface UserService {

	public List<User> getAll() ;

	/**
	 * ͨ���û�����ѯ���ݿ��Ƿ�����ظ��û���
	 * @param uname
	 * @return
	 */
	public boolean getUserByName(String uname);
	
	public void insertUser(User user) ;
	
	/**
	 * ͨ���û����������ѯ���ݿ��Ƿ����Ψһ��һ����¼
	 * ���򷵻�true,���򷵻�false
	 * @param uname
	 * @param upassword
	 * @return
	 */
	public List<User> validateUser(String uname, String upassword);

	public Boolean updatePassword(Integer uid,String newPassword);
	
}
