package app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import data.candidateData;

/**
 * Servlet implementation class ReadToUpdate
 */
@WebServlet("/")
public class ShowCandidates extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAO dao;
	public void init() {
		dao = new DAO("jdbc:mysql://localhost:3306/vaalikone", "sonny", "password");
	}
       
    public ShowCandidates() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<candidateData> list=null;
		if (dao.getConnection()) {
			list=dao.readAllcandidates();
		}
		request.setAttribute("ehdokaslist", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/showCandidates.jsp");
		rd.forward(request, response);
	}
}
