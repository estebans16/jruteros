package controllers;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
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
	private String currentPass;
	private String newPass;

	public UserController() {
		// TODO Auto-generated constructor stub
		user = new User();
	}

	public User getUser() {
		return user;
	}
	
	public String getCurrentPass() {
		return currentPass;
	}

	public void setCurrentPass(String currentPass) {
		this.currentPass = currentPass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
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
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"El usuario " + this.getUser().getUserName() + " ya existe", "Por favor ingresar un nuevo usuario"));
			return "failure";
		}
	}
	
	public String update(){
		if ((!this.currentPass.isEmpty()) && (!this.newPass.isEmpty())) {
			if (this.currentPass.equals(this.getUser().getPassword())) {
				UserDAOJPA daoUser = new UserDAOJPA();
				this.getUser().setPassword(this.newPass);
				daoUser.actualizar(this.getUser());
				return "success";
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Contraseña actual incorrecta", "Por favor ingresar la contraseña actual correcta"));
				return "failure";
			}
		} else {
			if ((!this.currentPass.isEmpty()) || (!this.newPass.isEmpty())) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Debe completar ambos campos, Contraseña actual y Nueva contraseña", "Por favor ingresar la contraseña actual correcta y una nueva contraseña"));
				return "failure";
			} else {
				UserDAOJPA daoUser = new UserDAOJPA();
				daoUser.actualizar(this.getUser());
				return "success";
			}
		}
	}
	
	public String perfil(){
		FacesContext context = FacesContext.getCurrentInstance();
		Object a = context.getExternalContext().getSessionMap().get("user");
		this.user  = (User) a;
		//this.user = this.loginController.getUser();
		return "success";
	}
	

}
