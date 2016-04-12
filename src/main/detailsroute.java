package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class detailsroute
 */
@WebServlet("/detailsroute")
public class detailsroute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public detailsroute() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", request.getParameter("name") );
		switch (request.getParameter("name")) {	
		case "13 dias en bicicleta por el centro de Inglaterra":
			request.setAttribute("description", "Nuestra ruta en bicicleta por el centro de Inglaterra" );
			request.setAttribute("privacy", "Pública" );
			request.setAttribute("travel", "/img/mapa-ruta-bicicleta-centro-inglaterra.jpg" );
			request.setAttribute("format", "Circuito" );
			request.setAttribute("distance", "1300" );
			request.setAttribute("difficulty", "Muy dificil" );
			request.setAttribute("activity", "Ciclismo, Cicloturismo" );
			request.setAttribute("time", "13 días" );
			request.setAttribute("date", "12/02/2016" );
			request.setAttribute("photos", "/img/ing_centro.jpg" );
			break;

		case "El gran viaje":
			request.setAttribute("description", "Ruta por el sur de Inglaterra Elaboración propia con Google Maps" );
			request.setAttribute("privacy", "Pública" );
			request.setAttribute("travel", "/img/Inglaterra-sur.png" );
			request.setAttribute("format", "Solo ida" );
			request.setAttribute("distance", "600" );
			request.setAttribute("difficulty", "Dificil" );
			request.setAttribute("activity", "Vela, Ciclismo" );
			request.setAttribute("time", "6 días" );
			request.setAttribute("date", "23/03/2016" );
			request.setAttribute("photos", "/img/ing_sur.jpg" );
			break;

		case "Escocia. Con mi musica a otra parte":
			request.setAttribute("description", "Recomendado por viajeros, alojamientos regentados por familias, muy acogedores y con un trato personal excelente." );
			request.setAttribute("privacy", "Pública" );
			request.setAttribute("travel", "/img/ruta_escocia_21.jpg" );
			request.setAttribute("format", "Circuito" );
			request.setAttribute("distance", "2000" );
			request.setAttribute("difficulty", "Moderado" );
			request.setAttribute("activity", "Motociclismo" );
			request.setAttribute("time", "10 días" );
			request.setAttribute("date", "11/04/2016" );
			request.setAttribute("photos", "/img/guia-de-escocia.jpg" );
			break;

		default:
			break;
		}

		RequestDispatcher view = request.getRequestDispatcher("detailsroute.jsp");
		view.forward(request, response);
	}

}
