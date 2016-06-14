package interfacesDAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import models.TraveledRoute;

public interface TraveledRouteDAO extends GenericDAO<TraveledRoute>{

	@Override
	public boolean actualizar(TraveledRoute entity);


	@Override
	public boolean borrar(Serializable id);
	
	@Override
	public void borrar(TraveledRoute entity);
	
	@Override
	public boolean existe(Serializable id);
			
	public List<TraveledRoute> recuperarTodos(Serializable id);

	@Override
	public TraveledRoute persistir(TraveledRoute entity);

	@Override
	public TraveledRoute recuperar(Serializable id);

}
