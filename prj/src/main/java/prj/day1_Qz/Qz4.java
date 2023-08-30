package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 4. 학생성적을 처리하기 위한 Score class를 만든것처럼
// 자신이 처리하고 싶은 자료에 대한 class를 만들고 그 정보를 제공하기 (응답해 주기)
// 예) 책정보:Book class 

@WebServlet("/Qz4")
public class Qz4 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		
		Book book = new Book ("재미있는 서블릿", "lee", 25000);
		PrintWriter out = resp.getWriter();
		out.println(book);
	}
	
}
