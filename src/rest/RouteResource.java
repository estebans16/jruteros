package rest;

import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import DAOJDBC.RouteDAOJDBC;
import DAOJDBC.UserDAOJDBC;
import models.Apoint;
import models.Difficulty;
import models.Photo;
import models.Route;
import models.RouteScore;
import models.Travel;
import models.User;
import services.RouteService;

@Path("/route/{param}")
public class RouteResource {
	
	RouteService routeService;

	public RouteResource() {
		routeService = new RouteService();
		//this.createRoute();
		
	}
	
	/*@GET
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}*/
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Apoint> getApoints(@PathParam("param") String idRoute) {
		List<Apoint> points = routeService.getApoints(new Long(idRoute));
		return points;
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createPoint(@FormParam("id") String id,
			@FormParam("lat") String lat,
			@FormParam("lon") String lon,
			@PathParam("param") String idRoute,
			@Context HttpServletResponse servletResponse) throws IOException {
		Apoint point = new Apoint(lon,lat);
		point.setTravel(routeService.getTravel(new Long(idRoute)));
		routeService.createApoint(point);
		servletResponse.setStatus(HttpServletResponse.SC_ACCEPTED);
	}
	
	@DELETE
	public void deleteApoint(@PathParam("param") String idRoute) {
		routeService.deleteAllPoints(new Long(idRoute));
	}
	
	
	/*@Path("{point}")
	public ApointResource getApoint(@PathParam("point") String id) {
		return new ApointResource(uriInfo, request, id);
	}*/
	/*
	private void createRoute(){
		ArrayList<Route> routes = new ArrayList<Route>();
		ArrayList<RouteScore> routeScores = new ArrayList<RouteScore>();
		ArrayList<Route> traveledRoutes = new ArrayList< Route>();
		User user1 = new User("User", 33112111, "Manuel", "Marconi", "La facu", 
				new Date("25/05/1993"), "M", "Manuel.m@mail.com", "User", 
				true, routes , routeScores, 
				traveledRoutes);
		User user2 = new User("User2", 33112111, "Usuario3", "Usuario2", "La facu", 
				new Date("25/05/1993"), "M", "Usuario2@gmail.", "User", 
				true, routes , routeScores, 
				traveledRoutes);
		UserDAOJDBC daoUser = new UserDAOJDBC();
		daoUser.persistir(user1);
		daoUser.persistir(user2);
		Apoint point = new Apoint("-57.950308", "-34.922448");
		Apoint point1 = new Apoint("-57.950907", "-34.923576");
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
	}
*/
}
