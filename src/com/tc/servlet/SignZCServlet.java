package com.tc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tc.dao.SignZCDao;
import com.tc.imp.SignZCImp;
import com.tc.pojo.SignTCcheckwork;
import com.tc.service.SignZCService;



@WebServlet("/ZCServlet")
public class SignZCServlet extends HttpServlet {
	SignZCService zcs=new SignZCService();
	private static final long serialVersionUID = 1L;
       

    public SignZCServlet() {
      
    }

	
    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SignZCService service=new SignZCService();
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		String day=request.getParameter("day");
		String hour=request.getParameter("hour");
		String min=request.getParameter("min");
		String second=request.getParameter("second");
		String name=request.getParameter("name");
		String date=(year+"-"+month+"-"+day+"-"+hour+"-"+min+"-"+second);
		System.out.println(date);
		HttpSession session=request.getSession();
		session.getAttribute("name");
		if(service.Qiandao(1, name, date, "³É¹¦")){
			
		}else{
			System.out.println("Ê§°Ü");
		}
		

     }
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
		ArrayList<SignTCcheckwork> alist=zcs.selectAll();
		  req.setAttribute("select", alist);
		  try {
			req.getRequestDispatcher("QDselect.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

		
}
