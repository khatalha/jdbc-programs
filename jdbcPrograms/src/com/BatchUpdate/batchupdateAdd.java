package com.BatchUpdate;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class batchupdateAdd {

	public static void main(String[] args) throws SQLException  {
		
		Connection con = DBUtil.getConnection();
		if(con!=null) {
			System.out.println("Connection Taken");
		}
		
		Statement st = (Statement) con.createStatement();
		//String q1="select * from employee";
		
		String q2 ="insert into employee values(6,'istiyak',3000,'sonapur')";
		st.addBatch(q2);
		
		String q3 = "update employee set ename='Aftab' where eno=5";
		st.addBatch(q3);
		
		String q4 ="delete from employee where ename='Azeez'";
		st.addBatch(q4);
		
		
		 int[] i =st.executeBatch();
		 
		 for(int i1:i) {
			 System.out.println("row effected"+i1);
		 }
		 
		 try {
			 con.close();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 
		
		

	}

}
