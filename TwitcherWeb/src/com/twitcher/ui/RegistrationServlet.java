package com.twitcher.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.twitcher.data.domain.UserRecord;
import com.twitcher.data.persistence.mybatis.UserMapper;

public class RegistrationServlet extends HttpServlet implements HttpRequestHandler {
	private static final long serialVersionUID = 1L;

	private UserMapper userMapper;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserMapper userAdapter = (UserMapper) WebApplicationContextUtils.getWebApplicationContext(request.getServletContext()).getBean("userMapper");
		
		UserRecord user = new UserRecord();
		user.setId(request.getParameter("username"));
		user.setName(request.getParameter("first_name") + " " + request.getParameter("last_name"));
		user.setPassword(request.getParameter("password"));
		
		userAdapter.insert(user);
		
		request.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
	}

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
