package practice0907;

public class PracFood {

	String name;
	String price;
	
	public PracFood() {
		// TODO Auto-generated constructor stub
	}

	public PracFood(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PracFood [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
