package com.cg.mobile.dbutil;

import java.io.FileReader;
import java.io.IOException;

import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	public static Connection getConnection() throws IOException, SQLException
	{
		Connection conn=null;
		Properties prop=readmobile();
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		conn=DriverManager.getConnection(url,username,password);
		return conn;
	}

	private static Properties readmobile() throws IOException {
		
		Properties p=new Properties();
		FileReader fr=new FileReader("mobile.properties");
		p.load(fr);
		return p;
	}
}
