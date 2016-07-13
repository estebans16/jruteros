package controllers;

import javax.faces.context.FacesContext;

import DAOJPA.UserDAOJPA;
import models.User;

public class LoginController {
	
	private User user;
	private String userName;
	private String password;

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String login(){
		UserDAOJPA daoUser = new UserDAOJPA();
		if (daoUser.existePorUserName(this.userName)) {
			User user = daoUser.recuperarPorUserName(this.userName);
			this.user = user;
			return "success";
		} else {
			return "failure";
		}
	}
	
	public void logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance()
        .getApplication().getNavigationHandler()
        .handleNavigation(FacesContext.getCurrentInstance(), null, "/login.xhtml");
	}

}
