package election.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import election.web.model.StudentBody;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("studentName");
		String password = request.getParameter("password");

		if (username == null || username == "" || password == null
				|| password == "") {
			response.sendRedirect("autError.jsp");
		} else {
			boolean found = false;
			StudentBody sb = null;
			sb = sb.getInstance();

			found = sb.authenticate(username, password);
			if (found == true) {
				response.sendRedirect("ballot.jsp");
			} else {
				if (username == null || username == "" || password == null || password == "") {
					response.sendRedirect("autError.jsp");
				} 
				response.sendRedirect("autError.jsp");
				// response.sendRedirect("index.jsp");
			}

		}

	}

}
