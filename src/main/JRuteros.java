package main;

import java.awt.Point;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOJDBC.PhotoDAOJDBC;
import DAOJDBC.PointDAOJDBC;
import DAOJDBC.RouteDAOJDBC;
import DAOJDBC.RouteScoreDAOJDBC;
import DAOJDBC.TravelDAOJDBC;
import DAOJDBC.TraveledRouteDAOJDBC;
import DAOJDBC.UserDAOJDBC;
import models.Apoint;
import models.Difficulty;
import models.Photo;
import models.Route;
import models.RouteScore;
import models.Travel;
import models.TraveledRoute;
import models.User;

/**
 * Servlet implementation class JRuteros
 */
@WebServlet("/JRuteros")
public class JRuteros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JRuteros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);*/
		
		Photo photo = new Photo("li", "lo");
		PhotoDAOJDBC dao = new PhotoDAOJDBC();
		dao.persistir(photo);
		boolean existe = dao.existe("1");
		
		//Photo photo2 = dao.recuperar(1);
		//System.out.println("La foto 1 es: " + photo2.getName());
		System.out.println("existe: " + existe);
		
		/*Apoint point = new Apoint("123", "456");
		PointDAOJDBC daoPoint = new PointDAOJDBC();
		daoPoint.persistir(point);
		boolean existe = daoPoint.existe("1");
		System.out.println("existe: " + existe);*/
		
		/*RouteDAOJDBC daoRoute = new RouteDAOJDBC();
		
		Route route = new Route("A","Desc" , true, new Travel(new Apoint()), true, 25, new Difficulty().EASY, "correr",
				new Time(), new Date(), new ArrayList<Photo>());*/
		
		/*RouteScore routeS = new RouteScore(20, new Route());
		RouteScoreDAOJDBC daoRouteS = new RouteScoreDAOJDBC();
		daoRouteS.persistir(routeS);
		boolean existe = daoRouteS.existe("1");
		System.out.println("existe: " + existe);*/
		
		/*ArrayList<Apoint> pointsList = new ArrayList<Apoint>();
		pointsList.add(new Apoint("789", "5565"));
		Travel travel = new Travel(pointsList);
		TravelDAOJDBC daoTravel = new TravelDAOJDBC();
		daoTravel.persistir(travel);*/
		
		/*TraveledRoute traveledRoute = new TraveledRoute(new Route());
		TraveledRouteDAOJDBC daoTraveledR = new TraveledRouteDAOJDBC();
		daoTraveledR.persistir(traveledRoute);
		boolean existe = daoTraveledR.existe("1");
		System.out.println("existe: " + existe);*/
		
		/*User user = new User("Admin", 33222111, "Juan", "Marconi", "La facu", new Date("25/01/1991"), "M", "juan.m@mail.com", "Admin", 
							true, new ArrayList<Route>() , new ArrayList<RouteScore>(), new ArrayList<TraveledRoute>());
		UserDAOJDBC daoUser = new UserDAOJDBC();
		daoUser.persistir(user);
		boolean existe = daoUser.existe("1");
		System.out.println("existe: " + existe);*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
