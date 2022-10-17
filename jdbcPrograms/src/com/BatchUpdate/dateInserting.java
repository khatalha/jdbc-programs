package com.BatchUpdate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class dateInserting {

	public static void main(String[] args) throws SQLException{
		
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("connection is taken");
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name= sc.next();
		
		System.out.println("Enter date (yyyy-MM-dd)"); 
		String dop = sc.next();
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d= Date.valueOf(dop);
		
		String query ="insert into datepro values(?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		
		
		
		pst.setString(1, name);
		pst.setDate(2, d);
	
		int i = pst.executeUpdate();
		System.out.println("inserted"+i);
		

	}

}
