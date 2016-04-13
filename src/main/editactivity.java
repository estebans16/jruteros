package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editactivity
 */
@WebServlet("/editactivity")
public class editactivity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editactivity() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("editactivity.jsp");
		request.setAttribute("user", "admin" );
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		switch (request.getParameter("name")) {	
		case "Running":
			request.setAttribute("date", "01/01/2016" );
			request.setAttribute("name", "Running" );
			request.setAttribute("ruta1", "selected" );
			request.setAttribute("ruta2", "selected" );
			request.setAttribute("ruta3", "selected" );
			break;

		case "Mountain":
			request.setAttribute("date", "01/04/2016" );
			request.setAttribute("name", "Mountain" );
			request.setAttribute("ruta1", "selected" );
			request.setAttribute("ruta2", "selected" );
			request.setAttribute("ruta3", "selected" );
			break;

		case "Maraton":
			request.setAttribute("date", "01/06/2016" );
			request.setAttribute("name", "Maraton" );
			request.setAttribute("ruta1", "selected" );
			request.setAttribute("ruta2", "selected" );
			request.setAttribute("ruta3", "selected" );
			break;
			
		case "Ciclismo":
			request.setAttribute("date", "01/06/2016" );
			request.setAttribute("name", "Ciclismo" );
			request.setAttribute("ruta1", "selected" );
			request.setAttribute("ruta2", "selected" );
			request.setAttribute("ruta3", "selected" );
			break;

		default:
			break;
		}

		RequestDispatcher view = request.getRequestDispatcher("editactivity.jsp");
		view.forward(request, response);
	}

}
