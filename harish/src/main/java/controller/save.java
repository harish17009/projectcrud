package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentdao;
import dto.student;
@WebServlet("/save")
public class save extends HttpServlet 
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("name");
		if("harish".equals(uname))
		{
			resp.getWriter().print("restricted user");
		}
		else
		{student std=new student();
		std.setName(req.getParameter("name"));
		std.setMobile(Integer.parseInt(req.getParameter("mobile")));
		std.setGender(req.getParameter("gender"));
		studentdao dao=new studentdao();
		dao.save(std);
		resp.getWriter().print("inserted");
		req.getRequestDispatcher("home.html").include(req, resp);
		}
	}


}
