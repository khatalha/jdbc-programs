package com.ResultSetType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//rs.next()
//rs.previous()
//ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY


public class nextAndPreivous {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("connection taken");
		}
		String query = "select * from employee";
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery(query);
	
		System.out.println("forword direction");
		boolean flag= false;
		while(rs.next()) {
			
			flag= true;
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println(rs.getString(4));
			System.out.println("---------------------");
		}
		
		System.out.println("Backword Direction");
		while(rs.previous()) {
			
			flag= true;
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println(rs.getString(4));
			System.out.println("---------------------");
		}
		
		if(flag==false) {
			System.out.println("no match recored found");
		}
		
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		}
		

}
