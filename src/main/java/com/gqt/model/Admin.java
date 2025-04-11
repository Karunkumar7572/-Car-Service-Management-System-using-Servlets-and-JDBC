package com.gqt.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {
	private String username;
	private String password;
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int AdminLogin() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt_sep","root", "root");
			  String s2 = "select * from admin where username=?";
			  PreparedStatement pstmt = con.prepareStatement(s2);
			  pstmt.setString(1, username);
			 ;
			ResultSet res =  pstmt.executeQuery();
			if(res.next()) {
				if(res.getString(2).equals(password)) {
					return 1;
				}
				else {
					return 0;
				}
			}
			else {
				return -1;
			}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	
		
	
}
