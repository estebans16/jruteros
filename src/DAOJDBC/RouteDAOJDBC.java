package DAOJDBC;

import interfacesDAO.RouteDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.Route;
import models.User;

public class RouteDAOJDBC implements RouteDAO {

	public RouteDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(Route entity) {
		
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Route route = connection.getEm().find(Route.class, id);
		connection.disconnectToDB();
		
		if (route != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Route> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Route");
		query.setParameter("id", new Long(id.toString()));
		List<Route> routes = (List<Route>) query.getResultList();
		
		connection.disconnectToDB();
		return routes;
	}

	@Override
	public Route persistir(Route entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().persist(entity);
		
		connection.disconnectToDB();
		return entity;
	}

	@Override
	public Route recuperar(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Route route = connection.getEm().find(Route.class, id);
		connection.disconnectToDB();
		return route;
	}

	@Override
	public boolean actualizar(Route entity) {
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
		Route route = connection.getEm().find(Route.class, id);
		connection.getEm().remove(route);
		connection.disconnectToDB();
		return true;
	}

	@Override
	public List<Route> todos() {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Route");
		List<Route> routes = (List<Route>) query.getResultList();
		
		connection.disconnectToDB();
		return routes;
	}

}
