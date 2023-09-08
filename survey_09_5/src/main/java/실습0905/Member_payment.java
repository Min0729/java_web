package 실습0905;

public class Member_payment {

	String receipt_id;
	String receipt_date;
	String ticket_type;
	String ticket_time_type;
	String ticket_available_time;
	String name;
	String age;
	String ticket_price;
	String receipt_count;
	String total_price;
	
	public Member_payment() {
		// TODO Auto-generated constructor stub
	}

	public Member_payment(String receipt_id, String receipt_date, String ticket_type, String ticket_time_type,
			String ticket_available_time, String name, String age, String ticket_price, String receipt_count,
			String total_price) {
		super();
		this.receipt_id = receipt_id;
		this.receipt_date = receipt_date;
		this.ticket_type = ticket_type;
		this.ticket_time_type = ticket_time_type;
		this.ticket_available_time = ticket_available_time;
		this.name = name;
		this.age = age;
		this.ticket_price = ticket_price;
		this.receipt_count = receipt_count;
		this.total_price = total_price;
	}

	public String getReceipt_id() {
		return receipt_id;
	}

	public void setReceipt_id(String receipt_id) {
		this.receipt_id = receipt_id;
	}

	public String getReceipt_date() {
		return receipt_date;
	}

	public void setReceipt_date(String receipt_date) {
		this.receipt_date = receipt_date;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(String ticket_price) {
		this.ticket_price = ticket_price;
	}

	public String getReceipt_count() {
		return receipt_count;
	}

	public void setReceipt_count(String receipt_count) {
		this.receipt_count = receipt_count;
	}

	public String getTotal_price() {
		return total_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}

	@Override
	public String toString() {
		return "Member_payment [receipt_id=" + receipt_id + ", receipt_date=" + receipt_date + ", ticket_type="
				+ ticket_type + ", ticket_time_type=" + ticket_time_type + ", ticket_available_time="
				+ ticket_available_time + ", name=" + name + ", age=" + age + ", ticket_price=" + ticket_price
				+ ", receipt_count=" + receipt_count + ", total_price=" + total_price + "]";
	}
	
	
	
}
