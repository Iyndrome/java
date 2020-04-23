
public class IntenceVariable {

	public static void main(String[] args) {
		//Student 클래스의 인스턴스를 생성
		//클래스이름 변수명 = new 클래스이름();
		Student obj1 = new Student();
		//인스턴스를 이용해서 프로퍼티 접근
		obj1.num = 1;
		obj1.name = "인수정";
		
		//다른 인스턴스 생성
		Student obj2 = new Student();
		obj2.num = 2;
		obj2.name = "유치송";
		
		//클래스 안에 static 없이 만들어진 변수는 인스턴스 마다 별도로 생성
		//메인은 실행일뿐 내용은 실행을 도와줄 다른 클래스에 넣는것이 기본이다. 지금은 공부중이니 메인 클래스에도 많이 있는것!
		System.out.println(obj1.name);
		System.out.println(obj2.name);

	}

}
