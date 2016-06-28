package main;

import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.scene.traversal.Direction;

import DAOJDBC.PhotoDAOJDBC;
import DAOJDBC.PointDAOJDBC;
import DAOJDBC.RouteDAOJDBC;
import DAOJDBC.RouteScoreDAOJDBC;
import DAOJDBC.TravelDAOJDBC;
import DAOJDBC.UserDAOJDBC;
import models.Apoint;
import models.Difficulty;
import models.Photo;
import models.Route;
import models.RouteScore;
import models.Travel;
import models.User;

/**
 * Servlet implementation class TestDao
 */
@WebServlet("/TestDao")
public class TestDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//User
		ArrayList<Route> routes = new ArrayList<Route>();
		ArrayList<RouteScore> routeScores = new ArrayList<RouteScore>();
		ArrayList<Route> traveledRoutes = new ArrayList< Route>();
		
		User user = new User("Admin", 33222111, "Juan", "Marconi", "La facu", 
							new Date("25/01/1991"), "M", "juan.m@mail.com", "Admin", 
							true, routes , routeScores, 
							traveledRoutes);
		UserDAOJDBC daoUser = new UserDAOJDBC();
		daoUser.persistir(user);
		User user1 = new User("User", 33112111, "Manuel", "Marconi", "La facu", 
				new Date("25/05/1993"), "M", "Manuel.m@mail.com", "User", 
				true, routes , routeScores, 
				traveledRoutes);
		User user2 = new User("User2", 33112111, "Usuario3", "Usuario2", "La facu", 
				new Date("25/05/1993"), "M", "Usuario2@gmail.", "User", 
				true, routes , routeScores, 
				traveledRoutes);
		daoUser.persistir(user1);
		daoUser.persistir(user2);
		//read
		boolean existeUser = daoUser.existe(user.getId());
		System.out.println("Existe el usuario admin?  " + existeUser);
		//update
		user1.setName("Pepe");
		daoUser.actualizar(user1);
		System.out.println("Se actualizo el usuario 2, ahora se llama  " + daoUser.recuperar(user1.getId()).getName());
		
		//destroy
		daoUser.borrar(user2.getId());
		System.out.println("Se elimino el usuario3, existe  " + daoUser.existe(user2.getId()));
		
		//get
		User obtenerUser = daoUser.recuperar(user.getId());
		System.out.println("Se recupero el usuario con nombre  " + obtenerUser.getName());
		
		
		//ROUTE
		Apoint point = new Apoint("-34.932632", "-57.955059");
		Apoint point1 = new Apoint("-34.934074", "-57.955917");
		Apoint point2 = new Apoint("-34.93263123", "-57.955124");
		Apoint point3 = new Apoint("-34.934022", "-57.955333");
		
		ArrayList<Apoint> points = new ArrayList<Apoint>();
		ArrayList<Apoint> points2 = new ArrayList<Apoint>();
		points.add(point);
		points.add(point1);
		points2.add(point2);
		points2.add(point3);
		
		Travel travel = new Travel(points);
		Travel travel2 = new Travel(points2);
		
		point.setTravel(travel);
		point1.setTravel(travel);
		point2.setTravel(travel2);
		point3.setTravel(travel2);
		
		
		ArrayList<Photo> photos2 = new ArrayList<Photo>();
		Photo photo7 = new Photo("Lago", "/public");
		Photo photo4 = new Photo("Lago1", "/public");
		Photo photo5 = new Photo("Lago2", "/public");
		Photo photo6 = new Photo("Lago3", "/public");
		photos2.add(photo4);
		photos2.add(photo5);
		photos2.add(photo6);
		photos2.add(photo7);
		
		
		ArrayList<Photo> photos = new ArrayList<Photo>();
		Photo photo = new Photo("Montania", "/public");
		Photo photo1 = new Photo("Montania1", "/public");
		Photo photo2 = new Photo("Montania2", "/public");
		Photo photo3 = new Photo("Montania3", "/public");
		photos.add(photo);
		photos.add(photo1);
		photos.add(photo2);
		photos.add(photo3);

		Route route = new Route("Ruta B","Por la montania" , true, travel, true,new Float(25.20), Difficulty.EASY, "correr", new Time(1)
				, new Date(), photos, null,user1 );
		photo.setRoute(route);
		photo1.setRoute(route);
		photo2.setRoute(route);
		photo3.setRoute(route);
		
		Route route2 = new Route("Ruta A","Por el lago" , true, travel2, true,new Float(25.20), Difficulty.EASY, "Nadar", new Time(1)
				, new Date(), photos2, null,user1 );
		photo7.setRoute(route2);
		photo4.setRoute(route2);
		photo5.setRoute(route2);
		photo6.setRoute(route2);
		
		
		
		RouteDAOJDBC daoRoute = new RouteDAOJDBC();
		daoRoute.persistir(route);
		daoRoute.persistir(route2);
		//read
		boolean existeRou = daoUser.existe(route.getId());
		boolean existeRouA = daoUser.existe(route2.getId());
		System.out.println("Existe la RUTA B " + existeRou);
		System.out.println("Existe la RUTA A " + existeRouA);
		//update
		route.setActivity("Caminar");
		daoRoute.actualizar(route);
		System.out.println("Se actualizo la ruta B ahora la actividad es " + daoRoute.recuperar(route.getId()).getActivity());
		//destroy
		daoRoute.borrar(route2.getId());
		System.out.println("Se elimino la ruta A, existe?  " + daoRoute.existe(route2.getId()));
		
		//ROUTE SCORE
		RouteScore routeS = new RouteScore(1, route, user);
		RouteScore routeS2 = new RouteScore(4, route, user1);
		RouteScore routeS3 = new RouteScore(5, route, user1);
		
		RouteScoreDAOJDBC daoRouteS = new RouteScoreDAOJDBC();
		daoRouteS.persistir(routeS);
		daoRouteS.persistir(routeS2);
		daoRouteS.persistir(routeS3);
		//read
		boolean existeRouteS = daoRouteS.existe(routeS.getId());
		System.out.println("Existe el score 1: " + existeRouteS);
		//update
		routeS.setScore(3);
		daoRouteS.actualizar(routeS);
		System.out.println("Se cambio el puntje del primer score, ahora es: " + daoRouteS.recuperar(routeS.getId()).getScore());
		
		//destroy
		daoRouteS.borrar(routeS2.getId());
		System.out.println("Se elimino el score 2, existe?: " + daoRouteS.existe(routeS2.getId()));
		
		
		//PHOTOS
		//read
		PhotoDAOJDBC daoPhoto = new PhotoDAOJDBC();
		boolean existePhoto = daoPhoto.existe(photo.getId());
		System.out.println("Existe la foto 1: " + existePhoto);
		//update
		photo.setName("Montania nevada");
		daoPhoto.actualizar(photo);
		System.out.println("Se cambio el nombre de la foto Montania, ahora es: " + daoPhoto.recuperar(photo.getId()).getName());
		
		//destroy
		daoPhoto.borrar(photo4);
		System.out.println("Se elimino la foto 4, existe?  " + daoPhoto.existe(photo4.getId()));
		
		//Point
		PointDAOJDBC daoPoint = new PointDAOJDBC();
		boolean existePoint = daoPoint.existe(point.getId());
		System.out.println("Existe el punto 1?: " + existePoint);
		//update
		point.setLatitude("000000");
		daoPoint.actualizar(point);
		System.out.println("Se cambio la latitud del punto 1, ahora es: " + daoPoint.recuperar(point.getId()).getLatitude());
		
		//destroy
		daoPoint.borrar(point.getId());
		System.out.println("Se elimino el punto 1, existe?  " + daoPoint.existe(point.getId()));
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
