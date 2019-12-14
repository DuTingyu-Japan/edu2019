package edu20191116.day1.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu20191116.day1.dao.EmpDAO;
import edu20191116.day1.dao.mapper.EmpMapper;
import edu20191116.day1.vo.EmpInfo;

@Component("empDAO")
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<EmpInfo> getEmpList() {
		return empMapper.getEmpList();
	}

	@Override
	public Integer getEmpCount() {
		return empMapper.getEmpCount();
	}

//	@Override
//	public DeptInfo getDeptById(Integer deptno) {
//		return deptMapper.getDeptById(deptno);
//	}
//
//	// 添加部门
//	@Override
//	public Integer addDept(DeptInfo dept) {
//		return deptMapper.addDept(dept);
//	}
//
//	// 修改部门
//	@Override
//	public Integer updateDept(DeptInfo dept) {
//		return deptMapper.updateDept(dept);
//	}
//
//	// 删除部门
//	@Override
//	public Integer deletedept(Integer deptno) {
//		return deptMapper.deleteDept(deptno);
//	}

}
