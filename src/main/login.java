package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String[] userName = {"admin", "user"};
    private String[] userPass = {"admin", "user"};
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		// TODO Auto-generated method stub
		if (validate(request.getParameter("username"),request.getParameter("userpass"))){
			RequestDispatcher view;
			if (request.getParameter("username").equals("admin")){
				view = request.getRequestDispatcher("admin.jsp");
			}else {
				view = request.getRequestDispatcher("user.jsp");
			}
			
			view.forward(request, response);
			
		}else {
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		}
		
	}
	
	private boolean validate(String user, String pass){
		for (int i = 0; i < userName.length; i++) {
			if (userName[i].equals(user) && userPass[i].equals(pass)){
				return true;
			}
		}
		return false;
		
	}

}
