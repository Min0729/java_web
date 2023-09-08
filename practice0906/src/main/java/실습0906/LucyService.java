package 실습0906;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class LucyService {

	LucyDAO dao = new LucyDAO();
	
	public JSONArray getLucyRealList() {
		
		ArrayList<Lucy> list = dao.getLucyList();
		JSONArray arr = new JSONArray();
		
		for(int i=0; i<list.size(); i++) {
			Lucy lucy = list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", lucy.getName());
			o.put("position", lucy.getPosition());
			o.put("birth_year", lucy.getBirth_year());
			
			arr.put(o);
		}
		return arr;
		
		
	}

}
