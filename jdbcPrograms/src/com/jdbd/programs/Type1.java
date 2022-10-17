package com.jdbd.programs;

import java.sql.*;

public class Type1 {

	public static void main(String[] args) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		Connection con = DriverManager.getConnection("jdbc:odbc:derodsn","root","123456789");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from Student");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
		}
		
		con.close();

	}

}
