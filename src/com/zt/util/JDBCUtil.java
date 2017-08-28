package com.zt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCUtil {

	private static ResourceBundle rb = ResourceBundle.getBundle("jdbc");

	static {
		try {
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;

		try {
			con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"), rb.getString("pwd"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}

}
