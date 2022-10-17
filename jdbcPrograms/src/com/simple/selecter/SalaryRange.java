package com.simple.selecter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.simpleprograms.DBUtil;

public class SalaryRange {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("connection is tsken");
			
		}
		
		Statement st = con.createStatement();
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the range Salary 1");
		double sal1 = sc.nextDouble();
		System.out.println("Enter the range Salary 2");
		double sal2 = sc.nextDouble();
		
		String query = String.format("select * from employee where esal>=%f and esal<=%f ",sal1,sal2);
		
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
