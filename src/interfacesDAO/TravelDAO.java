package interfacesDAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import models.Travel;

public interface TravelDAO extends GenericDAO<Travel>{

	@Override
	public boolean actualizar(Travel entity);


	@Override
	public boolean borrar(Serializable id);
	
	@Override
	public void borrar(Travel entity);
	
	@Override
	public boolean existe(Serializable id);
			
	public List<Travel> recuperarTodos(Serializable id);

	@Override
	public Travel persistir(Travel entity);

	@Override
	public Travel recuperar(Serializable id);

}
