package com.twitcher.data.persistence.basic;

import javax.sql.DataSource;

public class BaseAdapter {

	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
