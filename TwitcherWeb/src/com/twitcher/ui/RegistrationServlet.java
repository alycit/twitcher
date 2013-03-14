package com.twitcher.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.twitcher.data.domain.UserRecord;
import com.twitcher.data.persistence.mybatis.UserMapper;

public class RegistrationServlet implements HttpRequestHandler {
	private static final long serialVersionUID = 1L;

	private UserMapper userMapper;

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserRecord user = new UserRecord();
		user.setId(request.getParameter("username"));
		user.setName(request.getParameter("first_name") + " " + request.getParameter("last_name"));
		user.setPassword(request.getParameter("password"));
		
		userMapper.insert(user);
		
		request.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
