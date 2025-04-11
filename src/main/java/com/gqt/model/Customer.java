package com.gqt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
	private String name;
	private String username;
	private String password;
	private String email;
	public  String confirmpassword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public Customer(String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int insert() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep","root", "root");
			String checkQuery = "SELECT COUNT(*) FROM customer WHERE username = ?";
            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setString(1, username);
            ResultSet res = checkStmt.executeQuery();
            res.next();
            if (res.getInt(1) > 0) {
                return -1;  // Name exists, return -1 to signal the servlet
            }
		  String s = "insert into customer values(?, ?, ?, ?)";
		  PreparedStatement pstmt = con.prepareStatement(s);
		  pstmt.setString(1, name);
		  pstmt.setString(2, username);
		  pstmt.setString(3, password);
		  pstmt.setString(4, email);
		 
		
		  
		  int rows= pstmt.executeUpdate();
		  return rows;
		  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;

			}
	public int customerLogin() throws SQLException {
		 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep", "root", "root");
	        
		String s1 = "select * from customer where username =?";
		PreparedStatement pstmt1 = con.prepareStatement(s1);
		 pstmt1.setString(1, username);
	       
	        
	        ResultSet res = pstmt1.executeQuery();
	        if(res.next()) {
	        	if(res.getString(3).equals(password)) {
	        		return 1; //login sucess
	        	}
	        	else {
	        		return 0;//invalid password
	        	}
	        }
	        else {
	        	return -1 ; // invalid username
	        }

	
	}
	
	}