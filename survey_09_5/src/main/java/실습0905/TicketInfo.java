package 실습0905;

public class TicketInfo {

	String ticket_id;
	String ticket_type;
	String ticket_time_type;
	String ticket_available_time;
	String ticket_age;
	int ticket_price;
	
	public TicketInfo() {
		// TODO Auto-generated constructor stub
	}

	public TicketInfo(String ticket_id, String ticket_type, String ticket_time_type, String ticket_available_time,
			String ticket_age, int ticket_price) {
		super();
		this.ticket_id = ticket_id;
		this.ticket_type = ticket_type;
		this.ticket_time_type = ticket_time_type;
		this.ticket_available_time = ticket_available_time;
		this.ticket_age = ticket_age;
		this.ticket_price = ticket_price;
	}

	public String getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public String getTicket_time_type() {
		return ticket_time_type;
	}

	public void setTicket_time_type(String ticket_time_type) {
		this.ticket_time_type = ticket_time_type;
	}

	public String getTicket_available_time() {
		return ticket_available_time;
	}

	public void setTicket_available_time(String ticket_available_time) {
		this.ticket_available_time = ticket_available_time;
	}

	public String getTicket_age() {
		return ticket_age;
	}

	public void setTicket_age(String ticket_age) {
		this.ticket_age = ticket_age;
	}

	public int getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}

	@Override
	public String toString() {
		return "TicketInfo [ticket_id=" + ticket_id + ", ticket_type=" + ticket_type + ", ticket_time_type="
				+ ticket_time_type + ", ticket_available_time=" + ticket_available_time + ", ticket_age=" + ticket_age
				+ ", ticket_price=" + ticket_price + "]";
	}
	
	
	
}

