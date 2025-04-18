package com.gqt.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Car;



public class RetriveDetails extends HttpServlet {
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
        String username=	(String) session.getAttribute("susername");
        
        Car c = new Car();
       
        c.setUsername(username);
        ArrayList<Car> carList = c.retriveInformation();
        session.setAttribute("scarList", carList);
        
       if(carList==null) {
            response.sendRedirect("/car-service-form/retriveInformationFailed.jsp");
       }
       else {

            response.sendRedirect("/car-service-form/retriveInformationSuccess.jsp");
       }
        
    }
}
