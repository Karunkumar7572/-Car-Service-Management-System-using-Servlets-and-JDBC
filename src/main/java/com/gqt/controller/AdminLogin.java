package com.gqt.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Admin;






public class AdminLogin extends HttpServlet {
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	Admin a = new Admin();
	a.setUsername(username);
	a.setPassword(password);
	
	int status;
	try {
		status = a.AdminLogin();
		if(status==-1) {
			response.sendRedirect("/car-service-form/Admininvalidusername.jsp");
			
		}
		else if(status ==0) {
			response.sendRedirect("/car-service-form/Admininvalidpassword.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("susername", username);
			response.sendRedirect("/car-service-form/Adminloginsuccess.jsp");
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	}
 }

		