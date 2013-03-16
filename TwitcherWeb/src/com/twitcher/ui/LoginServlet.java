package com.twitcher.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.HttpRequestHandler;

import com.twitcher.data.domain.UserRecord;
import com.twitcher.data.persistence.mybatis.UserMapper;

public class LoginServlet implements HttpRequestHandler {

	private Logger logger = Logger.getLogger(LoginServlet.class);
	private UserMapper userMapper;

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserRecord user = new UserRecord();
		user.setId(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		
		UserRecord loggedInUser = userMapper.findUser(user);
		logger.debug("loggedInUser: " + loggedInUser);
		
		if(loggedInUser != null) {
			request.getSession().setAttribute("loggedInUser", loggedInUser);
		} else {
			request.setAttribute("loginError", "There was an error logging in.");
		}
		
		request.getServletContext().getRequestDispatcher("/home").forward(request, response);

	}
	
	public void setUserMapper(UserMapper userMapper){
		this.userMapper = userMapper;
	}

}
