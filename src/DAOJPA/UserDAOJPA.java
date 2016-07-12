package DAOJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.User;
import interfacesDAO.UserDAO;

public class UserDAOJPA implements UserDAO {

	public UserDAOJPA() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		User user = connection.getEm().find(User.class, id);
		connection.disconnectToDB();
		
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<User> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.User");
		query.setParameter("id", new Long(id.toString()));
		List<User> users = (List<User>) query.getResultList();
		
		connection.disconnectToDB();
		return users;
	}

	@Override
	public User persistir(User entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().persist(entity);
	
		connection.disconnectToDB();
		return entity;
	}

	@Override
	public User recuperar(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		User user = connection.getEm().find(User.class, id);
		
		connection.disconnectToDB();
		return user;
	}

	@Override
	public boolean actualizar(User entity) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		connection.getEm().merge(entity);
		connection.disconnectToDB();
		
		return true;
	}

	@Override
	public boolean borrar(Serializable id) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		
		connection.connectToDB();
		User user = connection.getEm().find(User.class, id);
		connection.getEm().remove(user);
		connection.disconnectToDB();
		return true;
	}


	@Override
	public void borrar(User entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<User> todos() {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.User");
		List<User> users = (List<User>) query.getResultList();
		
		connection.disconnectToDB();
		return users;
	}
	
	

}
