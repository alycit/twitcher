package com.twitcher.ui;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.twitcher.data.domain.TwitchRecord;

public class TwitchServlet implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TwitchRecord twitch = new TwitchRecord();
		twitch.setText(request.getParameter("twitchinput"));
		twitch.setTime(new Date());		
		
		request.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);

	}

}
