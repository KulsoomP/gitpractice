package com.jspiders.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect1 {
	public static void main(String[] args) {
		try {
			// 1.Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2.Open connection
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/weje3?" + "user=root & password=root");

			// 3.Create Statement
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from emp1");

			// 4.Process the result
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "||" + resultSet.getString(2) + "||" + resultSet.getString(3)
						+ "||" + resultSet.getLong(4) + "||");
			}
			// 5.Close connection
			connection.close();
			statement.close();
			resultSet.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
