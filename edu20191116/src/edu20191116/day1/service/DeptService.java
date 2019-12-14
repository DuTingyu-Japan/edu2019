package edu20191116.day1.service;

import java.util.List;

import edu20191116.common.page.PaginationResult;
import edu20191116.day1.vo.DeptInfo;

public interface DeptService {

	List<DeptInfo> getDeptList();
	
	Integer getDeptCount();
	
	DeptInfo getDeptById(Integer deptno);
	
	//添加部门到数据库
	Integer addDept(DeptInfo dept);
	
	//修改部门
	Integer updateDept(DeptInfo dept);
	
	//删除部门
	Integer deletedept(Integer deptno);

	//分页
	PaginationResult<List<DeptInfo>> getDeptPage(Integer pageIndex, Integer pageSize);
}
