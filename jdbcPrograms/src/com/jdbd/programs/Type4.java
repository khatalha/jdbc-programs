package com.jdbd.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Type4 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1512:XE","root","123456789");
		
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
