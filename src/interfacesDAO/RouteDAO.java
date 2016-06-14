package interfacesDAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import models.Route;

public interface RouteDAO extends GenericDAO<Route>{

	@Override
	public boolean actualizar(Route entity);


	@Override
	public boolean borrar(Serializable id);
	
	@Override
	public void borrar(Route entity);
	
	@Override
	public boolean existe(Serializable id);
			
	public List<Route> recuperarTodos(Serializable id);

	@Override
	public Route persistir(Route entity);

	@Override
	public Route recuperar(Serializable id);

}
