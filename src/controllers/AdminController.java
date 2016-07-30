package controllers;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

import DAOJPA.UserDAOJPA;
import models.User;

@ManagedBean
@ViewScoped
public class AdminController {
	
	private ArrayList<User> users;

	public AdminController() {
		UserDAOJPA userDAO = new UserDAOJPA();
		this.users = (ArrayList<User>) userDAO.todos();
		System.out.println("cantidad: " + users.size());
	}

	public ArrayList<User> getUsers() {
		System.out.println("elementos: " + users.size());
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	

}
