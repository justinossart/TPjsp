package com.javawebtutor.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javawebtutor.model.User;

public class MyFilter implements Filter {

	public void init(FilterConfig filterConfig) {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rep = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");

		if (user != null || req.getRequestURI().indexOf("public/") >= 0) {
			chain.doFilter(request, response);
			return;
		}
		rep.sendRedirect("/MVCApplication/public/login.jsp");
	}

}