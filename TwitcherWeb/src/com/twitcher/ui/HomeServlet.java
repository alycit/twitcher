package com.twitcher.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.twitcher.data.domain.TwitchRecord;
import com.twitcher.data.persistence.mybatis.TwitchMapper;

public class HomeServlet implements HttpRequestHandler {

	private TwitchMapper twitchMapper; 
	
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("twitchList", twitchMapper.allTheTwitches());
		request.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
	}
	
	public void setTwitchMapper(TwitchMapper twitchMapper){
		this.twitchMapper = twitchMapper;
	}

}
