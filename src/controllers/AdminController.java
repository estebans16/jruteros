package controllers;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import DAOJPA.UserDAOJPA;
import models.User;

@ManagedBean
@ViewScoped
public class AdminController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<User> users;
	
	public AdminController() {
		UserDAOJPA userDAO = new UserDAOJPA();
		this.users = (ArrayList<User>) userDAO.todos();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	public String toggle(String userId){
		UserDAOJPA userDAO = new UserDAOJPA();
		User user = userDAO.recuperar(new Long(userId));
		user.setActive(!user.getActive());;
		userDAO.actualizar(user);
		this.setUsers((ArrayList<User>) userDAO.todos());
		return "success";
	}
	
	

}
