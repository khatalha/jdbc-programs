package com.jdbc.simpleprograms;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class updateSingleRow {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con != null) {
			System.out.println("Connection is taken");
			
		}
		
		Statement st = (Statement) con.createStatement();
		
		String qurey = "update employee set ename='barkatullah' where eno=12";
		
		int up= st.executeUpdate(qurey);
		
		System.out.println("row updated"+ up);
		 
		
		
		try {
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
