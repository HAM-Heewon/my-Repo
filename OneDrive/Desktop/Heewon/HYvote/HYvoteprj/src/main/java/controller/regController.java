package controller;

import java.io.IOException;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.regvoteService;
import model.regvoteDAO;
import model.regvoteDTO;

@WebServlet("/regvote.do")
public class regController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/view/regPage.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UFT-8");
		
		String jm = request.getParameter("v_jumin");
		String name = request.getParameter("v_name");
		String area = request.getParameter("v_area");
		String time = request.getParameter("v_time");
		String conf = request.getParameter("v_confirm");
		String no = request.getParameter("n_no");
		
		regvoteDAO dao = new regvoteDAO();
		regvoteService s = new regvoteService(dao);
		regvoteDTO dto = new regvoteDTO(jm, name, area, time, conf, no);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
	}
}
