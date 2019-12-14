package edu20191116.day1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import edu20191116.common.page.PaginationResult;
import edu20191116.day1.service.DeptService;
import edu20191116.day1.vo.DeptInfo;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	// value写的是请求路径。。。。
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getDeptList(ModelMap modelMap) {
		// 查询部门总数
		Integer cnt = deptService.getDeptCount();
		List<DeptInfo> list = deptService.getDeptList();
		// modelmap将数据set到页面
		modelMap.addAttribute("cnt", cnt);
		modelMap.addAttribute("list", list);
		return "dept";// 如果方法是string类型的，那么return的值就是返回的页面名。这里指的是dept.jsp
	}

	// value="/{deptno}"指的是拦截的是一个变量，ResponseBody指的是返回的是一个json格式，可以用ajax等来接收
	@RequestMapping(value = "/{deptno}", method = RequestMethod.GET)
	@ResponseBody
	public DeptInfo getDept(@PathVariable Integer deptno) {
		return deptService.getDeptById(deptno);
	}

	// 添加部门页面初始化（传一个空白的DeptInfo对象）
	@RequestMapping(value = "/addDept", method = RequestMethod.GET)
	public String addDept(ModelMap modelMap) {
		modelMap.put("dept", new DeptInfo());
		return "add_dept";
	}

	// 添加部门（提交数据）
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addDeptPost(DeptInfo dept, ModelMap modelMap) {
		deptService.addDept(dept);
		// 重新注入数据到页面，这样再跳转到页面才会有数据
		return getDeptList(modelMap);
	}

	// 修改页面初始化(点击修改按钮后，把deptno作为参数传过来了，然后根据deptno查询数据库，将此条数据回显到页面上)
	@RequestMapping(value = "/{deptno}/update", method = RequestMethod.GET)
	public String updateDept(ModelMap modelMap, @PathVariable Integer deptno) {
		DeptInfo dept = deptService.getDeptById(deptno);
		modelMap.put("dept", dept);
		return "update_dept";
	}

	// 修改部门（提交数据）
	// @PathVariable是将请求路径中的deptno取出，作为参数传到方法里面了
	@RequestMapping(value = "/{deptno}/update", method = RequestMethod.POST)
	public String updateDeptPost(DeptInfo dept, ModelMap modelMap, @PathVariable Integer deptno) {
		deptService.updateDept(dept);
		// 重新注入数据到页面，这样再跳转到页面才会有数据
		// 连着点两次修改，要更改请求路径，所以用redirect回开始页面
		return "redirect:/dept/list";
	}

	// 删除部门
	@RequestMapping(value = "/{deptno}/delete", method = RequestMethod.GET)
	public String deleteDept(@PathVariable Integer deptno) {
		deptService.deletedept(deptno);
		return "redirect:/dept/list";
	}

	// 分页
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	// 不加ResponseBody的话，返回不到json格式
	@ResponseBody
	public PaginationResult<List<DeptInfo>> getDeptPage(Integer pageIndex, Integer pageSize) {
		return deptService.getDeptPage(pageIndex, pageSize);
	}

}
