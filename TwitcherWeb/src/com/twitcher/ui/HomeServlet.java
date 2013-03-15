package com.twitcher.ui;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.HttpRequestHandler;

import com.twitcher.data.domain.TwitchRecord;
import com.twitcher.data.persistence.mybatis.TwitchMapper;

public class HomeServlet implements HttpRequestHandler {

	private TwitchMapper twitchMapper;
	private Logger logger = Logger.getLogger(HomeServlet.class);

	@Override
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		List<TwitchRecord> allTheTwitches = twitchMapper.allTheTwitches();
		logger.debug("Twitch List: " + allTheTwitches);
		
		request.setAttribute("twitchList", allTheTwitches);
		request.getServletContext().getRequestDispatcher("/home.jsp")
				.forward(request, response);
	}

	public void setTwitchMapper(TwitchMapper twitchMapper) {
		this.twitchMapper = twitchMapper;
	}

}
