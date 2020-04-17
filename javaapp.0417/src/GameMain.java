
public class GameMain {

	public static void main(String[] args) {
		//Game 클래스의 인스턴스 만들기 
		Game g1 = new Game();
		g1.setName("디아블로");
		g1.setNation("USA");
		g1.setPrice(30000);
		
		//새로운 인스턴스를 만들고 데이터 저장
		Game g2 = new Game();
		g2.setName("소닉");
		g2.setNation("JPN");
		g2.setPrice(20000);
		
		//g2의 price를 가져와서 5000을 더한 후 다시 설정 
		int temp = g2.getPrice(); //가져올때는 getter을 사용해 가져오고
		g2.setPrice(temp + 5000); //변경후 닫을땐 setter을 사용하자
		
		Game g3 = new Game();
		g3.setProperty("임진록", "KOR", 12000);
		g3.display();
		
		Game g4 = new Game();
		g4.setProperty("삼국지", 15000);
		g4.display();
		
		// g3, g4를 Method Overloading 이라고 한다

	}

}
