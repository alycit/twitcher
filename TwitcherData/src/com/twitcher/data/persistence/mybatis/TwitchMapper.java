package com.twitcher.data.persistence.mybatis;

import java.util.List;

import com.twitcher.data.domain.TwitchRecord;

public interface TwitchMapper {

	void insert(TwitchRecord twitch);
	
	List<TwitchRecord> allTheTwitches();
	
}
