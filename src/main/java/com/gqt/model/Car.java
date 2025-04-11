package com.gqt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Car {
		@Override
	public String toString() {
		return "Car [username=" + username + ", carmodel=" + carmodel + ", cartype=" + cartype + ", carreg=" + carreg
				+ ", servicetype=" + servicetype + ", status=" + status + "]";
	}
		public Car(String username, String carmodel, String cartype, String carreg, String servicetype, String status) {
		super();
		this.username = username;
		this.carmodel = carmodel;
		this.cartype = cartype;
		this.carreg = carreg;
		this.servicetype = servicetype;
		this.status = status;
	}
		public Car() {
			super();
		}
		public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getCarreg() {
		return carreg;
	}
	public void setCarreg(String carreg) {
		this.carreg = carreg;
	}
	public String getServicetype() {
		return servicetype;
	}
	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		private String username;
		private String carmodel;
		private String cartype;
		private String carreg;
		private String servicetype;
		private String status;
		public int insert() {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep","root", "root");
				
			  String s = "insert into car values(?, ?, ?, ?,?,?)";
			  PreparedStatement pstmt = con.prepareStatement(s);
			  pstmt.setString(1, username);
			  pstmt.setString(2, carmodel);
			  pstmt.setString(3, cartype);
			  pstmt.setString(4, carreg);
			  pstmt.setString(5, "false");
			  pstmt.setString(6, "false");
			  int rows= pstmt.executeUpdate();
			  
			 
			
			
			 
			  return rows;
			  
			
			  
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return 0;

				}
		public int insertRequest() {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep","root", "root");
				  String s2 = "update car set servicetype =? where username=? and carreg=?";
				  PreparedStatement pstmt2 = con.prepareStatement(s2);
				  pstmt2.setString(1, servicetype);
				  pstmt2.setString(2, username);
				  pstmt2.setString(3, carreg);
				int rows=  pstmt2.executeUpdate();
				return rows;
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			return 0;

		}
		public ArrayList<Car> retriveInformation(){
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep","root", "root");
				  String s = "select * from car where username=?";
				  PreparedStatement pstmt2 = con.prepareStatement(s);
			
				  pstmt2.setString(1, username);
				 
				ResultSet res =  pstmt2.executeQuery();
				ArrayList<Car> carList = new ArrayList<>();
				while(res.next()) {
				 username = res.getString(1);
					 carmodel = res.getString(2);
					 cartype  = res.getString(3);
					 carreg = res.getString(4);
					 servicetype = res.getString(5);
					 status = res.getString(6);
					 Car c = new Car(username, carmodel, cartype, carreg, servicetype, status);
							 carList.add(c);
					
				}
				return carList;
				
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
			
		}
		public ArrayList<Car> customerList() {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep","root", "root");
				String s = "select * from car";
				PreparedStatement pstmt = con.prepareStatement(s);
				ResultSet res = pstmt.executeQuery();
				ArrayList<Car> customerCarDetails = new ArrayList<Car>();
				while(res.next()) {
					username = res.getString(1);
					carmodel = res.getString(2);
					cartype = res.getString(3);
					carreg = res.getString(4);
					servicetype = res.getString(5);
					status = res.getString(6);
					
					
					 Car c = new Car(username, carmodel, cartype, carreg, servicetype, status);
							
							customerCarDetails.add(c);
							
				}
				return customerCarDetails;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return null;
		}
	public int updateServiceStatus() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep","root", "root");
		String s ="update car set status=? where carreg=?";
		PreparedStatement pstmt = con.prepareStatement(s);
		pstmt.setString(1, "completed");
		pstmt.setString(2, carreg);
	int rows = pstmt.executeUpdate();
	return rows;
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	return 0;
		
	}
	 
			


}
