package com.twitcher.data.domain;

import java.util.Date;

public class TwitchRecord {
	private String text;
	private Date date;

	public void setText(String text) {
		this.text = text;
	}

	public void setTime(Date time) {
		this.date = time;
	}

	public Date getTime() {
		return date;
	}

	public String getText() {
		return text;
	}

}
