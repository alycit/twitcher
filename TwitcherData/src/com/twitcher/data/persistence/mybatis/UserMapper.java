package com.twitcher.data.persistence.mybatis;

import com.twitcher.data.domain.UserRecord;

public interface UserMapper {

	void insert(UserRecord user);
	
}
