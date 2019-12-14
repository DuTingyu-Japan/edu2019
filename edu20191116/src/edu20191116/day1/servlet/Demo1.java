package edu20191116.day1.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet {
	/*
	 * 1. 实现Servlet接口 2. 继承GenericServlet 实现service 3. 继承HttpServlet 复写doGet doPost
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		OutputStream ops = resp.getOutputStream();
//		Integer num = Integer.valueOf(req.getParameter("num"));
//		String result = isOddOrEven(num);
//		ops.write(result.getBytes());
		// resp.sendRedirect("jsp/check.jsp");
		req.getRequestDispatcher("jsp/check.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer num = Integer.valueOf(req.getParameter("num"));
		req.setAttribute("num", num);
		req.setAttribute("result", isOddOrEven(num));
		doGet(req, resp);
	}

	private String isOddOrEven(Integer num) {
		String result = null;
		if (num % 2 != 1) {
			result = num + ":odd";
		} else {
			result = num + ":even";
		}
		return result;
	}
}
