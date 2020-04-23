
public class StaticVariable {

	public static void main(String[] args) {
		Student1 obj1 = new Student1();
		Student1 obj2 = new Student1();
		obj1.name = "그리즈만";
		obj2.name = "호날두";
		
		//되도록이면 클래스이름으로 접근
		//obj1.schoolName = "FR";
		//obj2.schoolName = "FO";
		
		System.out.println(
				obj1.schoolName + ":" + obj1.name);
		System.out.println(
				obj2.schoolName + ":" + obj2.name);
		//static이기 때문에 인스턴스 때와 달리 결과값인 그리즈만과 호날두가 둘다 FO로 한곳을 따른다.

	}

}
