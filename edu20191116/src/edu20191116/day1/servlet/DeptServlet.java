package edu20191116.day1.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu20191116.day1.service.DeptService;
import edu20191116.day1.vo.DeptInfo;

public class DeptServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// MysqlDAO mysql = new MysqlDAO();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptService deptService = (DeptService) ctx.getBean("deptService");

		List<DeptInfo> list = deptService.getDeptList();
		req.setAttribute("cnt", list.size());
		req.setAttribute("list", list);
		req.getRequestDispatcher("jsp/dept.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
