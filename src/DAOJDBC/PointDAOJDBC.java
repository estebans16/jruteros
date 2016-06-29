package DAOJDBC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import models.Apoint;
import models.MyConnection;
import models.Photo;
import models.User;
import interfacesDAO.PointDAO;

public class PointDAOJDBC implements PointDAO {

	public PointDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(Apoint entity) {
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Apoint point = connection.getEm().find(Apoint.class, id);
		connection.disconnectToDB();
		
		if (point != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Apoint> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Apoint WHERE travel_id = :id");
		query.setParameter("id", new Long(id.toString()));
		List<Apoint> points = (List<Apoint>) query.getResultList();
		
		connection.disconnectToDB();
		return points;
	}

	@Override
	public Apoint persistir(Apoint entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().persist(entity);
		
		connection.disconnectToDB();
		return entity;
	}

	@Override
	public Apoint recuperar(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Apoint point = connection.getEm().find(Apoint.class, id);
		
		connection.disconnectToDB();
		return point;
	}

	@Override
	public boolean actualizar(Apoint entity) {
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
		Apoint point = connection.getEm().find(Apoint.class, id);
		connection.getEm().remove(point);
		connection.disconnectToDB();
		return true;
	}

	@Override
	public List<Apoint> todos() {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Apoint");
		List<Apoint> points = (List<Apoint>) query.getResultList();
		
		connection.disconnectToDB();
		return points;
	}

}
