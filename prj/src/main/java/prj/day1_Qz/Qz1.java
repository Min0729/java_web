package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz1")
public class Qz1 extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// 1. 두 수를 사용자로 부터 입력 받아 사칙연산해서 제공하기
	
	resp.setContentType("text/html");
	resp.setCharacterEncoding("utf-8");
	PrintWriter out = resp.getWriter();
	
	String su1_ =req.getParameter("su1");
	String su2_=req.getParameter("su2");
	
	int su1=Integer.parseInt(su1_);
	int su2=Integer.parseInt(su2_);
	
	int sum=su1+su2;
	int sub=su1-su2;
	int mul=su1*su2;
	int div=su1/su2;
			
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<meta charset=\"UTF-8\">");
	out.println("<title>Insert title here</title>");
	out.println("<script>");
	out.println("document.write(\"더하기 = "+sum +"\")");
	out.println("document.write(\"<br>\");");
	out.println("document.write(\"빼기 = "+sub+"\")");
	out.println("document.write(\"<br>\");");
	out.println("document.write( \"곱하기 = " +mul + "\")");
	out.println("document.write(\"<br>\");");
	out.println("document.write(\"나누기 = " + div + "\")");
	out.println("document.write(\"<br>\");");
	out.println("</script>");
	out.println("</head>");
	out.println("<body>");
	out.println("</body>");
	out.println("</html>");
	
}
}
;