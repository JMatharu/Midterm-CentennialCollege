package election.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import election.web.exception.VotingException;
import election.web.model.Candidates;

/**
 * Servlet implementation class VoteServlet
 */
@WebServlet("/vote")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VoteServlet() {
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
		HttpSession session = request.getSession();
		String voterName = request.getParameter("vote").trim();

		if (voterName.equals("Aakash Khan")) {
			Candidates cd = Candidates.getInstance();

			String name = "Aakash Khan";
			try {
				cd.voteFor(name);
			} catch (VotingException e) {
				// TODO Auto-generated catch block
				response.sendRedirect("errorpage.jsp");
			}
			cd.printVoteCount(System.out);
			session.setAttribute("username", null);
			response.sendRedirect("thankyou.jsp");
		} else if (voterName.equals("Marion Wells")) {
			Candidates cd = Candidates.getInstance();

			String name = "Marion Wells";
			try {
				cd.voteFor(name);
			} catch (VotingException e) {
				// TODO Auto-generated catch block
				response.sendRedirect("errorpage.jsp");
			}
			cd.printVoteCount(System.out);
			session.setAttribute("username", null);
			response.sendRedirect("thankyou.jsp");
		} else if (voterName.equals("Damien Yu")) {
			Candidates cd = Candidates.getInstance();

			String name = "Damien Yu";
			try {
				cd.voteFor(name);
			} catch (VotingException e) {
				// TODO Auto-generated catch block
				response.sendRedirect("errorpage.jsp");
			}
			cd.printVoteCount(System.out);
			session.setAttribute("username", null);
			response.sendRedirect("thankyou.jsp");
		}
		
		if(null==session.getAttribute("username"))
        {
            response.sendRedirect("autError.jsp");
        }

	}

}
