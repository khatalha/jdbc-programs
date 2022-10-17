package com.jdbc.simpleprograms;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class deleteMultipleRow {

	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("Conn is taken");
		}
		
		Scanner sc= new Scanner(System.in);
		
		Statement st = con.createStatement();
		
		System.out.println("Enter the salary");
		double cutoff = sc.nextDouble();
		
		
		String dl=String.format("delete from employee where esal>=%f", cutoff);
		
		int dt= st.executeUpdate(dl);
		
		System.out.println("rows deleted"+dt);
		
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}
