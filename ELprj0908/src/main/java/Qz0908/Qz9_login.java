package Qz0908;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Qz9_login")
public class Qz9_login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/Qz0908/qz9_login.jsp").forward(req, resp);		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		if(id.equals(pwd)) {
			HttpSession session = req.getSession();
			session.setAttribute("id", id);
			resp.sendRedirect("/ELprj0908/Qz9_home");
		}else {
			resp.sendRedirect("/ELprj0908/Qz9_login");
			
		}
		
	}
	
}
