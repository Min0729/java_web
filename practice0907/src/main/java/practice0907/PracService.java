package practice0907;

import java.util.ArrayList;

public class PracService {

	PracDAO dao = new PracDAO();
	
	public ArrayList<String> getMemberList(){
		
		ArrayList<String> list = dao.selectAll();
		return list;
	}
	
	
}
