package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.model.Car;


public class UpdateServiceStatus extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String carreg = request.getParameter("carreg");
		Car c = new Car();
		c.setCarreg(carreg);
		int status = c.updateServiceStatus();
		if(status==0) {
			response.sendRedirect("/car-service-form/updateservicestatusFailure.jsp");
		}
		else {
		response.sendRedirect("/car-service-form/updateservicestatussuccess.jsp");
		}
		
	}

}
