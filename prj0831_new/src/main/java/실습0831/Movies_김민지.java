package 실습0831;

public class Movies_김민지 {
	
	String name;
	String genre;
	int running_time;
	String director;
	
	public Movies_김민지() {
		// TODO Auto-generated constructor stub
	}

	public Movies_김민지(String name, String genre, int running_time, String director) {
		super();
		this.name = name;
		this.genre = genre;
		this.running_time = running_time;
		this.director = director;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRunning_time() {
		return running_time;
	}

	public void setRunning_time(int running_time) {
		this.running_time = running_time;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", genre=" + genre + ", running_time=" + running_time + ", director=" + director
				+ "]";
	}
	
	
	
}
