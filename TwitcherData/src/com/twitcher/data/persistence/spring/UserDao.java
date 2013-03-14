package com.twitcher.data.persistence.spring;

import com.twitcher.data.domain.UserRecord;
import com.twitcher.data.persistence.mybatis.UserMapper;

public class UserDao extends BaseDao implements UserMapper {

	private static final String INSERT = "insert into USERS values (?, ?, ?)";

	public void insert(UserRecord user) {
		this.getJdbcTemplate().update(INSERT, 
				new Object[] { user.getId(), user.getName(), user.getPassword() });
	}
}
