package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentdao;
import dto.student;
@WebServlet("/edit")
public class edit extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		student std=new student();
		std.setId(Integer.parseInt(req.getParameter("id")));
		std.setMobile(Integer.parseInt(req.getParameter("mobile")));
		std.setName(req.getParameter("name"));
        std.setGender(req.getParameter("age"));
        studentdao dao=new studentdao();
        dao.edit(std);
        List<student> list=dao.fetch();
        req.getSession().setAttribute("list",list);
        resp.sendRedirect("view.jsp");

	}

}
