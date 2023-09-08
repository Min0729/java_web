package 실습0905;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberPayment")
public class ParkGetMemberPayment_Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		ParkService p = new ParkService();
		ArrayList<Member_payment> m = p.getMemberPayment(id);
		
		req.setAttribute("m", m);
		req.getRequestDispatcher("WEB-INF/실습_0905/memberPayment.jsp").forward(req, resp);
		
		
		
	}
	
}
