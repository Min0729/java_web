package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 7. 화이팅메시지 제공하기

@WebServlet("/Qz7")
public class Qz7 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println("화이팅!!!");
		
		/*
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("<script>");
		out.println("alert(\"화이팅!!!\");");
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");*/
	}
	
}
