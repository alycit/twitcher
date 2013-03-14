package com.twitcher.data.persistence.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.twitcher.data.domain.UserRecord;
import com.twitcher.data.persistence.mybatis.UserMapper;

public class UserAdapter extends BaseAdapter implements UserMapper {

	private static final String INSERT = "insert into USERS values (?, ?, ?)";

	public void insert(UserRecord user) {
		
		try {
			Connection connection = getDataSource().getConnection();
			PreparedStatement statement = connection.prepareStatement(INSERT);
			
			statement.setString(1, user.getId());
			statement.setString(2, user.getName());
			statement.setString(3, user.getPassword());
			
			statement.execute();
			
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
	
}
