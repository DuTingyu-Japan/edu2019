package edu20191116.day1.service;

import java.util.List;

import edu20191116.day1.vo.DeptInfo;
import edu20191116.day1.vo.EmpInfo;

public interface EmpService {

	// 获得员工列表
	List<EmpInfo> getEmpList();

	// 获得员工总数
	Integer getEmpCount();

	// DeptInfo getDeptById(Integer deptno);

	// 添加部门到数据库
	// Integer addDept(DeptInfo dept);

	// 修改部门
	// Integer updateDept(DeptInfo dept);

	// 删除部门
	// Integer deletedept(Integer deptno);
}
