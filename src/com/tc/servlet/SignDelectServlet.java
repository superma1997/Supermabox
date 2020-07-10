package com.tc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.pojo.SignTCcheckwork;
import com.tc.service.SignDelectService;


@WebServlet("/QDdelectServlet")
public class SignDelectServlet extends HttpServlet {
	SignDelectService ds=new SignDelectService();
	private static final long serialVersionUID = 1L;
    
    public SignDelectServlet() {
       
    }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SignDelectService ds=new SignDelectService();
		String pid = request.getParameter("pid");
		if(ds.delect(pid)){
			System.out.println("É¾³ý³É¹¦");
			request.getRequestDispatcher("QDselect.jsp").forward(request, response);
		}else{
			System.out.println("É¾³ýÊ§°Ü");
		}
		
	
	
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
