package DAOJDBC;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.User;
import interfacesDAO.UserDAO;

public class UserDAOJDBC implements UserDAO {

	public UserDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(User entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().remove(entity);
		
		connection.disconnectToDB();
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.User WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		List<User> users = (List<User>) query.getResultList();
		
		connection.disconnectToDB();
		
		if (!users.isEmpty()) {
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
		
		Query query = connection.getEm().createQuery("FROM models.User WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		User user = (User) query.getSingleResult();
		
		connection.disconnectToDB();
		return user;
	}

	@Override
	public boolean actualizar(User entity) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		User user = this.recuperar(entity.getId());
		user.setActive(entity.isActive());
		user.setAddress(entity.getAddress());
		user.setBirthdate(entity.getBirthdate());
		user.setDni(entity.getDni());
		user.setEmail(entity.getEmail());
		user.setLastName(entity.getLastName());
		user.setName(entity.getName());
		user.setRoll(entity.getRoll());
		user.setRouteScoreList(entity.getRouteScoreList());
		user.setRoutesList(entity.getRoutesList());
		user.setSex(entity.getSex());
		user.setTraveledRouteList(entity.getTraveledRouteList());
		user.setUserName(entity.getUserName());
		
		connection.disconnectToDB();
		
		return true;
	}

	@Override
	public boolean borrar(Serializable id) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		User user = this.recuperar(id);
		connection.getEm().remove(user);
		connection.disconnectToDB();
		return true;
	}

}
