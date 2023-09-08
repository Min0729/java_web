package 실습0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Goods")
public class GoodsGetServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		GoodsService g = new GoodsService();
		
		Goods goods = g.getGoods(id);
		
		req.setAttribute("g", goods);
		req.getRequestDispatcher("WEB-INF/views/goods실습0901/goods.jsp").forward(req, resp);
		
		
	}
}

