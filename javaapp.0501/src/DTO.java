import java.io.Serializable;

//노래 장르(문자열), 노래제목(문자열), 노래 평점(실수)을 저장하는 클래스
public class DTO implements Serializable{
	private String genre;
	private String title;
	private double grade;	
	
	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DTO [genre=" + genre + ", title=" + title + ", grade=" + grade + "]";
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public DTO(String genre, String title, double grade) {
		super();
		this.genre = genre;
		this.title = title;
		this.grade = grade;
	}
	
	
}
