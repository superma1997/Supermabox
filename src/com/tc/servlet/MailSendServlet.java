package com.tc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tc.pojo.Email;
import com.tc.service.MailService;



public class MailSendServlet extends HttpServlet{
  MailService service=new MailService();
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Email email=new Email();
		resp.setContentType("text/html;utf-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		 String title=req.getParameter("title");
		 String sname=req.getParameter("sName");
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
         String time=df.format(new Date());
         String rname=req.getParameter("rName");
         String text=req.getParameter("text");
         
         email.setsName(sname);
         email.setTitle(title);
         email.setrName(rname);
         email.setTime(time);
         email.setText(text);
         if(service.SendEmail(email)){
        		req.getRequestDispatcher("MailSendEmail.jsp").forward(req, resp);
         }else{
        	 out.println("发送失败");
        	 
         }
         
         

		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Email email=new Email();
		resp.setContentType("text/html;utf-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		 String title=req.getParameter("title");
		 String sname=req.getParameter("sName");
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置日期格式
         String time=df.format(new Date())+"(30min)";
         String rname=req.getParameter("rName");
         String text=req.getParameter("text");
         HttpSession session=req.getSession();
         email.setsName(sname);
         email.setTitle(title);
         email.setrName(rname);
         email.setTime(time);
         email.setText(text);
        session.setAttribute("email", email);
        Email emails=(Email) session.getAttribute("email");
         if(service.SaveEmail(emails)){
        		req.getRequestDispatcher("SendEmail.jsp").forward(req, resp);
         }else{
        	 out.println("发送失败");
        	 
         }
	}

}
