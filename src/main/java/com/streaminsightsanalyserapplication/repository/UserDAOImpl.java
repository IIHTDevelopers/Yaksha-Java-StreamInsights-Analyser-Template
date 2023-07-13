package com.streaminsightsanalyserapplication.repository;

import java.util.List;

import com.streaminsightsanalyserapplication.model.User;

public class UserDAOImpl implements UserDAO {

	private final String dbUrl;
	private final String dbUser;
	private final String dbPassword;

	public UserDAOImpl(String dbUrl, String dbUser, String dbPassword) {
		this.dbUrl = dbUrl;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	@Override
	public void addUser(User user) {
	}

	@Override
	public void updateUser(User user) {
	}

	@Override
	public User getUserById(int id) {
		return null;
	}

	@Override
	public void deleteUser(int id) {
	}

	@Override
	public void deleteAllUsers() {
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}
}
