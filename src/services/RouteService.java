package services;

import java.util.List;

import DAOJDBC.PointDAOJDBC;
import DAOJDBC.RouteDAOJDBC;
import models.Apoint;
import models.Route;

public class RouteService {
	PointDAOJDBC pointDAO;
	RouteDAOJDBC routeDAO;
	
	public RouteService() {
		super();
		pointDAO = new PointDAOJDBC();
		routeDAO = new RouteDAOJDBC();
	}

	public Apoint getApoint(String id) {
		// TODO Auto-generated method stub
		return pointDAO.recuperar(id);
	}
	
	public List<Apoint> getApoints(String id) {
		// TODO Auto-generated method stub
		return pointDAO.recuperarTodos(id);
	}

	public boolean existeApoint(String id) {
		// TODO Auto-generated method stub
		return pointDAO.existe(id);
	}

	public void createApoint(Apoint point) {
		// TODO Auto-generated method stub
		pointDAO.persistir(point);
		
	}

	public void deleteApoint(String id) {
		// TODO Auto-generated method stub
		pointDAO.borrar(id);
		
	}

	public List<Route> getRoutesAsList() {
		// TODO Auto-generated method stub
		return routeDAO.todos();
	}

}
