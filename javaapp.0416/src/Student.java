
public class Student {

            //오늘 배울 항목들은 메인 메소드와 메인을 도와주는 클래스가 있기때문에 강사님 클래스를 주석으로 한 클래스에 몰아서 적어서 보기 편하게 할것임 
             // 강사님 클래스는 실행클래스와 실행클래스를 도와주는 클래스로 공부하는 항목마다 2개의 클래스 이상이 존재할것임. 유의바람


	//인스턴스 변수를 선언
	//public이 붙으면 클래스 안에서 사용할 수 있고
	//인스턴스를 만들어서 인스턴스를 이용해서 사용이 가능
	public int num;
	public String name;
	public int kor;
	public int mat;
	boolean gender;
	
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student1.schoolName = schoolName;
	}

	public int eng;
	
	//학교 이름을 저장하기 위한 변수
	//static이 붙으면 하나만 만들어서 공유
	public static String schoolName;