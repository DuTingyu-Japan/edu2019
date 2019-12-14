package edu20191116.day1.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import edu20191116.day1.vo.EmpInfo;

public interface EmpMapper {

	// 直接用注解写sql语句。或者再mapper.xml中写，都可以
	@Select("select empno, ename, job, mgr, hiredate, sal, deptno from emp")
	@ResultMap("empResultMap")
	List<EmpInfo> getEmpList();

	@Select("select count(*) from emp")
	Integer getEmpCount();

//	@Select("select * from dept where deptno = #{id}")
//	DeptInfo getDeptById(@Param("id") Integer deptno);
//
//	// 添加部门
//	Integer addDept(DeptInfo dept);
//
//	// 修改部门
//	Integer updateDept(DeptInfo dept);
//
//	// 删除部门
//	// @Delete("delete from dept where deptno = #{deptno}")
//	Integer deleteDept(Integer deptno);
}
