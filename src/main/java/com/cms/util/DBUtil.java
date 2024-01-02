package com.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}


}
