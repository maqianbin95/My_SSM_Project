package sc.ustc.test;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sc.ustc.bean.User;
import sc.ustc.dao.UserMapper;

/**
 * 
 * @author mqb
 *1.导入spring test模块
 *2.@ContextConfiguration指定spring配置文件的位置
 */
//********************************************************打包时添加@Ignore，不打包时去掉

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void testCRUD() {
//		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
//		DepartmentMapper departmentMapper=ioc.getBean(DepartmentMapper.class);
//		System.out.println(user);
//		departmentMapper.insertSelective(new Department(null,"开发部"));
//		departmentMapper.insertSelective(new Department(null,"测试部"));
		
//		employeeMapper.insertSelective(new Employee(null, "jerry", "M", "mqb@mail.ustc.edu.cn", 1));
		
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//		for(int i=0;i<1000;i++) {
//			String uid=UUID.randomUUID().toString().substring(0, 5)+i;
//			employeeMapper.insertSelective(new Employee(null, uid, "M", uid+"@qq.com", 1));
//		}
//		System.out.println("批量完成");
		
		List<User> list=userMapper.selectByExample(null);
		System.out.println(list);
	}
}
