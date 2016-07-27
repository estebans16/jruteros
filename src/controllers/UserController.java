package controllers;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import DAOJPA.UserDAOJPA;
import models.User;

@ManagedBean
@ViewScoped
public class UserController implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;

	public UserController() {
		// TODO Auto-generated constructor stub
		user = new User();
	}

	public User getUser() {
		return user;
	}
	
	public String signup(){
		UserDAOJPA daoUser = new UserDAOJPA();
		if (!daoUser.existePorUserName(this.getUser().getUserName())) {
			this.getUser().setRoll("User");
			this.getUser().setActive(true);
			int randomNum = 1000 + (int)(Math.random() * 9999);
			this.getUser().setPassword(String.valueOf(randomNum));
			daoUser.persistir(this.getUser());
			return "success";
		} else {
			return "failure";
		}
	}
	
	public String save(){
		UserDAOJPA daoUser = new UserDAOJPA();
		daoUser.actualizar(this.getUser());
		return "success";
	}
	
	public String perfil(){
		FacesContext context = FacesContext.getCurrentInstance();
		Object a = context.getExternalContext().getSessionMap().get("user");
		this.user  = (User) a;
		return "success";
	}
	

}
