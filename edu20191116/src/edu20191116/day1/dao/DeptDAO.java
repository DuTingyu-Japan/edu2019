package edu20191116.day1.dao;

import java.util.List;

import edu20191116.day1.vo.DeptInfo;

public interface DeptDAO {

	List<DeptInfo> getDetpList();

	//获得部门数
	Integer getDeptCount();

	DeptInfo getDeptById(Integer deptno);

	// 添加部门
	Integer addDept(DeptInfo dept);

	// 修改部门
	Integer updateDept(DeptInfo dept);

	// 删除部门
	Integer deletedept(Integer deptno);

	//带分页的部门列表
	List<DeptInfo> getDetpList(Integer cursor, Integer offset);
	
}
