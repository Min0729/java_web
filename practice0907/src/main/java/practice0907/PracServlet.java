package practice0907;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/practice")
public class PracServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PracService s = new PracService();
		
		ArrayList<String> list = s.getMemberList();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/prac.jsp").forward(req, resp);
		
	}
	
	
}
