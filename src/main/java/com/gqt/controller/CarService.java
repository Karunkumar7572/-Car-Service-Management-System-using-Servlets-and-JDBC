package com.gqt.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Customer;


public class CarService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		
		String name= request.getParameter("name");
		  String username = request.getParameter("username");
		  String password = request.getParameter("password");
		  String email = request.getParameter("email");
		  String confirmpassword  = request.getParameter("confirmpassword");
		  if(password.equals(confirmpassword)) {
			  HttpSession session = request.getSession(true);
			  session.setAttribute("sname", name); //sname = name
			  
			  Customer s = new Customer(name, username, password, email);
			  int rows = s.insert();
			  if(rows==0) {
				 response.sendRedirect("/car-service-form/addRegistrationFailure.jsp");
				 
			  }
			  else if(rows==-1) {
				  response.sendRedirect("/car-service-form/existingUser.jsp");
				  
			  }
			  else {
				  response.sendRedirect("/car-service-form/addRegistationSuccess.jsp");
			  }
			
				  			  	  
		  }
		  else {
			  response.sendRedirect("/car-service-form/passwordMismatch.jsp");
			  
		  }
		
			  
		  }
		
		  
		 
		  
		  
	}


