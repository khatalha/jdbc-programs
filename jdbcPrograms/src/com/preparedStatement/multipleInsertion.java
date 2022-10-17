package com.preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class multipleInsertion {

		public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		
		if(con!=null) {
			System.out.println("taken");
		}
		
		String query = "insert into employee values(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
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
			
			pst.setInt(1, eno);
			pst.setString(2,ename);
			pst.setDouble(3, esal);
			pst.setString(4, eadd);
		
			pst.executeUpdate();
			System.out.println("row inserted");
			
			System.out.println("do you want one more row (yes / no )");
			String opt = sc.next();
			if(opt.equalsIgnoreCase("no")) {
				break;
			}
		}

	}

}
