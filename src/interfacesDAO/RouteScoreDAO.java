package interfacesDAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import models.RouteScore;

public interface RouteScoreDAO extends GenericDAO<RouteScore>{

	@Override
	public boolean actualizar(RouteScore entity);


	@Override
	public boolean borrar(Serializable id);
	
	@Override
	public void borrar(RouteScore entity);
	
	@Override
	public boolean existe(Serializable id);
			
	public List<RouteScore> recuperarTodos(Serializable id);

	@Override
	public RouteScore persistir(RouteScore entity);

	@Override
	public RouteScore recuperar(Serializable id);

}
