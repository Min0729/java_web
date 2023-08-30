package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz5")
public class Qz5 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		String su_ = req.getParameter("su");
		int su=Integer.parseInt(su_);
		
		out.println("별의개수 = " + su);
		for(int i=0; i<su; i++) {
			out.print("*");
		}
		
		/*out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("<script>");
		out.println("let su =parseInt(prompt(\"원하는 별의 개수를 입력하세요\"));");
		out.println("for(let i=0; i<su; i++){");
		out.println("document.write(\"*\")}");
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");*/
		
		
	}
	
}
