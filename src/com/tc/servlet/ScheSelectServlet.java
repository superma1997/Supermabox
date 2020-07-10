package com.tc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.pojo.PersonalSchedule;
import com.tc.service.ScheduleServer;



public class ScheSelectServlet extends HttpServlet{
	ScheduleServer ss=new ScheduleServer();
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		PrintWriter out1=resp.getWriter();
		
		String strMethod=req.getParameter("method");
		 String strId = req.getParameter("id");//从页面获取id
			
		 switch(strMethod){
			case "scheselect"://查询全部用户
				 select(req,resp);
				 req.getRequestDispatcher("Schepersonal.jsp").forward(req, resp);//转发
			   break;
			case "schedelete"://删除
				if(ss.removePersonById(strId));{
			    select(req,resp);	
		   req.getRequestDispatcher("Schepersonal.jsp").forward(req, resp);//将请求转�?
				}
		   break;
			case "scheupdate"://锟睫革拷
			     //锟斤拷询锟斤拷锟斤拷锟斤拷录
			  PersonalSchedule ps= ss.selectPersById(strId);
			 //锟斤拷锟斤拷锟捷凤拷锟斤拷锟斤拷request锟斤拷锟斤拷锟斤�?
			  req.setAttribute("per", ps);
			  System.out.println(ps);
			  //转锟斤拷 锟斤拷update.jsp锟斤拷锟斤拷锟斤拷锟斤拷锟绞�?
			  req.getRequestDispatcher("Schepersonal.jsp").forward(req,resp);
			  break;
			}

			
	}
	public void select(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		 List<PersonalSchedule> alist=ss.selectAllPersons();
	     req.setAttribute("pers", alist);
	    
	  
	}
}
