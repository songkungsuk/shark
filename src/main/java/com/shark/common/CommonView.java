package com.shark.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonView {
	private final static String PREFIX ="/WEB-INF/views";
	private final static String SUFFIX =".jsp";
	public static String getcmd(HttpServletRequest request) {
		String cmd = request.getRequestURI();
		return PREFIX + cmd + SUFFIX;
	}
	
	public static String sliceURI(HttpServletRequest request) {
		
		return request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
		
	}
	public static void foward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(getcmd(request));
		rd.forward(request, response);
	}
	
	public static void fowardMessagePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/message/message.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
}
