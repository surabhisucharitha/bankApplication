package com.bankApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	public Connection dbConnection()
	{
		Connection conn=null;
		String databaseUrl="jdbc:mysql://localhost:3306/bankapp";
		String userName="root";
		String userPassword="Suchi@123";
		
		try
		{
			conn=DriverManager.getConnection(databaseUrl,userName,userPassword);
				
			}
			catch(SQLException e)
			{
				System.out.println("server problem");
			}
		return conn;
		}
	}

