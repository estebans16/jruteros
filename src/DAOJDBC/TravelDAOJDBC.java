package DAOJDBC;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.Travel;
import interfacesDAO.TravelDAO;

public class TravelDAOJDBC implements TravelDAO {

	public TravelDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(Travel entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().remove(entity);
		
		connection.disconnectToDB();
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Travel WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		List<Travel> travels = (List<Travel>) query.getResultList();
		
		connection.disconnectToDB();
		
		if (!travels.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Travel> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Travel");
		query.setParameter("id", new Long(id.toString()));
		List<Travel> travels = (List<Travel>) query.getResultList();
		
		connection.disconnectToDB();
		return travels;
	}

	@Override
	public Travel persistir(Travel entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().persist(entity);
		
		connection.disconnectToDB();
		return entity;
	}

	@Override
	public Travel recuperar(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Travel WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		Travel travel = (Travel) query.getSingleResult();
		
		connection.disconnectToDB();
		return travel;
	}

	@Override
	public boolean actualizar(Travel entity) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Travel travel = this.recuperar(entity.getId());
		travel.setPointsList(entity.getPointsList());
		
		connection.disconnectToDB();
		
		return true;
	}

	@Override
	public boolean borrar(Serializable id) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Travel travel = this.recuperar(id);
		connection.getEm().remove(travel);
		connection.disconnectToDB();
		return true;
	}

}
