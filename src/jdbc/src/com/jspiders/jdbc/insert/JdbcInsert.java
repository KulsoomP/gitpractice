package com.jspiders.jdbc.insert;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcInsert {
	private static Connection connection;
	 private static Statement statement;
	 private static int result;
	 private static Properties properties;
	 private static String query;
	 private static String filePath="D:\\WEJE3\\jdbc\\resources\\db_info.properties";
	private static FileReader fileReader;

	 
public static void main(String[] args) {
	try {
		fileReader= new FileReader(filePath);
		properties= new Properties();
		properties.load(fileReader);
		
		Class.forName(properties.getProperty("driverPath"));
		connection= DriverManager.getConnection(properties.getProperty("dburl"),properties);
		
		statement= connection.createStatement();
		query = "insert into emp1 values"+
		"(6,'Babita','Babita@gmail.com',9876543234)";
		 
		result=statement.executeUpdate(query);
		System.out.println("Query ok "+ result+ "rows affected");
		
	} catch (IOException | ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	finally {
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
			
			if (fileReader != null) {
				fileReader.close();
			}
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
}	  
}
}
