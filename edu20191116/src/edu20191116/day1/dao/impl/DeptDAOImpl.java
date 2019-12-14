package edu20191116.day1.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu20191116.day1.dao.DeptDAO;
import edu20191116.day1.dao.mapper.DeptMapper;
import edu20191116.day1.vo.DeptInfo;

@Component("deptDAO")
public class DeptDAOImpl implements DeptDAO {

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<DeptInfo> getDetpList() {
		return deptMapper.getDeptList();
	}

	@Override
	public Integer getDeptCount() {
		return deptMapper.getDeptCount();
	}

	@Override
	public DeptInfo getDeptById(Integer deptno) {
		return deptMapper.getDeptById(deptno);
	}

	// 添加部门
	@Override
	public Integer addDept(DeptInfo dept) {
		return deptMapper.addDept(dept);
	}

	// 修改部门
	@Override
	public Integer updateDept(DeptInfo dept) {
		return deptMapper.updateDept(dept);
	}

	// 删除部门
	@Override
	public Integer deletedept(Integer deptno) {
		return deptMapper.deleteDept(deptno);
	}

	// 带分页的部门列表
	@Override
	public List<DeptInfo> getDetpList(Integer cursor, Integer offset) {
		return deptMapper.getDeptPage(cursor,offset);
	}

}
