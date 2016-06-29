package services;

import java.util.ArrayList;
import java.util.List;

import DAOJDBC.PointDAOJDBC;
import DAOJDBC.RouteDAOJDBC;
import DAOJDBC.TravelDAOJDBC;
import models.Apoint;
import models.Route;
import models.Travel;

public class RouteService {
	PointDAOJDBC pointDAO;
	RouteDAOJDBC routeDAO;
	TravelDAOJDBC travelDAO;
	Route route ;
	
	public RouteService() {
		super();
		pointDAO = new PointDAOJDBC();
		routeDAO = new RouteDAOJDBC();
		travelDAO = new TravelDAOJDBC();
	}
	
	public List<Apoint> getApoints(Long idRoute) {
		// TODO Auto-generated method stub
		route = routeDAO.recuperar(idRoute);
		//return route.getTravel().getPointsList();
		List<Apoint> pointList = new ArrayList<Apoint>();
		pointList.addAll(pointDAO.recuperarTodos(route.getTravel().getId()));
		return pointList;
		//return pointDAO.recuperarTodos(route.getTravel().getId());
	}

	public Apoint getApoint(String id) {
		// TODO Auto-generated method stub
		return pointDAO.recuperar(id);
	}
	
	public void createApoint(Apoint point) {
		// TODO Auto-generated method stub
		pointDAO.persistir(point);
		
	}
	
	public Travel getTravel(Long id) {
		// TODO Auto-generated method stub
		return routeDAO.recuperar(id).getTravel();
	}
	
	public void deleteApoint(Long id) {
		// TODO Auto-generated method stub
		pointDAO.borrar(id);
		
	}

	public void deleteAllPoints(Long id) {
		// TODO Auto-generated method stub
		Route route = routeDAO.recuperar(id);
		pointDAO.borrarTodosPorTravel(route.getTravel().getId());
	}
	
}
