package 실습0906;

public class Lucy {

	String name;
	String position;
	String birth_year;
	
	public Lucy() {
		// TODO Auto-generated constructor stub
	}

	public Lucy(String name, String position, String birth_year) {
		super();
		this.name = name;
		this.position = position;
		this.birth_year = birth_year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	@Override
	public String toString() {
		return "Lucy [name=" + name + ", position=" + position + ", birth_year=" + birth_year + "]";
	}
	
	
	
}
