package models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static EMF instance = null;
	private EntityManagerFactory emf;
	
	public EMF(){
		
	}
	public static EMF getInstance(){
		if (instance == null){
			instance = new EMF();
		}
		return instance;
	}
	
	public EntityManagerFactory getEMF(){
		if (emf == null){
			emf = Persistence.createEntityManagerFactory("JRuteros");
		}
		return emf;
	}
	
	public void closeEMF(){
		if (emf.isOpen()  || emf != null){
			emf.close();
		}
		emf = null;
	}
	
	

}
