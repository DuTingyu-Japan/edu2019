package edu20191116.day1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu20191116.day1.vo.DeptInfo;

public class MysqlDAO {

	public List<DeptInfo> getDeptList() {
		String url = "jdbc:mysql://localhost:3306/setsu1019";
		List<DeptInfo> list = new ArrayList<DeptInfo>();
		try {
			// 1.注册驱动
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 2.获取连接
			Connection conn = DriverManager.getConnection(url, "root", "root");
			// 3.创建stmt
			Statement stmt = conn.createStatement();
			// 4.查询sql
			String sql = "select * from dept";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DeptInfo dept = new DeptInfo();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				list.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
