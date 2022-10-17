package com.tk.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUil {
	
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
    private static final String DB_USERNAME="root";
    private static final String DB_PASSWORD = "123456789";
    private static final String DB_URL="jdbc:mysql://localhost:3306/programs";
    
    
    private static Connection connection = null;
	private static Properties properties=null;
	
	
	static{
		try {
			/*
			 Properties=new Properties();
			 p.load(new FileInputStream("src/database.properties"));
			 */
			
			Properties p=new Properties();
			FileInputStream fis =new FileInputStream("src/db.properties");
			p.load(fis);
			Class.forName(properties.getProperty(DB_DRIVER_CLASS));
			connection = DriverManager.getConnection(properties.getProperty(DB_URL),properties.getProperty(DB_USERNAME) , properties.getProperty(DB_PASSWORD) );
			//connection = DriverManager.getConnection(properties.getProperty(DB_URL),p);
			//connection = DriverManager.getConnection("com.mysql.cj.jdbc.Driver?user=root&password=123456789");
		
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public static Connection getConnection(){
		return connection;
	}

}
