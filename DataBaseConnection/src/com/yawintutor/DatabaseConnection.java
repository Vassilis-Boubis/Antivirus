package com.yawintutor;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://prometheus.dmst.aueb.gr";
		String username = "vmpoumpis";
		String password = "antivirus2020";

		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");
		} else {
			System.out.println("Database Connection failed");
		}
	}
}
