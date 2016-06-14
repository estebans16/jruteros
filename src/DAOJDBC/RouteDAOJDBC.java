package DAOJDBC;

import interfacesDAO.RouteDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.Route;

public class RouteDAOJDBC implements RouteDAO {

	public RouteDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(Route entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().remove(entity);
		
		connection.disconnectToDB();
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Route WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		List<Route> routes = (List<Route>) query.getResultList();
		
		connection.disconnectToDB();
		
		if (!routes.isEmpty()) {
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
		
		Query query = connection.getEm().createQuery("FROM models.Route WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		Route route = (Route) query.getSingleResult();
		
		connection.disconnectToDB();
		return route;
	}

	@Override
	public boolean actualizar(Route entity) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Route route = this.recuperar(entity.getId());
		route.setActivity(entity.getActivity());
		route.setCircular(entity.isCircular());
		route.setDate(entity.getDate());
		route.setDescription(entity.getDescription());
		route.setDifficulty(entity.getDifficulty());
		route.setDistance(entity.getDistance());
		route.setName(entity.getName());
		route.setPhotoList(entity.getPhotoList());
		route.setPublic(entity.isPublic());
		route.setTime(entity.getTime());
		route.setTravel(entity.getTravel());
		
		connection.disconnectToDB();
		
		return true;
	}

	@Override
	public boolean borrar(Serializable id) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Route route = this.recuperar(id);
		connection.getEm().remove(route);
		connection.disconnectToDB();
		return true;
	}

}
