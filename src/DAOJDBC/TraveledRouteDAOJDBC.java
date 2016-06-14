package DAOJDBC;

import interfacesDAO.TraveledRouteDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.TraveledRoute;
import models.TraveledRoute;


public class TraveledRouteDAOJDBC implements TraveledRouteDAO {

	public TraveledRouteDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.TraveledRoute WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		List<TraveledRoute> traveledRoutes = (List<TraveledRoute>) query.getResultList();
		
		connection.disconnectToDB();
		
		if (!traveledRoutes.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<TraveledRoute> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.TraveledRoute");
		query.setParameter("id", new Long(id.toString()));
		List<TraveledRoute> traveledRoutes = (List<TraveledRoute>) query.getResultList();
		
		connection.disconnectToDB();
		return traveledRoutes;
	}

	@Override
	public TraveledRoute persistir(TraveledRoute entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().persist(entity);
		
		connection.disconnectToDB();
		return entity;
	}

	@Override
	public TraveledRoute recuperar(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.TraveledRoute WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		TraveledRoute traveledRoute = (TraveledRoute) query.getSingleResult();
		
		connection.disconnectToDB();
		return traveledRoute;
	}

	@Override
	public boolean actualizar(TraveledRoute entity) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		TraveledRoute travelR = this.recuperar(entity.getId());
		travelR.setRoute(entity.getRoute());
		
		connection.disconnectToDB();
		
		return true;
	}

	@Override
	public boolean borrar(Serializable id) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		TraveledRoute travelR = this.recuperar(id);
		connection.getEm().remove(travelR);
		connection.disconnectToDB();
		return true;
	}

	@Override
	public void borrar(TraveledRoute entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().remove(entity);
		
		connection.disconnectToDB();
	}

}
