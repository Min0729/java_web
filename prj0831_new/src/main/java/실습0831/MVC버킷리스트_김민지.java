package 실습0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/버킷리스트_김민지")
public class MVC버킷리스트_김민지 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Service버킷리스트_김민지 s = new Service버킷리스트_김민지();
		ArrayList<String> list = s.getList();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/실습_김민지/버킷리스트_김민지.jsp").forward(req, resp);
		
	}
	
}
