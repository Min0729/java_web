package Qz0908;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz4")
public class Qz4 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] likes = {"돈까스","떡볶이","크로플","푸딩"};
		req.setAttribute("likes", likes);
		req.getRequestDispatcher("WEB-INF/Qz0908/qz4.jsp").forward(req, resp);
		
	}
	
}
