package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Car;
public class AddDetails extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
	HttpSession session = request.getSession();
      String username=	(String) session.getAttribute("susername");
		
		  String carmodel = request.getParameter("carmodel");
		  String cartype = request.getParameter("cartype");
		  String carreg = request.getParameter("carreg");
		
		 Car c = new Car();
		 c.setUsername(username);
		 c.setCarmodel(carmodel);
		 c.setCartype(cartype);
		 c.setCarreg(carreg);
		 
		 int rows = c.insert();
		  if(rows==1) {
			 response.sendRedirect("/car-service-form/carsucessfullyAdded.jsp");
			 
		  }
		  else {
			  response.sendRedirect("/car-service-form/carFailedtoAdd.jsp");
			  
		  }
			  
			  
		  }
		
			  
		  
		
		  
		 
		  
		  
	}
