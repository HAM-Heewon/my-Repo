package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.goodsDAO;
import model.goodsService;
import model.goodsmanageDTO;

@WebServlet("/goodsfix.do")
public class goodsfixController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/main/goods_list.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		
		String cd = req.getParameter("g_cd");
		String nm = req.getParameter("g_nm");
		String price = req.getParameter("g_price");
		String cost = req.getParameter("cost");
		String date = req.getParameter("date");
		
		goodsDAO dao = new goodsDAO();
		goodsService s = new goodsService();
		goodsmanageDTO dto = new goodsmanageDTO(cd,nm,price,cost,date);
		s.insert(dto);
		
		resp.sendRedirect("goods_list.jsp");
		
	}
}
