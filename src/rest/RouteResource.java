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
import services.ResponseApoint;
import services.RouteService;

@Path("/route/{param}")
public class RouteResource {
	
	RouteService routeService;

	public RouteResource() {
		routeService = new RouteService();
		
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON })
	public List<ResponseApoint> getApoints(@PathParam("param") String idRoute) {
		List<Apoint> points = routeService.getApoints(new Long(idRoute));
		ArrayList<ResponseApoint> pointsList = new ArrayList<ResponseApoint>();
		for (Apoint point : points) {
			pointsList.add(new ResponseApoint(point.getId(), point.getLatitude(),point.getLonguitude()));
		}
		return pointsList;
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
	public void deleteApoint(@PathParam("param") String idRoute, @FormParam("id") String idPoint) {
		System.out.println(idPoint);
		if (idPoint == null){
			routeService.deleteAllPoints(new Long(idRoute));
		}
		else{
			routeService.deleteApoint(new Long(idPoint));	
		}
		
	}
	
}
