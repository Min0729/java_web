package 놀이동산mvc;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParkService {

	ParkDAO dao = new ParkDAO();
	
	public JSONArray getTicketAllList(){
		
		ArrayList<TicketInfo> list = dao.selectTicketAll();
		JSONArray arr = new JSONArray();
		
		for(TicketInfo info : list) {
			TicketInfo t = info;
			
			JSONObject o = new JSONObject();
			o.put("id", t.getTicket_id());
			o.put("type", t.getTicket_type());
			o.put("time_type", t.getTicket_time_type());
			o.put("available_time", t.getTicket_available_time());
			o.put("age", t.getTicket_age());
			o.put("price", t.getTicket_price());
			
			arr.put(o);
			
		}
		return arr;
		
	}
	
	
	public JSONArray getPaymentDetails(String id) {
		
		ArrayList<Member_payment> list = dao.select_payment_details(id);
		JSONArray arr = new JSONArray();
		
		for(Member_payment mem : list) {
			Member_payment m = mem;
			
			JSONObject o = new JSONObject();
			o.put("id", m.getReceipt_id());
			o.put("date", m.getReceipt_date());
			o.put("type", m.getTicket_type());
			o.put("time_type", m.getTicket_time_type());
			o.put("available_time", m.getTicket_available_time());
			o.put("name", m.getName());
			o.put("age", m.getAge());
			o.put("price", m.getTicket_price());
			o.put("count", m.getReceipt_count());
			o.put("total_price", m.getTotal_price());
			
			arr.put(o);
		}
		
		return arr;
		
		
		
	}
	
	
}
