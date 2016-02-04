package com.javawebtutor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.javawebtutor.model.User;
import com.javawebtutor.service.LoginService;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticateUser(userId, password);
		User user = loginService.getUserByUserId(userId);
		if (result == true) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("/MVCApplication/private/home.jsp");
			System.out.println(user.getUserId());			
		} else {
			response.sendRedirect("/MVCApplication/public/error.jsp");
		}
		

		Cookie cookie = new Cookie("url","mkyong dot com");
		cookie.setMaxAge(60*60); //1 hour
		response.addCookie(cookie);
		
		System.out.println("Cookies created");
		
		
		
	}
	


}