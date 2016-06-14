package DAOJDBC;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.RouteScore;
import interfacesDAO.RouteScoreDAO;

public class RouteScoreDAOJDBC implements RouteScoreDAO {

	public RouteScoreDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(RouteScore entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().remove(entity);
		
		connection.disconnectToDB();
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.RouteScore WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		List<RouteScore> routeScores = (List<RouteScore>) query.getResultList();
		
		connection.disconnectToDB();
		
		if (!routeScores.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<RouteScore> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.RouteScore");
		query.setParameter("id", new Long(id.toString()));
		List<RouteScore> routeScores = (List<RouteScore>) query.getResultList();
		
		connection.disconnectToDB();
		return routeScores;
	}

	@Override
	public RouteScore persistir(RouteScore entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().persist(entity);
		
		connection.disconnectToDB();
		return entity;
	}

	@Override
	public RouteScore recuperar(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.RouteScore WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		RouteScore routeScore = (RouteScore) query.getSingleResult();
		
		connection.disconnectToDB();
		return routeScore;
	}

	@Override
	public boolean actualizar(RouteScore entity) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		RouteScore routeS = this.recuperar(entity.getId());
		routeS.setRoute(entity.getRoute());
		routeS.setScore(entity.getScore());
		
		connection.disconnectToDB();
		
		return true;
	}

	@Override
	public boolean borrar(Serializable id) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		RouteScore routeS = this.recuperar(id);
		connection.getEm().remove(routeS);
		connection.disconnectToDB();
		return true;
	}

}
