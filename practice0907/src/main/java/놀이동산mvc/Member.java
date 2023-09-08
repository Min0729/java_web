package 놀이동산mvc;

public class Member {

	String id;
	String name;
	String tel;
	String age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String name, String tel, String age) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", tel=" + tel + ", age=" + age + "]";
	}
	
	
	
	
}
