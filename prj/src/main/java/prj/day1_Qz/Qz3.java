package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz3")
public class Qz3 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 3. 원하는단 제공하기 (원하는단을 제공하는 서비스)
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		String dan_=req.getParameter("dan");
		int dan = Integer.parseInt(dan_);
		
		out.println(dan+"단\n");
		for(int i=1;i<=9; i++){
			out.println(dan+"*"+i+"="+dan*i);
		}
		
		/*out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("<script>");
		//out.println("let dan = parseInt(prompt(\"원하는 단을 입력하세요\"));");
		out.println("for(let i=1;i<=9; i++){");
		out.println("	document.write(dan+\"*\"+i+\"=\"+dan*i+\"<br>\");}");
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");*/
	}
	
}
