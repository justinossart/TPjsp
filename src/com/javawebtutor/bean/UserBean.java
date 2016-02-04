package com.javawebtutor.bean;

import java.time.LocalDate;
import com.javawebtutor.model.User;


public class UserBean {

	private User userConnected;
	private LocalDate dateConnection;

	

	
	public User getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}

	public LocalDate getDateConnection() {
		return dateConnection;
	}

	public void setDateConnection(LocalDate dateConnection) {
		this.dateConnection = dateConnection;
	}

	@Override
	public String toString() {
		return "UserBean [userConnected=" + userConnected + ", dateConnection=" + dateConnection + "]";
	}

}
