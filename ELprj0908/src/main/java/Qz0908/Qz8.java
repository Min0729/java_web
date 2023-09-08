package Qz0908;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz8")
public class Qz8 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Coffee> list = new ArrayList<>();
		list.add(new Coffee("c001","아메리카노",2000));
		list.add(new Coffee("c002","카페라떼",3000));
		list.add(new Coffee("c003","바닐라라떼",3500));
		list.add(new Coffee("c004","카라멜마끼야또",4000));
		
		req.setAttribute("coffee", list);
		
		req.getRequestDispatcher("WEB-INF/Qz0908/qz8.jsp").forward(req, resp);
		
	}
	
}
