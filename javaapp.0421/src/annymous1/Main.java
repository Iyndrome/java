package annymous1;

public class Main {

	public static void main(String[] args) {
		Anony1Ex obj = new Anony1Ex();
		obj.method();
		
		//추상클래스와 인터페이스는 인스턴스를 만들 수가 없다.
		//Anony1 클래스를 상속받는 Anonymous class
		Anony1 obj1 = new Anony1() {

			@Override
			public void method() {
				System.out.println("Anonymous를 이용한 상속 구현");
				
			}
			
		};
		obj1.method();
	}

}
