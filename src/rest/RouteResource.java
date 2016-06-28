package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import models.Apoint;
import services.RouteService;

@Path("/route")
public class RouteResource {

	/*public RouteResource(UriInfo uriInfo, Request request, String id) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		routeService = new RouteService();
	}*/
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

	/*@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Apoint getApoint() {
		Apoint point = routeService.getApoint(id);
		return point;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public Apoint getApointAsHtml() {
		Apoint point = routeService.getApoint(id);
		return point;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putApoint(JAXBElement<Apoint> pointElemnt) {
		Apoint point = pointElemnt.getValue();
		Response response;
		if (routeService.existeApoint(id)) {
			response = Response.noContent().build();
		} else {
			response = Response.created(uriInfo.getAbsolutePath()).build();
		}
		routeService.createApoint(point);
		return response;
	}

	@DELETE
	public void deleteApoint() {
		routeService.deleteApoint(id);
	}
	
	@Path("{point}")
	public ApointResource getApoint(@PathParam("point") String id) {
		return new ApointResource(uriInfo, request, id);
	}*/

}
