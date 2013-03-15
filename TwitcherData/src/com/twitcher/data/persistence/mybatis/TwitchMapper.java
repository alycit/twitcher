package com.twitcher.data.persistence.mybatis;

import com.twitcher.data.domain.TwitchRecord;

public interface TwitchMapper {

	void insert(TwitchRecord twitch);
	
}
