package sc.ustc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	//ִ��Handler����֮ǰ
	//���������֤�������Ȩ
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object obj) throws Exception {
		/*
		 * //���һ��������ַ��ֱ�ӷ��� //��ȡ�����url String url=req.getRequestURL().toString();
		 * //���﹫����ַ�ǵ�¼�ύ�ĵ�ַ if(url.contains("school.html")||url.contains("login")){
		 * System.out.println("�ύ��Ĺ�����ַ����"); return true; }
		 * 
		 * //���������session������ //�ж�session HttpSession session = req.getSession();
		 * //��session��ȡ���û������Ϣ String username=(String)
		 * session.getAttribute("username"); if(username!=null){
		 * System.out.println("�������Ϣ������"); //�����Ϣ�ڷ��� return true; }
		 * 
		 * //���������һ�ε�¼����ҪУ�� System.out.println("��һ�ε�½");
		 * req.getRequestDispatcher("/validatePassword").forward(req, resp); return
		 * false;
		 */
		return true;
	}
	

	//ִ��Hadler����֮��ִ����Handler����֮ǰ
	//��modelAndView������������ ��ģ�����ݴ�����ͼ��Ҳ����������ͳһָ����ͼ
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		//System.out.println("HandlerInteceptor01......postHandle");		
	}

	//ִ����Handler����֮��
	//Ӧ�ó�����ͳһ�쳣����ͳһ��־����
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		//System.out.println("HandlerInteceptor01......afterCompletion");
	}

}
