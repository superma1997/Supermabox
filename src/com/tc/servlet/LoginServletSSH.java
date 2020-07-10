package com.tc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tc.service.LoginServiceSH;

public class LoginServletSSH extends HttpServlet{
	LoginServiceSH loginService=new LoginServiceSH();

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		String strName=req.getParameter("txtName");
		String strPwd=req.getParameter("txtPwd");
		/*String strRole=req.getParameter("txtRole");*/
		HttpSession session=req.getSession();
		session.setAttribute("name", strName);
		/*session.setAttribute("role", strRole);*/
		if(loginService.selectUserByNameAndPassword(strName, strPwd)){
			req.getRequestDispatcher("QDmain.jsp").forward(req, resp);
			System.out.println(111);
		}else{
			out.println("Ê§°Ü");
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
