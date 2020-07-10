package com.tc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.pojo.Email;
import com.tc.service.MailService;

public class MailDeleteServlet extends HttpServlet{
MailService service=new MailService();
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;utf-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		String strMethod=req.getParameter("method");
		String id=req.getParameter("id");
		String name="ËÎ½­";
			switch(strMethod){
			case"fajian":
				service.SendDeleteEmail(id);
				req.getRequestDispatcher("fajian").forward(req, resp);
				break;
			case"shoujian":
				service.ReciveDeleteEmail(id);
				req.getRequestDispatcher("shoujian").forward(req, resp);
				break;
			case"caogao":
				service.DeleteEmail(id,name);
			req.getRequestDispatcher("caogao").forward(req, resp);
			break;
			case"laji":
				service.DeleteEmail(id,name);
				req.getRequestDispatcher("laji").forward(req, resp);
				break;
			case"huanyuan":
				service.HuanyuanEmail(id,name);
				req.getRequestDispatcher("laji").forward(req, resp);
				break;
			case"state":
				service.StatementEmail(id);
				req.getRequestDispatcher("shoujian").forward(req, resp);
				break;
			}
			
	
	}

	@Override
	public  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
