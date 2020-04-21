package Datashare;

public class Main {

	public static void main(String[] args) {
		//클래스의 인스턴스 2개 생성
		//클래스이름(Practice) temp1(변수명) = new 클래스이름(Practice)();
		Practice temp1 = new Practice();
		Practice temp2 = new Practice();
		
		//noShare는 인스턴스 프로퍼티이므로 변경해도 다른 인스턴스에는 아무런 영향이 없다.
		temp1.noShare = "하이 temp2";
		
		System.out.println(temp2.noShare); //아무런 영향이 없기에 출력값은 null이 나온다
		
		temp1.msg = "이번엔 공유가능";		
		System.out.println(temp2.msg); 
		
		temp1.globalChange();
		System.out.println(Globalclass.globalMsg); 
		
		Singleton s1 = Singleton.sharedInstance();
		Singleton s2 = Singleton.sharedInstance();
		
		//2개의 인스턴스가 동일한 지 확인은 해시코드를 이용
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		Singleton.sharedInstance().sharedVariable = "Singleton";
		
		Parent p = new Parent();
		
		
		//docs/index홈페이지 공부간에 나온 코드 설명해주면서 출력값 보여주는것 
		System.out.println(Thread.MAX_PRIORITY);
		
		int result = Math.max(20, 30);
		System.out.println(result);

	}

}
