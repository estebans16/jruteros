package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import DAOJPA.UserDAOJPA;
import models.User;

public class LoginController {
	
	private User user;
	private String userName;
	private String password;
	private String msg;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String login(){
		UserDAOJPA daoUser = new UserDAOJPA();
		FacesContext context = FacesContext.getCurrentInstance();
		if (daoUser.existePorUserName(this.userName)) {
			User user = daoUser.recuperarPorUserName(this.userName);
			this.user = user;
			if (user.getPassword().equals(this.password)) {
				if (user.getActive() == true) {
					context.getExternalContext().getSessionMap().put("user", user);
			        //    return "userhome?faces-redirect=true";
					if (user.getRoll().equals("Admin")) {
						return "admin";
					} else {
						return "user";
					}
				} else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Su usuario ha sido deshabilitado", "Por favor ingresar un nombre de usuario y contraseņa correctos"));
					return "failure";
				}
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
								"Nombre de usuario o contraseņa incorrecto/a", "Por favor ingresar un nombre de usuario y contraseņa correctos"));
				return "failure";
			}
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Nombre de usuario o contraseņa incorrecto/a", "Por favor ingresar un nombre de usuario y contraseņa correctos"));
			return "failure";
		}
		
		 /* if (user == null) {
	            context.addMessage(null, new FacesMessage("Unknown login, try again"));
	            username = null;
	            password = null;
	            return null;
	        } else {
	            context.getExternalContext().getSessionMap().put("user", user);
	            return "userhome?faces-redirect=true";
	        }*/
	}
	
	public void logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance()
        .getApplication().getNavigationHandler()
        .handleNavigation(FacesContext.getCurrentInstance(), null, "/login.xhtml");
	}

}
