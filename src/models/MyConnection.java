package models;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyConnection {
	
	private EntityManager em;
	private EntityTransaction etx;
	
	/*private EntityManagerFactory emf;
	
	public EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory("JRuteros");
        }
        /*if(DEBUG) {
            System.out.println("factory created on: " + new Date());
        }
        return emf;
    }*/
	
	public MyConnection() {
		// TODO Auto-generated constructor stub
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public EntityTransaction getEtx() {
		return etx;
	}

	public void setEtx(EntityTransaction etx) {
		this.etx = etx;
	}
	
	public void connectToDB(){
		this.em = EMF.getInstance().getEMF().createEntityManager(); 
		this.etx = this.em.getTransaction();
		this.etx.begin();
	}
	
	public void disconnectToDB() {
		this.etx.commit();
		this.em.close();
	}
	
	public void connectToDBWithOutTrans(){
		this.em = EMF.getInstance().getEMF().createEntityManager(); 
	}
	
	public void disconnectToDBWithOutTrans(){
		this.em.close(); 
	}

}
