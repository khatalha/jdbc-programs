package com.simple.selecter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.simpleprograms.DBUtil;

public class noOfRowAvalible {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("connection is tsken");
			
		}
		
		Statement st = con.createStatement();
		
		String data= "select count(*)from employee";
		
		ResultSet rs = st.executeQuery(data);
		boolean flag= false;
		while(rs.next()) {
			
			flag= true;
			
			System.out.println(rs.getInt(1));
			
			
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
