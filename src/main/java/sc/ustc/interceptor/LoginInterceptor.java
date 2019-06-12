package sc.ustc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	//执行Handler方法之前
	//用于身份认证和身份授权
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object obj) throws Exception {
		/*
		 * //情况一：公开地址，直接放行 //获取请求的url String url=req.getRequestURL().toString();
		 * //这里公开地址是登录提交的地址 if(url.contains("school.html")||url.contains("login")){
		 * System.out.println("提交后的公开地址放行"); return true; }
		 * 
		 * //情况二：有session，放行 //判断session HttpSession session = req.getSession();
		 * //从session中取出用户身份信息 String username=(String)
		 * session.getAttribute("username"); if(username!=null){
		 * System.out.println("有身份信息，放行"); //身份信息在放行 return true; }
		 * 
		 * //情况三：第一次登录，需要校验 System.out.println("第一次登陆");
		 * req.getRequestDispatcher("/validatePassword").forward(req, resp); return
		 * false;
		 */
		return true;
	}
	

	//执行Hadler方法之后，执行完Handler方法之前
	//从modelAndView出发，将公用 的模型数据传到视图，也可以在这里统一指定视图
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		//System.out.println("HandlerInteceptor01......postHandle");		
	}

	//执行完Handler方法之后
	//应用场景：统一异常处理，统一日志处理
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		//System.out.println("HandlerInteceptor01......afterCompletion");
	}

}
