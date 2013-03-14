package com.twitcher.data.persistence.spring;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
