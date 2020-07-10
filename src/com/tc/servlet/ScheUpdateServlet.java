package com.tc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.pojo.PersonalSchedule;
import com.tc.service.ScheduleServer;



public class ScheUpdateServlet extends HttpServlet{
	ScheduleServer ss=new ScheduleServer();
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取数据
		 int id=Integer.parseInt(req.getParameter("id"));
		 String date=req.getParameter("date");
		 String title=req.getParameter("title");
		 String type=req.getParameter("type");
		 String mess=req.getParameter("mess");
		
		 //封装数据
		PersonalSchedule psc=new PersonalSchedule();
		psc.setPid(id);
		psc.setDate(date);
		psc.setTitle(title);
		psc.setPtype(type);
		psc.setNotes(mess);
		
		  if(ss.updateSchedule(psc)){
			 System.out.println("修改成功");
			  req.getRequestDispatcher("scheselect?method=scheselect") .forward(req, resp);//转发
		  }
		
	}
	
}
