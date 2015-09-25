package com.dao;

import com.beans.User;

public interface UserProfileDAO {
	
	
	public void createUserProfile(User user);
	public void deleteUserProfile(User user);
	public void getUserProfile(String userLoginName);
	public void updateUserProfile(User user);
	public boolean validateUser(User user);

}
