package 실습0905;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ticketList")
public class ParkGetAllTicket_Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ParkService p = new ParkService();
		
		ArrayList<TicketInfo> list = p.getTicketInfoList();
		System.out.println(list);
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/실습_0905/ticketList.jsp").forward(req, resp);
	}
	
}
