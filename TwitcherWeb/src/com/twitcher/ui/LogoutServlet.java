package com.twitcher.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.HttpRequestHandler;

import com.twitcher.data.domain.UserRecord;
import com.twitcher.data.persistence.mybatis.UserMapper;

public class LogoutServlet implements HttpRequestHandler {

	private Logger logger = Logger.getLogger(LogoutServlet.class);

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getSession().setAttribute("loggedInUser", null);
		request.getServletContext().getRequestDispatcher("/home").forward(request, response);

	}

}
