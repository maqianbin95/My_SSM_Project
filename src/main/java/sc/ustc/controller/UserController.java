package sc.ustc.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.http.cookie.CookieSpec;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import sc.ustc.bean.Msg;
import sc.ustc.bean.User;
import sc.ustc.service.UserService;
import sc.ustc.utils.GetMessageCode;
import sc.ustc.utils.RandomValidateCode;
import sc.ustc.utils.ReturnContant;

@Controller
public class UserController {
	
	@Autowired UserService userService;
	
	/**
	 * 更新密码
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/passwordUpdate",method=RequestMethod.POST)
	@ResponseBody
	public Msg updatePassword(HttpSession session,String oldPassword,String newPassword) {
		if(!oldPassword.equals(session.getAttribute("upassword"))) {
			return Msg.fail().add("msg", "原密码错误");
		}
		Integer uid=(Integer) session.getAttribute("uid");
		Boolean flag=userService.updatePassword(uid,newPassword);
		if(!flag) {
			return Msg.fail().add("msg","修改密码未成功，请稍后重试");
		}
		return Msg.success().add("msg", "密码修改成功");
	}
	
	/**
	 * 登陆验证账号和密码是否匹配
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/validatePassword",method=RequestMethod.POST)
	@ResponseBody
	public Msg LoginController(HttpSession session,User user,HttpServletResponse hsp) {
		
		if(session.getAttribute("uname")!=null) {
			System.out.println("session uname=="+session.getAttribute("uname"));
		}
		System.out.println(user.getUname()+" "+user.getUpassword());
		List<User> users=userService.validateUser(user.getUname(),user.getUpassword());
		if(users.size()==1) {
			session.setAttribute("uname", users.get(0).getUname());
			session.setAttribute("upassword", users.get(0).getUpassword());
			session.setAttribute("uid", users.get(0).getUid());
			Cookie cookie = new Cookie("session",session.getId());
			cookie.setMaxAge(30*60);
			hsp.addCookie(cookie);
			return Msg.success().add("va_msg", "登录成功").add("url", "http://localhost:8080/ssm_project/schools.html");
		}else {
			return Msg.fail().add("tip", "用户名不存在或者密码错误");
		}
		
	}
	
	@RequestMapping("/checkuname")
	@ResponseBody
	public Msg checkUname(String uname) {
		if(userService.getUserByName(uname)) {
			return Msg.fail();
		}else {
			return Msg.success();
		}
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/signup",method=RequestMethod.POST)//这是你填的url,你填的时候不要加斜杠
	@ResponseBody          //返回的是ajax
	public Msg signUp(@Valid User user,BindingResult bindingResult,String passcode,HttpSession session) {
		System.out.println(user);
		
		Msg msg=new Msg();
		
		String randomCode=(String) session.getAttribute("randomcode_key");
		
		System.out.println("***************************验证码校验*********************************");
		System.out.println("正确验证码=="+randomCode);
		System.out.println("用户输入验证码=="+passcode);
		
		if(!bindingResult.hasErrors()&&randomCode.equalsIgnoreCase(passcode)) {
			
			if(userService.getUserByName(user.getUname())){//如果数据库中不存在该用户名
				userService.insertUser(user);
				System.out.println("注册成功");
				return msg.success().add("url", "success.html").add("tip", "注册成功");		//返回结果，这里没有返回结果，只是设置了状态码为100，具体看Msg类代码就懂
			}else {
				System.out.println("用户名已存在");
				return msg.fail().add("tip", "用户名已存在");
			}
		}else if(bindingResult.hasErrors()){//校验格式出错，把错误字段和错误信息存在map中
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			Map<String, Object> map=new HashMap<String, Object>();
			for(FieldError fieldError:fieldErrors) {
				
				System.out.println("***************************注册信息校验错误*********************************");
				System.out.println("错误字段名："+fieldError.getField());
				System.out.println("错误信息："+fieldError.getDefaultMessage());
				System.out.println();
				
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return msg.fail().add("tip","邮箱手机号不可为空或错误");
		}else {
			return msg.fail().add("tip", "验证码或者密码错误");
		}
		
	}
	
	/**
	 * 退出登陆
	 * 
	 * @param response
	 * @param session
	 */
	@RequestMapping("/logout")
	@ResponseBody
	public Msg logout(HttpSession session) {
		System.out.println("aaa");
		session.invalidate();
		return Msg.success();
		
	}
	
	
	@Resource
    private ReturnContant returnContant;
    /**
     * 根据获取到的手机号发送验证码
     * @param request
     * @param phone 获取的手机号码
     * @return
     */
    @RequestMapping(value="/sendSMS",method=RequestMethod.POST)
    public @ResponseBody ReturnContant sendSMS(HttpServletRequest request,String phone){
        //根据获取到的手机号发送验证码
    	System.out.println(phone);
        String code=GetMessageCode.getCode(phone); 
        System.out.println("短信验证码=="+code);
        returnContant.setStatus(1);
        returnContant.setData(code);
        return returnContant;
    }

	
	/**
	 * 获取生成验证码显示到 UI 界面
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value="/checkCode")
	public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		//设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	
	@RequestMapping(value="/user",method=RequestMethod.GET)//这是你填的url,你填的时候不要加斜杠
	public Msg signUp(String uname) {
		System.out.println(uname);
		Msg msg=new Msg();
		if(userService.getUserByName(uname)){//如果数据库中不存在该用户名
			
			msg.setMsg("注册成功");     //设置提示信息
			return msg.success();		//返回结果，这里没有返回结果，只是设置了状态码为100，具体看Msg类代码就懂
		}else {
			System.out.println("用户名已存在");
			msg.setMsg("用户名已存在");
			return msg.fail();
		}
		
	}
	
	//@RequestMapping("/user")
	public String getUser(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
		Msg result =new Msg();
		//下面参数表示起始页和每页显示5条数据
		PageHelper.startPage(pn, 5);
		//startPage紧跟的一个查询就是一个分页查询
		List<User> users=userService.getAll();
		//使用pageInfo包装查询后的结果，只需要将pageInfo交个页面就行了
		//封装了详细的分页信息,包括有我们查询出来的数据,5表示显示5页
		PageInfo page=new PageInfo(users,5);
		model.addAttribute("pageInfo",page);
		return "list";
		
		
	}
}
