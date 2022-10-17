package com.jdbc.simpleprograms;

import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee number");
		int eno = sc.nextInt();
		
		System.out.println("Enter Employee name");
		String ename = sc.next();
		
		System.out.println("Enter Employee salary");
		double esal = sc.nextDouble();
		
		System.out.println("Enter Employee address");
		String eadd = sc.next();
		
		System.out.println("your details");
		//System.out.println(eno+" "+ename+" "+esal+" "+eadd);
		
		
		String sql =String.format("insert into employee values(%d,'%s',%f,'%s')", eno,ename,esal,eadd); 
		System.out.println(sql);
	}

}
