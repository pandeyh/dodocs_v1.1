package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DBManager {
	
	
	private static DBManager dbManager = null;
	//private  Connection con;
	private JdbcTemplate jdbcTemplate;
	
	public static DBManager getDBManager() 
	{
		if(dbManager == null)
		{
			try {
				dbManager = new DBManager();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return dbManager;
		
		
	}
	
	
	private DBManager() throws ClassNotFoundException
	{
		getConnection();
	}
	private JdbcTemplate getConnection() throws ClassNotFoundException
	{
		/*Class.forName("com.mysql.jdbc.Driver");
		
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rcp","root","admin");	
			
		}
		catch(SQLException e)
		{
			System.out.println("This connection String is Wrong");
			
		}finally
		{
			System.out.println("Connected");
			
		}*/
		
			return mariaDBConnection();
	       
		
	}
	
	private JdbcTemplate mySQLConnection()
	{
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/rcp");
        dataSource.setPassword("admin");

        jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
	}
	private JdbcTemplate mariaDBConnection()
	{
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://10.0.0.17:3306/DODOCS");
        dataSource.setPassword("p@ssw0rd");

        jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
	}
	
	public JdbcTemplate getJDBCTemplate()
	{
		
		return jdbcTemplate;
	}
	

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		//	new DBManager().getConnection();
		//new DBManager().mariaDBConnection();
	}

}
