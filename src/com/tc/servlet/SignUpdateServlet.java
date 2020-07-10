package com.tc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.security.ntlm.Client;
import com.tc.pojo.SignTCcheckwork;
import com.tc.service.SignUpdateService;


@WebServlet("/UpdateServlet")
public class SignUpdateServlet extends HttpServlet {
	 SignUpdateService us=new SignUpdateService();
	private static final long serialVersionUID = 1L;
       
   
    public SignUpdateServlet() {
        
    }

	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		//获取数据
		
		
		int strId=(Integer.parseInt(req.getParameter("txtId")));
		
		req.setAttribute("strid", strId);
		
		
		
		req.getRequestDispatcher("QDUpdate.jsp").forward(req, resp);;
		
		
		/*
		String strName=req.getParameter("txtName");
		String strMdate=req.getParameter("txtMdate");
		String strMstate=req.getParameter("txtMstate");
		System.out.println(strId);

		
		TCcheckwork tck=new TCcheckwork();
		tck.setId(strId);
		tck.setName(strName);
		tck.setMdate(strMdate);
		tck.setMstate(strMstate);
		
		if(us.UpdateTCcheckwork(tck)){
			req.setAttribute("update", tck);
			req.getRequestDispatcher("Update.html").forward(req, resp);
		}
		Client c=us.UpdateTCcheckwork(strId);
		req.setAttribute("news", c);
		update(req,resp);
		//转发
		req.getRequestDispatcher("clientupdate.jsp").forward(req,resp);
	    select(req,resp);*/

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
