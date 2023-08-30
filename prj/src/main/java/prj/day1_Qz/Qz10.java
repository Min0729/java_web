// 10. 랜덤한 귀여운이미지 제공하기

package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz10")
public class Qz10 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		String[] img= {
				"https://item.kakaocdn.net/do/5c0c5b2d25725421eacddb609d5f35c015b3f4e3c2033bfd702a321ec6eda72c",
				"https://item.kakaocdn.net/do/5c0c5b2d25725421eacddb609d5f35c0a88f7b2cbb72be0bdfff91ad65b168ab",
				"https://ugc.production.linktr.ee/l3Vdw9mUTImHcXbnlgma_K1zS1De1y1YmXZN0",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGeoircBWC9N-RL29IoSDjG-GPdhvvUE08dg&usqp=CAU"
		};
		
		int index = (int)(Math.random()*4);
		
		//out.println("document.write(\"<img src=\"img[index]\">\")");
		out.println("<img src=img[index]>");
	}
}
