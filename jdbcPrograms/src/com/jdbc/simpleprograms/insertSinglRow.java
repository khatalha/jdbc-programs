package com.jdbc.simpleprograms;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class insertSinglRow {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con != null) {
			System.out.println("Connection is taken");
			
		}
		
		Statement st = (Statement) con.createStatement();
		
		String qurey = "insert into employee values(12,'Ali', 4000, 'Hyd' ";
		
		int add= st.executeUpdate(qurey);
		
		System.out.println("row inserted"+ add);
		
		
		
		try {
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
