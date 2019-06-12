package sc.ustc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import sc.ustc.bean.Msg;
import sc.ustc.bean.School;
import sc.ustc.service.ProfessionService;
import sc.ustc.service.SchoolService;

@Controller
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@Autowired
	private ProfessionService professionService;
	
	/**
	 * ���ѧУ����ת��ѧУ�Ľ���
	 */
	@RequestMapping("/school_detail")
	@ResponseBody
	public Msg getSchoolDetail(String sname) {
		School school=schoolService.getSchoolsByName(sname);
		school.setHits(school.getHits()+1);
		int flag=schoolService.updateSchool(school);
		System.out.println(school.getSname()+"�����="+school.getHits());
		return Msg.success().add("school", school);
	}
	
	/**
	 * ��ҳ�Ϸ���ʾ�û���
	 */
	@RequestMapping("/uname.json")
	@ResponseBody
	public Msg getUName(HttpSession session) {
		String uname=(String) session.getAttribute("uname");
		if(uname!=null) {
			System.out.println("session���ڣ��û��ѵ�½");
			return Msg.success().add("name", session.getAttribute("uname"));
		}else {
			return Msg.fail();
		}
	}
	
	/**
	 * ��ȡ�����б�
	 */
	@RequestMapping("/countries.json")
	@ResponseBody
	public Msg getCountries() {
		List<String> list=schoolService.getAllContries();
		return Msg.success().add("countries", list);
	}
	
	
	/**
	 * ��ȡ����ԺУ�б������������
	 */
	@RequestMapping("/hotCountries.json")
	@ResponseBody
	public Msg getHotCountries() {
		List<School> list=schoolService.getAllSchools();
		return Msg.success().add("hotCountries", list);
	}
	
	/**
	 * ��ѡ����
	 */
	@RequestMapping("/conditions.json")
	@ResponseBody
	public Msg getHotConditions() {
		List<String> countires=schoolService.getAllContries();
		List<String> majors=professionService.getMajors();
		return Msg.success().add("countries", countires).add("majors", majors);
	}
	
	/**
	 * ���ز�ѯ�������ҳ�Ұ����������
	 */
	@RequestMapping("/getOnePageSchools.json")
	@ResponseBody
	public Msg getOnePageSchools(String scountry,String snature,String sname,String sspecialprofession,
			@RequestParam(required=true,defaultValue="1")Integer pageNo) {
		School school=new School();
		if(!"ȫ��".equals(scountry)) {
			school.setScountry(scountry);
		}
		if(!"ȫ��".equals(sspecialprofession)) {
			school.setSspecialprofession(sspecialprofession);
		}
		if(!"ȫ��".equals(snature)) {
			school.setSnature(snature);
		}
		if(!"".equals(sname)) {
			school.setSname(sname);
		}
		
		PageHelper.startPage(pageNo,5);
		List<School> schools=schoolService.selectSchoolsByConditions(school);
		System.out.println(schools);
		PageInfo<School> pageInfo=new PageInfo<School>(schools);
		return Msg.success().add("schools", schools).add("pageInfo",pageInfo);//.add("pageInfo",pageInfo)
	}
	
}
