package DAOJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.Travel;
import models.User;
import interfacesDAO.TravelDAO;

public class TravelDAOJPA implements TravelDAO {

	public TravelDAOJPA() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(Travel entity) {
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Travel travel = connection.getEm().find(Travel.class, id);
		connection.disconnectToDB();
		
		if (travel != null){
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
		Travel travel = connection.getEm().find(Travel.class, id);
		
		connection.disconnectToDB();
		return travel;
	}

	@Override
	public boolean actualizar(Travel entity) {
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
		Travel travel = connection.getEm().find(Travel.class, id);
		connection.getEm().remove(travel);
		connection.disconnectToDB();
		return true;
	}

	@Override
	public List<Travel> todos() {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Travel");
		List<Travel> travels = (List<Travel>) query.getResultList();
		
		connection.disconnectToDB();
		return travels;
	}

}
