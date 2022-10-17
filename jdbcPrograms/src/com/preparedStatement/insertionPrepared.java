package com.preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertionPrepared {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DBUtil.getConnection();
		
		if(con!=null) {
			System.out.println("taken");
		}
		
		String query = "insert into employee values(7,'Aftab',2000,'Mumbai')";
		PreparedStatement pst = con.prepareStatement(query);
		
		int up = pst.executeUpdate();
		
		System.out.println("effected"+up);
		
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		

	}

}
