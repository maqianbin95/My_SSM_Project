package sc.ustc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sc.ustc.bean.AssessTb;
import sc.ustc.bean.Msg;
import sc.ustc.service.AssessService;

@Controller
public class AssessController {
	
	@Autowired
	private AssessService assessService;
	
	@RequestMapping("assess_submit")
	@ResponseBody
	public Msg assessSubmit(AssessTb assessTb) {
		Boolean flag=assessService.submitAssessTb(assessTb);
		return Msg.success();
	}
}
