package practice0907;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;


public class PracFoodService {
 PracFoodDAO dao = new PracFoodDAO();
	
	public JSONArray getFoodList() {
		
		ArrayList<PracFood> list = dao.getFoodList();
		JSONArray arr = new JSONArray();
		
		for(PracFood food : list) {
			PracFood f = food;
			
			JSONObject o = new JSONObject();
			o.put("name", f.getName());
			o.put("price", f.getPrice());
			arr.put(o);
		}
		return arr;
	}
	
	
}
