package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 9. 귀여운이미지 제공하기

@WebServlet("/Qz9")
public class Qz9 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src=\"/prj/img/img.jpg\">");   //   /서비스명(프로젝트명)/폴더명/
		out.println("</body>");
		out.println("</html>");
	}
		
		
		
	
	
}
