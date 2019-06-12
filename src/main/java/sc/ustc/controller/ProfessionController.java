package sc.ustc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sc.ustc.bean.Msg;
import sc.ustc.bean.Profession;
import sc.ustc.service.ProfessionService;

@Controller
public class ProfessionController {

	@Autowired
	private ProfessionService professionService;
	
	@RequestMapping("/majors.json")
	@ResponseBody
	public Msg getProfessional() {
		List<String> list=professionService.getMajors();
		return Msg.success().add("majors", list);
	}
	
}
