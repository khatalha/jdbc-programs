package com.simple.selecter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.simpleprograms.DBUtil;

public class basedOnAddress {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("connection is tsken");
			
		}
		
		Statement st = con.createStatement();
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the Address");
		String adress = sc.next();
		
		String query = String.format("select * from employee where eadd='%s' ", adress);
		
		ResultSet rs = st.executeQuery(query);
		boolean flag= false;
		while(rs.next()) {
			 
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
