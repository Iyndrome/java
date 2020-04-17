
public class Game {
	
	   //게임명, 수출국, 판매가를 저장할 프로퍼티 생성
	   //인스턴스가 직접 핸들링 할 수 없도록 private으로 생성한것
	   private String name;
	   private String nation;
	   private int price;
	   //전체 제목으로 사용할 변수를 생성
	   //전체가 공통된 이름을 사용하기 때문에 static을 사용한것
	   //변경할 수 없도록 final을 붙인것
	   private static final String title = 
			   "게임 리스트";
	   
	   //property를 private 으로 만들어서 인스턴스가 사용할 수 없기 때문에 
	   //instance가 사용할 수 있도록 접근자 메소드를 생성
	   //접근자 메소드 - getter, setter
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static String getTitle() {
		return title;
	}
	   
	    //이름, 나라, 가격 을 받아서 set하는 메소드
	public void setProperty(
			String name, String nation, int price) {

		//메소드의 매개변수가 name, nation, price
		//Property 이름도 name, nation, price
		//메소드 안에서 만든 지역변수가 아닌 Property를 가져 올때는
		//this. 을 붙여서 가져오면 됩니다. this를 생략하면 메소드 안에서 찾고 없으면 Property로 갑니다
		this.name = name;
		this.nation = nation;
		this.price = price;
	}
	
	
	//게임명과 수출국만 입력받고 팀은 FA로 설정하는 메소드
	//위에 String, String, int를 매개변수로 하는 setProperty가 이미 존재
	//String, int를 매개변수로 받는 setProperty
	//이런 경우를 MethodOverloading이라고 합니다.
	public void setProperty(
			String name, int price) {
		this.name = name;
		this.price = price;
		this.nation = "FA";
	}
	
	
	//게임명과 수출국, 판매가를 출력하는 메소드
	public void display() {
		System.out.println("게임명:" + name + "수출국:" + nation + "판매가(단위-원):" + price);
		
	}
	
			

	   
}
