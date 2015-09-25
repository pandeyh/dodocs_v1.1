package com.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.beans.User;
import com.dao.UserProfileDAO;
import com.db.DBManager;

public class UserProfileImpl implements UserProfileDAO {
	
	DBManager db = null;

	public void createUserProfile(final User user) {
		
		DBManager db = DBManager.getDBManager();
		JdbcTemplate jdbcTemplate = db.getJDBCTemplate();
		
		
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement pst = con.prepareStatement("Insert into docs_user_details (first_name,last_name,email_id,user_designation)"+
					"values(?,?,?,?)");
				pst.setString(1, user.getFirstName());
				pst.setString(2, user.getLastName());
				pst.setString(3, user.getEmailId());
				pst.setString(4, user.getUserDesignation());
	
				
				return pst;
			}
		});
		
		
	}

	public void deleteUserProfile(User user) {
		// TODO Auto-generated method stub
		
	}

	public void getUserProfile(final String loginName) {
		
		
		DBManager db = DBManager.getDBManager();
		JdbcTemplate jdbcTemplate = db.getJDBCTemplate();

		
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement pst = con.prepareStatement("Select * from Users where userLoginNm = ?");
					
				pst.setString(1, loginName);
		
				
				return pst;
			}
		});
		
	}

	public void updateUserProfile(User user) {
		// TODO Auto-generated method stub
		
	}

	public boolean validateUser(final User user) {
		
		
		DBManager db = DBManager.getDBManager();
		JdbcTemplate jdbcTemplate = db.getJDBCTemplate();
		User userData = jdbcTemplate.query(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement pst = con.prepareStatement("Select * from docs_user_details where email_id = ?");
				pst.setString(1, user.getEmailId());
				return pst;
			}
		}, new ResultSetExtractor<User>() 
		{

			public User extractData(ResultSet rs) throws SQLException,
					DataAccessException {
					User userResultSet = new User();
				while(rs.next())
				{
					userResultSet.setEmailId((rs.getString("email_id")));
				}
				
				return userResultSet;
			}
			
		});
		
		if(userData.getEmailId() != null)
		{
			return true;
		}
		else 
			return false;
		
		//return userData;
		

	}

}
