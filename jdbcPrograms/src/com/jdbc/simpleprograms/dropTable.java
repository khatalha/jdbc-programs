package com.jdbc.simpleprograms;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class dropTable {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con != null) {
			System.out.println("Connection is taken");
			
		}
		
		Statement st = (Statement) con.createStatement();
		
		String qurey = "drop table details";
		
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
