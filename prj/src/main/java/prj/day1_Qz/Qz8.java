// 8. 랜덤한 화이팅메시지 제공하기

package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Qz8")
public class Qz8 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		String[] message = {"화이팅", "파이팅", "힘내", "Fighting"};
		
		int index = (int)(Math.random()*4);
		
		out.println(message[index]);
		
		
		
	}
	
	
}
