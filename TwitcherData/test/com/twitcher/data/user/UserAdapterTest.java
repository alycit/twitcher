package com.twitcher.data.user;

import java.sql.SQLException;

import org.junit.Before;

import com.twitcher.data.domain.UserRecord;
import com.twitcher.data.persistence.basic.UserAdapter;

public class UserAdapterTest {

	private UserAdapter adapter;
	private UserRecord user;
	private UserRecord otherUser;
	
	@Before
	public void setup() throws SQLException {
		
		adapter = new UserAdapter();
		
		user = new UserRecord();
		user.setId("alice");
		user.setName("Alice Bobinski");
		user.setPassword("malice");
		
		otherUser = new UserRecord();
		otherUser.setId("bob");
		otherUser.setName("Bob Bobinski");
		otherUser.setPassword("bobmesiter");
		
		adapter.insert(user);
		adapter.insert(otherUser);
	}
}
