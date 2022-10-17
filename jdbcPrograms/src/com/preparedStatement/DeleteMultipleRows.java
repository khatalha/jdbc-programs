package com.preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteMultipleRows {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		
		if(con!=null) {
			System.out.println("taken");
		}
		
		String query = "delete from employee where ename=?";
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setString(1,"Aftab");
		
		int up= pst.executeUpdate();
		
		System.out.println("effected"+up);
		
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
