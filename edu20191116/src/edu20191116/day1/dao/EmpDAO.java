package edu20191116.day1.dao;

import java.util.List;
import edu20191116.day1.vo.EmpInfo;

public interface EmpDAO {

	List<EmpInfo> getEmpList();

	Integer getEmpCount();

//	DeptInfo getDeptById(Integer deptno);
//
//	// 添加部门
//	Integer addDept(DeptInfo dept);
//
//	// 修改部门
//	Integer updateDept(DeptInfo dept);
//
//	// 删除部门
//	Integer deletedept(Integer deptno);
}
