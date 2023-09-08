package 놀이동산mvc;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class MemberService {

	ParkDAO dao = new ParkDAO();
	
	public JSONArray getMemberList() {
		
		ArrayList<Member> list = dao.select_member_list();
		JSONArray arr = new JSONArray();
		
		for(Member l : list) {
			Member m = l;
		
			JSONObject o = new JSONObject();
			
			o.put("id", m.getId());
			o.put("name", m.getName());
			o.put("tel", m.getTel());
			o.put("age", m.getAge());
			
			arr.put(o);
			
		}
		return arr;
		
	}
	
	public void deleteOne(String id) {
		
		dao.deleteOne(id);
		
	}
	
	
}
