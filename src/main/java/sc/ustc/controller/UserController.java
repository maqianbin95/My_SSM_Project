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
	 * ��������
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/passwordUpdate",method=RequestMethod.POST)
	@ResponseBody
	public Msg updatePassword(HttpSession session,String oldPassword,String newPassword) {
		if(!oldPassword.equals(session.getAttribute("upassword"))) {
			return Msg.fail().add("msg", "ԭ�������");
		}
		Integer uid=(Integer) session.getAttribute("uid");
		Boolean flag=userService.updatePassword(uid,newPassword);
		if(!flag) {
			return Msg.fail().add("msg","�޸�����δ�ɹ������Ժ�����");
		}
		return Msg.success().add("msg", "�����޸ĳɹ�");
	}
	
	/**
	 * ��½��֤�˺ź������Ƿ�ƥ��
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
			return Msg.success().add("va_msg", "��¼�ɹ�").add("url", "http://localhost:8080/ssm_project/schools.html");
		}else {
			return Msg.fail().add("tip", "�û��������ڻ����������");
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
	 * �û�ע��
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/signup",method=RequestMethod.POST)//���������url,�����ʱ��Ҫ��б��
	@ResponseBody          //���ص���ajax
	public Msg signUp(@Valid User user,BindingResult bindingResult,String passcode,HttpSession session) {
		System.out.println(user);
		
		Msg msg=new Msg();
		
		String randomCode=(String) session.getAttribute("randomcode_key");
		
		System.out.println("***************************��֤��У��*********************************");
		System.out.println("��ȷ��֤��=="+randomCode);
		System.out.println("�û�������֤��=="+passcode);
		
		if(!bindingResult.hasErrors()&&randomCode.equalsIgnoreCase(passcode)) {
			
			if(userService.getUserByName(user.getUname())){//������ݿ��в����ڸ��û���
				userService.insertUser(user);
				System.out.println("ע��ɹ�");
				return msg.success().add("url", "success.html").add("tip", "ע��ɹ�");		//���ؽ��������û�з��ؽ����ֻ��������״̬��Ϊ100�����忴Msg�����Ͷ�
			}else {
				System.out.println("�û����Ѵ���");
				return msg.fail().add("tip", "�û����Ѵ���");
			}
		}else if(bindingResult.hasErrors()){//У���ʽ�����Ѵ����ֶκʹ�����Ϣ����map��
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			Map<String, Object> map=new HashMap<String, Object>();
			for(FieldError fieldError:fieldErrors) {
				
				System.out.println("***************************ע����ϢУ�����*********************************");
				System.out.println("�����ֶ�����"+fieldError.getField());
				System.out.println("������Ϣ��"+fieldError.getDefaultMessage());
				System.out.println();
				
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return msg.fail().add("tip","�����ֻ��Ų���Ϊ�ջ����");
		}else {
			return msg.fail().add("tip", "��֤������������");
		}
		
	}
	
	/**
	 * �˳���½
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
     * ���ݻ�ȡ�����ֻ��ŷ�����֤��
     * @param request
     * @param phone ��ȡ���ֻ�����
     * @return
     */
    @RequestMapping(value="/sendSMS",method=RequestMethod.POST)
    public @ResponseBody ReturnContant sendSMS(HttpServletRequest request,String phone){
        //���ݻ�ȡ�����ֻ��ŷ�����֤��
    	System.out.println(phone);
        String code=GetMessageCode.getCode(phone); 
        System.out.println("������֤��=="+code);
        returnContant.setStatus(1);
        returnContant.setData(code);
        return returnContant;
    }

	
	/**
	 * ��ȡ������֤����ʾ�� UI ����
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value="/checkCode")
	public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		//������Ӧ����,������������������ΪͼƬ
        response.setContentType("image/jpeg");
        
        //������Ӧͷ��Ϣ�������������Ҫ���������
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//���ͼƬ����
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	
	@RequestMapping(value="/user",method=RequestMethod.GET)//���������url,�����ʱ��Ҫ��б��
	public Msg signUp(String uname) {
		System.out.println(uname);
		Msg msg=new Msg();
		if(userService.getUserByName(uname)){//������ݿ��в����ڸ��û���
			
			msg.setMsg("ע��ɹ�");     //������ʾ��Ϣ
			return msg.success();		//���ؽ��������û�з��ؽ����ֻ��������״̬��Ϊ100�����忴Msg�����Ͷ�
		}else {
			System.out.println("�û����Ѵ���");
			msg.setMsg("�û����Ѵ���");
			return msg.fail();
		}
		
	}
	
	//@RequestMapping("/user")
	public String getUser(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
		Msg result =new Msg();
		//���������ʾ��ʼҳ��ÿҳ��ʾ5������
		PageHelper.startPage(pn, 5);
		//startPage������һ����ѯ����һ����ҳ��ѯ
		List<User> users=userService.getAll();
		//ʹ��pageInfo��װ��ѯ��Ľ����ֻ��Ҫ��pageInfo����ҳ�������
		//��װ����ϸ�ķ�ҳ��Ϣ,���������ǲ�ѯ����������,5��ʾ��ʾ5ҳ
		PageInfo page=new PageInfo(users,5);
		model.addAttribute("pageInfo",page);
		return "list";
		
		
	}
}
