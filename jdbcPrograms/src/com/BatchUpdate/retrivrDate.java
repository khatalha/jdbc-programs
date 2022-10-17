package com.BatchUpdate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class retrivrDate {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("connection is taken");
		}
		
		
		
		String data= "select * from datepro";
		PreparedStatement pst = con.prepareStatement(data);
				
		ResultSet rs = pst.executeQuery(data);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		boolean flag= false;
		while(rs.next()) {
			
			flag= true;
			String name = rs.getString(1);
			Date d = rs.getDate(2);
			String s = sdf.format(d);
			System.out.println(name+"--------"+d);
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


