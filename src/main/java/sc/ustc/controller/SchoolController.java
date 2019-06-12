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
	 * 点击学校，跳转到学校的介绍
	 */
	@RequestMapping("/school_detail")
	@ResponseBody
	public Msg getSchoolDetail(String sname) {
		School school=schoolService.getSchoolsByName(sname);
		school.setHits(school.getHits()+1);
		int flag=schoolService.updateSchool(school);
		System.out.println(school.getSname()+"点击量="+school.getHits());
		return Msg.success().add("school", school);
	}
	
	/**
	 * 首页上方显示用户名
	 */
	@RequestMapping("/uname.json")
	@ResponseBody
	public Msg getUName(HttpSession session) {
		String uname=(String) session.getAttribute("uname");
		if(uname!=null) {
			System.out.println("session存在，用户已登陆");
			return Msg.success().add("name", session.getAttribute("uname"));
		}else {
			return Msg.fail();
		}
	}
	
	/**
	 * 获取国家列表
	 */
	@RequestMapping("/countries.json")
	@ResponseBody
	public Msg getCountries() {
		List<String> list=schoolService.getAllContries();
		return Msg.success().add("countries", list);
	}
	
	
	/**
	 * 获取热门院校列表，按点击量排序
	 */
	@RequestMapping("/hotCountries.json")
	@ResponseBody
	public Msg getHotCountries() {
		List<School> list=schoolService.getAllSchools();
		return Msg.success().add("hotCountries", list);
	}
	
	/**
	 * 赛选条件
	 */
	@RequestMapping("/conditions.json")
	@ResponseBody
	public Msg getHotConditions() {
		List<String> countires=schoolService.getAllContries();
		List<String> majors=professionService.getMajors();
		return Msg.success().add("countries", countires).add("majors", majors);
	}
	
	/**
	 * 返回查询结果，分页且按点击量排序
	 */
	@RequestMapping("/getOnePageSchools.json")
	@ResponseBody
	public Msg getOnePageSchools(String scountry,String snature,String sname,String sspecialprofession,
			@RequestParam(required=true,defaultValue="1")Integer pageNo) {
		School school=new School();
		if(!"全部".equals(scountry)) {
			school.setScountry(scountry);
		}
		if(!"全部".equals(sspecialprofession)) {
			school.setSspecialprofession(sspecialprofession);
		}
		if(!"全部".equals(snature)) {
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
