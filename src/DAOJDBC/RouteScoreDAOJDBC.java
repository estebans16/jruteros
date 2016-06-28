package DAOJDBC;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.RouteScore;
import models.User;
import interfacesDAO.RouteScoreDAO;

public class RouteScoreDAOJDBC implements RouteScoreDAO {

	public RouteScoreDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(RouteScore entity) {
	
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		RouteScore routeScores = connection.getEm().find(RouteScore.class, id);
		connection.disconnectToDB();
		
		if (routeScores !=null) {
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
		
		RouteScore routeScore = connection.getEm().find(RouteScore.class, id);
		
		connection.disconnectToDB();
		return routeScore;
	}

	@Override
	public boolean actualizar(RouteScore entity) {
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
		RouteScore routeScore = connection.getEm().find(RouteScore.class, id);
		connection.getEm().remove(routeScore);
		connection.disconnectToDB();
		return true;
	}

	@Override
	public List<RouteScore> todos() {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.RouteScore");
		List<RouteScore> routeScores = (List<RouteScore>) query.getResultList();
		
		connection.disconnectToDB();
		return routeScores;
	}

}
