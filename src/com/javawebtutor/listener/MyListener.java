package com.javawebtutor.listener;

import java.io.IOException;
import javax.servlet.AsyncEvent;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class MyListener implements javax.servlet.AsyncListener, javax.servlet.ServletContextListener,
		javax.servlet.ServletContextAttributeListener, javax.servlet.ServletRequestListener,
		javax.servlet.ServletRequestAttributeListener, javax.servlet.http.HttpSessionListener,
		javax.servlet.http.HttpSessionBindingListener, javax.servlet.http.HttpSessionAttributeListener,
		javax.servlet.http.HttpSessionActivationListener {

	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println(arg0.getSession());
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println(arg0.getSession());
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println(arg0.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println(arg0.getSession());
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println(arg0.getServletContext());
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println(arg0.getServletContext());
	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println(arg0.getValue());
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println(arg0.getServletContext());
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println(arg0.getServletContext());
	}

	@Override
	public void onComplete(AsyncEvent arg0) throws IOException {
		System.out.println(arg0.getAsyncContext());
	}

	@Override
	public void onError(AsyncEvent arg0) throws IOException {
		System.out.println(arg0.getAsyncContext());
	}

	@Override
	public void onStartAsync(AsyncEvent arg0) throws IOException {
		System.out.println(arg0.getAsyncContext());
	}

	@Override
	public void onTimeout(AsyncEvent arg0) throws IOException {
		System.out.println(arg0.getAsyncContext());
	}

}
