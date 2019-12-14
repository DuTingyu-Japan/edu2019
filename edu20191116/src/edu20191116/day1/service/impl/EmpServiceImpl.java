package edu20191116.day1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu20191116.day1.dao.EmpDAO;
import edu20191116.day1.service.EmpService;
import edu20191116.day1.vo.EmpInfo;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDAO empDAO;

	@Override
	public List<EmpInfo> getEmpList() {
		return empDAO.getEmpList();
	}

	@Override
	public Integer getEmpCount() {
		return empDAO.getEmpCount();
	}

//	@Override
//	public DeptInfo getDeptById(Integer deptno) {
//		return deptDAO.getDeptById(deptno);
//	}
//
//	@Override
//	public Integer addDept(DeptInfo dept) {
//		return deptDAO.addDept(dept);
//	}
//
//	@Override
//	public Integer updateDept(DeptInfo dept) {
//		return deptDAO.updateDept(dept);
//	}
//
//	@Override
//	public Integer deletedept(Integer deptno) {
//		return deptDAO.deletedept(deptno);
//	}
}
