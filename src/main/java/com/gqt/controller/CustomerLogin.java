package com.gqt.controller;




import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Customer;






public class CustomerLogin extends HttpServlet {
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	Customer c = new Customer();
	c.setUserName(username);
	c.setPassword(password);
	int status;
	try {
		status = c.customerLogin();
		if(status==-1) {
			response.sendRedirect("/car-service-form/customerinvalidusername.jsp");
			
		}
		else if(status ==0) {
			response.sendRedirect("/car-service-form/customerinvalidpassword.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("susername", username);
			response.sendRedirect("/car-service-form/customerloginsuccess.jsp");
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	}
 }

		