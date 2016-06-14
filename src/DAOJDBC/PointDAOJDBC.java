package DAOJDBC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import models.Apoint;
import models.MyConnection;
import models.Photo;
import interfacesDAO.PointDAO;

public class PointDAOJDBC implements PointDAO {

	public PointDAOJDBC() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void borrar(Apoint entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().remove(entity);
		
		connection.disconnectToDB();
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Apoint WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		List<Apoint> points = (List<Apoint>) query.getResultList();
		
		connection.disconnectToDB();
		
		if (!points.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Apoint> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Apoint");
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
		
		Query query = connection.getEm().createQuery("FROM models.aPoint WHERE id = :id");
		query.setParameter("id", new Long(id.toString()));
		Apoint point = (Apoint) query.getSingleResult();
		
		connection.disconnectToDB();
		return point;
	}

	@Override
	public boolean actualizar(Apoint entity) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Apoint point = this.recuperar(entity.getId());
		point.setLatitude(entity.getLatitude());
		point.setLonguitude(entity.getLonguitude());
		
		connection.disconnectToDB();
		
		return true;
	}

	@Override
	public boolean borrar(Serializable id) {
		// TODO Auto-generated method stub
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Apoint point = this.recuperar(id);
		connection.getEm().remove(point);
		connection.disconnectToDB();
		return true;
	}

}
