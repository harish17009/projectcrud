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

@WebServlet("/fetch")
public class fetch extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		studentdao dao= new studentdao();
       List<student> list=dao.fetch();
       req.getSession().setAttribute("list", list);
       resp.sendRedirect("view.jsp");
				
	}

}
