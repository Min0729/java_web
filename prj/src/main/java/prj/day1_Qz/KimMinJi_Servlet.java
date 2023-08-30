package prj.day1_Qz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lucy")
public class KimMinJi_Servlet extends HttpServlet{
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

	out.println("<h1>Lucy</h2>");
	out.println("<img src=\"https://i.namu.wiki/i/2egyMaFclfAWMpsTrxtXkFX-H5Elm8fh-nejaHR-n5a4imLBapQtOyzfZAg97x9kBem1O9AfrsNcHyWgEcZ7BK4hYgK6-wVaebn4P66_egf6qJMPiEv8I0tZfU7PyRPhOLqFmISWGmcjMW1NoIyjTQ.webp\">");
	out.println("<h2>최상엽 · 신예찬 · 신광일 · 조원상</h2>");
		
	out.println("<ul>");
	out.println("<ul>");
	out.println("<img src=\"https://i.namu.wiki/i/p_Q3i9txNwr_3Oe7k70LcvuL1YPFcuujamyHYhYF18uK2aeToTPriEecob6RGJVo2fB0rxGSfPmM-aHE4MNMkIPrbxJIpr7vg-3JrkcgoawrZSv7ut9PiJP-I7BvoloOimPK_blMyDNBTcbxFygdHQ.webp\">");
	out.println("<br>");
	out.println("신예찬");
	out.println("<li>1992.06.13</li>");
	out.println("<li>리더</li>");
	out.println("<li>바이올린</li>");
	out.println("</ul>");
	out.println("<ul>");
	out.println("<img src=\"https://i.namu.wiki/i/FJAKZKDaUDwGJO2bV8ehg3gWmZW7pOYXLKyzBqgeQShfxpV2fl6U4DwTkzHVDWtbNQtaA8OKuiCnzRXy3S22bjUrC1MgRfFkJ7rPJ_kMtuXTip6J2CvoJSA_AzoTGr34b3LzRRmIRvMofJjLATVW6g.webp\">");
	out.println("<br>");
	out.println("최상엽");
	out.println("<li>1994.02.27</li>");
	out.println("<li>보컬</li>");;
	out.println("<li>기타</li>");
				
	out.println("</ul>");
	out.println("<ul>");
	out.println("<img src=\"https://i.namu.wiki/i/S8XTiCkAj00wKtM1VBftqFmX6sroC2KmftwfHW2TkdI9i9_-W-PCMsg1eHw9fkMbZfOKAGfAyLS18iUueaZyjBNuwjKBjDMHpkTlozCCXex0NWv7KL2O_Gub8JT4q7IdOAhHFA6wCdPkJKxWVp8XsQ.webp\">");
	out.println("<br>");
	out.println("조원상");
	out.println("<li>1996.08.15</li>");
	out.println("<li>베이스</li>");
	out.println("<li>프로듀싱</li>");
	out.println("</ul>");
	out.println("<ul>");
	out.println("<img src=\"https://i.namu.wiki/i/gpQbGpeTTzpRzrGxXZaSpnUTTnDXDyH8qpa9pZ6z1pVl-w0Yw6hIgX53mijl-HgkPULP3Xi4xUkwKEuvzdwhHKdTWGxjO5b81662CBwAxb5UOhDnViFT5O188RGhB9rt_R30NIjdy9cKjQVUKh6U7Q.webp\">");
	out.println("<br>");
	out.println("신광일");
	out.println("<li>1997.05.25</li>");
	out.println("<li>드럼</li>");
	out.println("<li>보컬</li>");
				
	out.println("</ul>");
	out.println("</ul>");

	out.println("</body>");
	out.println("</html>");
	
	
	
}
	
	
}
