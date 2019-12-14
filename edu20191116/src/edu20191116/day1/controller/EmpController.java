package edu20191116.day1.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import edu20191116.day1.service.EmpService;
import edu20191116.day1.vo.DeptInfo;
import edu20191116.day1.vo.EmpInfo;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;

	// value写的是请求路径
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getEmpList(ModelMap modelMap) {
		// 查询员工总数
		Integer cnt = empService.getEmpCount();
		List<EmpInfo> list = empService.getEmpList();
		// modelmap将数据set到页面。
		modelMap.addAttribute("cnt", cnt);
		modelMap.addAttribute("list", list);
		// 如果方法是string类型的，那么return的值就是返回的页面名。这里指的是dept.jsp
		return "emp";
	}
}
