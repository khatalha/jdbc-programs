package com.ResultSetType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
    private static final String DB_USERNAME="root";
    private static final String DB_PASSWORD = "123456789";
    private static final String DB_URL="jdbc:mysql://localhost:3306/programs";
    //details is database
    
    
    private static Connection connection = null;
   	private static Properties properties=null;

    static {
        try{
        	Properties p =new Properties();
        	FileInputStream fis =new FileInputStream("src/db.properties");
			p.load(fis);
        	
            Class.forName(DB_DRIVER_CLASS);
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
    }
        catch (ClassNotFoundException | SQLException | IOException e){
            e.printStackTrace();
        }

    }
    public static Connection getConnection(){
        return  connection;
    }

}
