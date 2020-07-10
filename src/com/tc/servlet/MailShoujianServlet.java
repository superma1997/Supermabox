package com.tc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.pojo.Email;
import com.tc.service.MailService;

public class MailShoujianServlet extends HttpServlet{
MailService  service=new MailService();
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;utf-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		String rname="ËÎ½­";
		ArrayList<Email> alist=service.ShoujianEmail(rname);
		  req.setAttribute("email", alist);
		  req.getRequestDispatcher("MailShouJian.jsp").forward(req, resp);
		
	
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req,resp);
	}




 

}
