package com.tc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.pojo.SignTCcheckwork;
import com.tc.service.SignZCService;


@WebServlet("/SelectMyServlet")
public class SignSelectMyServlet extends HttpServlet {
	SignZCService zcs=new SignZCService();
	private static final long serialVersionUID = 1L;

    public SignSelectMyServlet() {
       
    }

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<SignTCcheckwork> alist=zcs.selectAll();
		  request.setAttribute("select", alist);
		  try {
			request.getRequestDispatcher("QDselectmy.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}



}
