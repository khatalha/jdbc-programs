package com.jdbc.simpleprograms;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertMultipleRow {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con != null) {
			System.out.println("Connection is taken");
			
		}
		
		Statement st = (Statement) con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter Employee number");
			int eno = sc.nextInt();
			
			System.out.println("Enter Employee name");
			String ename = sc.next();
			
			System.out.println("Enter Employee salary");
			double esal = sc.nextDouble();
			
			System.out.println("Enter Employee address");
			String eadd = sc.next();
			
			String sql =String.format("insert into employee values(%d,'%s',%f,'%s')", eno,ename,esal,eadd); 
			
			int add=st.executeUpdate(sql);
			
			System.out.println("record insert succecfully" +add);
			
			System.out.println("Do you want insert more rows yes or no");
			String option = sc.next();
			if(option.equalsIgnoreCase("no")) {
				break;
			}
			
		}

	}

}
