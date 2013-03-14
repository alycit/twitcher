package com.twitcher.data.domain;

import java.util.Date;

public class TwitchRecord {
	private String text;
	private Date date;
	
	public void setText(String text) {
		this.text = text ;		
	}

	public void setTime(Date date) {
		this.date = date ;
	}

}
