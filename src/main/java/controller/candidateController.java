package controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.candidateDTO;
import model.regvoteDAO;
import model.regvoteService;

@WebServlet("/candi.do")
public class candidateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		regvoteDAO dao = new regvoteDAO();
		regvoteService s = new regvoteService(dao);
		ArrayList<candidateDTO> arr = s.candidate();
		req.setAttribute("arr", arr);
		req.getRequestDispatcher("WEB-INF/view/candidate.jsp").forward(req, resp);
	}
}
