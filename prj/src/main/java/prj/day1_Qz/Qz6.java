package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//6. 수를 사용자로부터 받으면 입력한 수에 대한 약수를 구해서 제공하기

@WebServlet("/Qz6")
public class Qz6 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		String su_=req.getParameter("su");
		int su = Integer.parseInt(su_);
		
		out.print(su+"의 약수는 ");
		
		for(int i=1; i<=su; i++) {
			if(su%i==0) {
				out.print(i+" ");
			}
		}
		out.print("입니다");
		
		
		/*out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("<script>");
		out.println("let su = parseInt(prompt(\"약수를 구할 수를 입력하세요\"));");
		out.println("document.write(\"약수는 \")");
		out.println("for(let i=1; i<=su; i++){");
		out.println("if(su%i==0){");
		out.println("document.write(i+\" \");}}");
		out.println("document.write(\"입니다\")");
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");
		*/
		
		
	}
	
}
