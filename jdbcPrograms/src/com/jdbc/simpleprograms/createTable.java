package com.jdbc.simpleprograms;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class createTable {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DBUtil.getConnection();
		if(con != null) {
			System.out.println("Connection is taken");
			
		}
		
		Statement st = (Statement) con.createStatement();
		
		String qurey = "create table employee (eno number, ename varchar(10), esal number(10,2), eadd varchar(10)";
		
		st.executeUpdate(qurey);
		
		System.out.println("Table is Created");
		
		
		
		try {
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	

}
