package interfacesDAO;

import java.io.Serializable;
import java.util.List;

import models.Apoint;

public interface PointDAO extends GenericDAO<Apoint>{

	@Override
	public boolean actualizar(Apoint entity);


	@Override
	public boolean borrar(Serializable id);
	
	@Override
	public void borrar(Apoint entity);
	
	@Override
	public boolean existe(Serializable id);
			
	public List<Apoint> recuperarTodos(Serializable id);

	@Override
	public Apoint persistir(Apoint entity);

	@Override
	public Apoint recuperar(Serializable id);

}
