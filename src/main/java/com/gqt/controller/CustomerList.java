package com.gqt.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Car;

/**
 * Servlet implementation class CustomerList
 */
public class CustomerList extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Car c = new Car();
		 ArrayList<Car> customerCarDetails = c.customerList();
		 HttpSession session = request.getSession();
				 session.setAttribute("scustomerCarDetails", customerCarDetails);
		 
		 if(customerCarDetails!=null) {
			 response.sendRedirect("/car-service-form/customerListSuccess.jsp");
			 
		 }
		 else {
			 response.sendRedirect("/car-service-form/customerListFailed.jsp");
			 
		 }
		 
		 
		 
		 
		 
		 
	}
}