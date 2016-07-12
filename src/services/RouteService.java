package services;

import java.util.ArrayList;
import java.util.List;

import DAOJPA.PointDAOJPA;
import DAOJPA.RouteDAOJPA;
import DAOJPA.TravelDAOJPA;
import models.Apoint;
import models.Route;
import models.Travel;

public class RouteService {
	PointDAOJPA pointDAO;
	RouteDAOJPA routeDAO;
	TravelDAOJPA travelDAO;
	Route route ;
	
	public RouteService() {
		super();
		pointDAO = new PointDAOJPA();
		routeDAO = new RouteDAOJPA();
		travelDAO = new TravelDAOJPA();
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
