package DAOJDBC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.MyConnection;
import models.Photo;
import models.User;
import interfacesDAO.PhotoDAO;

public class PhotoDAOJDBC implements PhotoDAO{

	public PhotoDAOJDBC() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean actualizar(Photo entity) {
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
		Photo photo = connection.getEm().find(Photo.class, id);
		connection.getEm().remove(photo);
		connection.disconnectToDB();
		return true;
	}

	@Override
	public void borrar(Photo entity) {
	}

	@Override
	public boolean existe(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		Photo photo = connection.getEm().find(Photo.class, id);
		connection.disconnectToDB();
		
		if (photo != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Photo> recuperarTodos(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Query query = connection.getEm().createQuery("FROM models.Photo");
		query.setParameter("id", new Long(id.toString()));
		List<Photo> photos = (List<Photo>) query.getResultList();
		
		connection.disconnectToDB();
		return photos;
	}

	@Override
	public Photo persistir(Photo entity) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		connection.getEm().persist(entity);
		
		connection.disconnectToDB();
		return entity;
	}

	@Override
	public Photo recuperar(Serializable id) {
		MyConnection connection = new MyConnection();
		connection.connectToDB();
		
		Photo photo = connection.getEm().find(Photo.class, id);
		
		connection.disconnectToDB();
		return photo;
	}

}
