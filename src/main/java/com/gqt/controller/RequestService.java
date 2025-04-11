package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Car;






public class RequestService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	      String username=	(String) session.getAttribute("susername");
		String servicetype = request.getParameter("servicetype");
		String carreg = request.getParameter("carreg");

		 Car c = new Car();
		 c.setUsername(username);
		 c.setServicetype(servicetype);
	
		 c.setCarreg(carreg);
		 int rows = c.insertRequest();
		  if(rows==0) {
			  response.sendRedirect("/car-service-form/requestServiceFailed.jsp");
			
			 
		  }
		  else {
			  response.sendRedirect("/car-service-form/requestServiceSuccess.jsp");
			  
		  }
	}
}